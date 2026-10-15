package br.com.fiap.oficina.cliente.infrastructure.config

import br.com.fiap.oficina.cliente.domain.ClienteRepository
import br.com.fiap.oficina.cliente.infrastructure.mapper.ClienteJPAMapper
import br.com.fiap.oficina.cliente.infrastructure.mapper.ContatoJPAMapper
import br.com.fiap.oficina.cliente.infrastructure.mapper.EnderecoJPAMapper
import br.com.fiap.oficina.cliente.infrastructure.persistence.ClienteJPARepository
import br.com.fiap.oficina.cliente.infrastructure.persistence.ClienteRepositoryImpl
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

    @Bean
    fun clienteRepository(
        jpaRepository: ClienteJPARepository,
        mapper: ClienteJPAMapper,
    ): ClienteRepository = ClienteRepositoryImpl(jpaRepository, mapper)
}
