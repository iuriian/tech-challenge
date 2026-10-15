package br.com.fiap.oficina.cliente.infrastructure.config

import br.com.fiap.oficina.cliente.infrastructure.mapper.ClienteJPAMapper
import br.com.fiap.oficina.cliente.infrastructure.mapper.ContatoJPAMapper
import br.com.fiap.oficina.cliente.infrastructure.mapper.EnderecoJPAMapper
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
internal class ClienteConfig {
    @Bean
    fun clienteJpaMapper(): ClienteJPAMapper = ClienteJPAMapper()

    @Bean
    fun enderecoJpaMapper(): EnderecoJPAMapper = EnderecoJPAMapper()

    @Bean
    fun contatoJpaMapper(): ContatoJPAMapper = ContatoJPAMapper()
}
