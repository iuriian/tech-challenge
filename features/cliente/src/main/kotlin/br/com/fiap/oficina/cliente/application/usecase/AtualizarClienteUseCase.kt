package br.com.fiap.oficina.cliente.application.usecase

import br.com.fiap.oficina.cliente.domain.Cliente

interface AtualizarClienteUseCase {
    fun executar(cliente: Cliente): Cliente
}
