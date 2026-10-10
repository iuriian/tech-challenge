package br.com.fiap.oficina.shared.application.mapper

interface ApplicationMapper<Domain, Request, Response> {
    fun toDomain(request: Request): Domain

    fun toResponse(domain: Domain): Response
}
