# Front-end (React + TypeScript, gerado com Lovable)

O front-end é gerado com o Lovable a partir dos protótipos em `docs/prototipos/` e **consome a API REST em Java** (não usar back-end próprio do Lovable/Supabase).

## Regras
- URL da API em variável de ambiente: `VITE_API_URL` (ex.: `http://localhost:8080`).
- Token JWT enviado em `Authorization: Bearer <token>`.
- Durante o desenvolvimento, usar dados fictícios; nunca documentos reais.
- Código gerado deve ser revisado e versionado neste diretório.

## Prompt-base sugerido para o Lovable
"Crie um site responsivo em React + TypeScript chamado Chama Aí, mobile first, paleta verde (#1B7F5C) e laranja (#F2A541), com as telas dos protótipos em docs/prototipos. Todas as chamadas de dados devem usar fetch para a API REST em VITE_API_URL, enviando o JWT no cabeçalho Authorization. Não use Supabase."
