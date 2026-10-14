package br.com.fiap.oficina.cliente.domain

internal interface ClienteRepository {
    fun salvar(cliente: Cliente): Cliente

    fun buscarPorId(id: ClienteId): Cliente?

    fun buscarPorDocumento(numero: String): Cliente?

    fun buscarPorNome(nome: String): Cliente?

    fun listarTodos(): List<Cliente>

    fun deletar(id: ClienteId)
}
