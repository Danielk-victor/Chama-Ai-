# Padrões de desenvolvimento

## Git
- Branches: `main` (estável, protegida), `develop` (integração), `feature/<id>-<descricao>`, `fix/<descricao>`.
- Commits no padrão **Conventional Commits** (em português): `feat: cadastro de usuário`, `fix: valida horário passado`, `docs:`, `test:`, `refactor:`, `chore:`.
- Todo código entra por **Pull Request** (mesmo com equipe de uma pessoa), com checklist da Definição de Pronto.

## Código Java
- Java 21, estilo Google Java Style (indentação de 4 espaços), linhas de até 120 colunas.
- Nomes de domínio em português sem acento (`Agendamento`, `PerfilPrestador`); sufixos técnicos em inglês (`Controller`, `Service`, `Repository`).
- Pacote por funcionalidade (`auth`, `usuario`, `prestador`, `documento`, `agendamento`, `admin`, `catalogo`, `compartilhado`).
- Controllers finos: sem regra de negócio. Regras (RN01–RN16) ficam nos `Service`.
- Entidades JPA nunca são expostas na API: usar DTOs (`record`) de entrada e saída.
- Validação com Bean Validation (`@NotBlank`, `@Email`, ...). Erros no formato RFC 7807 (Problem Details).

## Banco de dados
- Alterações somente por migrações Flyway versionadas (`V3__descricao.sql`); nunca editar migração já aplicada.
- `spring.jpa.hibernate.ddl-auto=validate` em todos os ambientes (exceto testes com H2).

## API
- Prefixo `/api`, JSON, nomes de recursos no plural e em português (`/api/agendamentos`).
- Autenticação: `Authorization: Bearer <JWT>`. Documentar com OpenAPI (springdoc).

## Testes
- JUnit 5 + Mockito para regras de negócio nos `Service`; `@WebMvcTest`/`@SpringBootTest` para endpoints críticos.
- Meta inicial: cobrir as regras RN04, RN05, RN06, RN07, RN12–RN14.

## Segurança
- Segredos apenas em variáveis de ambiente (`.env` não é versionado).
- Documentos de identificação reais nunca entram no repositório, em testes ou em prompts de IA.

## Uso de IA
- Todo código gerado por IA (Claude, Lovable) deve ser lido, entendido e testado antes do commit. Registrar usos relevantes conforme o Plano de Utilização de IA.
