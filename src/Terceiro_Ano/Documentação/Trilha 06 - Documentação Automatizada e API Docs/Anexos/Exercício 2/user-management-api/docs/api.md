# Documentação da API de Usuários

Nesta seção, você encontrará a documentação detalhada da API de Gerenciamento de Usuários.

Abaixo está a visualização interativa da especificação OpenAPI, utilizando o Swagger UI. Por meio dela, você pode explorar os endpoints, visualizar parâmetros de entrada, exemplos de requisição e respostas, além de testar a API (caso ela esteja hospedada e com CORS habilitado).

## Visualização da API com Swagger UI

> **Observação:** Se você estiver rodando localmente, é necessário ter o Swagger UI configurado para carregar o arquivo `user_api.yaml`.

### Acesse a documentação interativa:

[ Abrir Swagger UI](https://petstore.swagger.io/?url=https://raw.githubusercontent.com/seu_usuario/seu_repo/main/openapi/user_api.yaml)

> **Se estiver rodando localmente:**  
Copie o arquivo `user_api.yaml` para o diretório do Swagger UI local e abra o Swagger apontando para esse arquivo.

---

## Estrutura da API

A API possui os seguintes endpoints:

- **GET /users** – Listar usuários
- **POST /users** – Criar um novo usuário
- **PUT /users/{id}** – Atualizar um usuário existente
- **DELETE /users/{id}** – Excluir um usuário

--
