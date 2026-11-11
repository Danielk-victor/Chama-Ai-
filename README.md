# Chama Aí – Plataforma de Serviços do Interior

Site simples para conectar **prestadores de serviço** (eletricistas, encanadores, pedreiros, babás, faxineiros, diaristas de sítio etc.) a **contratantes** do interior, com perfil público, valores, disponibilidade e **agendamento**. Prestadores enviam um **documento de identificação**, verificado pelo administrador antes de o perfil ser publicado.

Repositório: https://github.com/Danielk-victor/Chama-Ai-

Projeto acadêmico – autor: **Daniel Victor Bezerra**.

## Estrutura

| Pasta | Conteúdo |
|---|---|
| `backend/` | API REST em Java 21 + Spring Boot 3.5 + PostgreSQL (Flyway) |
| `frontend/` | Front-end React/TypeScript gerado com Lovable e integrado à API |
| `docs/` | Artefatos das Macro Entregas (PDFs) e protótipos HTML |
| `.github/workflows/` | Integração contínua (build e testes) |

## Como executar (desenvolvimento)

Pré-requisitos: Java 21, Maven 3.9+ e Docker.

```bash
cp .env.example .env              # ajuste se necessário
docker compose up -d banco        # sobe o PostgreSQL
cd backend
mvn spring-boot:run               # API em http://localhost:8080
```

- Documentação da API (Swagger): http://localhost:8080/swagger-ui.html
- Saúde: http://localhost:8080/actuator/health
- Testes: `mvn verify` (usam H2; as migrações Flyway são validadas rodando contra o PostgreSQL do Docker)

## Documentação

Veja a pasta `docs/` e o arquivo `CONTRIBUTING.md` (padrões de desenvolvimento).

## Aviso de privacidade

Documentos de identificação reais **nunca** devem ser versionados no Git, usados em testes ou enviados a ferramentas de IA.
