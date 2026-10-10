package br.com.fiap.oficina.shared.domain.valueobject

internal object DigitoVerificador {
    private const val MODULO = 11
    private const val RESTO_MINIMO_SEM_DIGITO = 2

    fun validar(
        valor: String,
        tamanho: Int,
        pesosPrimeiroDigito: IntArray,
        pesosSegundoDigito: IntArray,
    ): Boolean {
        if (valor.length != tamanho || !valor.all(Char::isDigit)) return false
        if (valor.all { it == valor[0] }) return false

        val primeiroDigito = tamanho - 2
        val segundoDigito = tamanho - 1

        val primeiro = calcular(valor.take(primeiroDigito), pesosPrimeiroDigito)
        if (primeiro != valor[primeiroDigito].digitToInt()) return false

        val segundo = calcular(valor.take(segundoDigito), pesosSegundoDigito)
        return segundo == valor[segundoDigito].digitToInt()
    }

    private fun calcular(
        base: String,
        pesos: IntArray,
    ): Int {
        val soma = base.foldIndexed(0) { i, acc, digito -> acc + digito.digitToInt() * pesos[i] }
        val resto = soma % MODULO
        return if (resto < RESTO_MINIMO_SEM_DIGITO) 0 else MODULO - resto
    }
}
