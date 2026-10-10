package br.com.fiap.oficina.shared.domain.valueobject

abstract class Document {
    abstract val valor: String
    abstract val tipo: TipoDocumento

    abstract fun formatado(): String

    final override fun toString(): String = "${tipo.name}(${formatado()})"

    companion object {
        private val NAO_DIGITOS = Regex("\\D")

        fun normalizar(entrada: String): String = entrada.replace(NAO_DIGITOS, "")

        fun from(
            valor: String,
            tipo: TipoDocumento,
        ): Document =
            when (tipo) {
                TipoDocumento.CPF -> CPF(valor)
                TipoDocumento.CNPJ -> CNPJ(valor)
            }
    }
}

enum class TipoDocumento {
    CPF,
    CNPJ,
}
