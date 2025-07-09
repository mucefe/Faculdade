# Documentação Técnica do Sistema de Controle de Estoque

## 1. Descrição do Sistema

Este sistema tem como objetivo realizar o **controle de estoque** de produtos em uma organização, oferecendo funcionalidades para **cadastro, movimentação e análise** de produtos armazenados. Além disso, conta com um sistema de **autenticação baseado em JWT**, com diferentes **níveis de permissão (admin e usuário comum)**, e integração com uma API externa para busca de endereços por CEP (ViaCEP).

### Principais funcionalidades:

* Cadastro de produtos com nome, quantidade, preço e categoria.
* Controle de entrada e saída de estoque.
* Geração de relatórios: produtos mais vendidos e produtos com estoque baixo.
* Cadastro e gestão de usuários com controle de acesso baseado em papel.
* Consulta de endereço via CEP (integração com API ViaCEP).

## 2. Diagrama de Relacionamento de Dados

### Tabelas principais:

**usuarios**

* id (PK)
* nome
* email (unique)
* senha\_hash
* role (admin ou usuario)

**produtos**

* id (PK)
* nome
* quantidade
* preco
* categoria

**movimentacoes\_estoque**

* id (PK)
* produto\_id (FK -> produtos.id)
* tipo ('entrada' ou 'saida')
* quantidade
* data
* usuario\_id (FK -> usuarios.id)

**vendas** *(opcional para relatório de mais vendidos)*

* id (PK)
* produto\_id (FK -> produtos.id)
* quantidade
* data\_venda

### Relacionamentos:

* Um **usuário** pode realizar várias movimentações de estoque.
* Um **produto** pode ter várias movimentações.
* Vendas também estão ligadas a produtos para gerar relatórios.

## 3. Detalhamento de Endpoints

### Autenticação e Usuários

| Método | Rota         | Descrição                        | Exemplo                                                 |
| ------ | ------------ | -------------------------------- | ------------------------------------------------------- |
| POST   | /login       | Autentica usuário e gera JWT     | `{ "email": "a@a.com", "senha": "123" }`                |
| POST   | /register    | Cadastra novo usuário            | `{ "nome": "Ana", "email": "a@a.com", "senha": "123" }` |
| GET    | /usuarios    | Lista todos os usuários (admin)  | Header: Authorization: Bearer TOKEN                     |
| PUT    | /usuarios/me | Atualiza dados do usuário logado | `{ "nome": "Ana Silva" }`                               |

### Produtos

| Método | Rota           | Descrição                    | Exemplo                                                                           |
| ------ | -------------- | ---------------------------- | --------------------------------------------------------------------------------- |
| POST   | /produtos      | Cria um novo produto (admin) | `{ "nome": "Caneta", "quantidade": 100, "preco": 2.5, "categoria": "Papelaria" }` |
| GET    | /produtos      | Lista todos os produtos      | -                                                                                 |
| GET    | /produtos/\:id | Busca um produto por ID      | /produtos/1                                                                       |
| PUT    | /produtos/\:id | Atualiza um produto (admin)  | `{ "quantidade": 150 }`                                                           |
| DELETE | /produtos/\:id | Remove um produto (admin)    | -                                                                                 |

### Controle de Estoque

| Método | Rota             | Descrição                   | Exemplo                                 |
| ------ | ---------------- | --------------------------- | --------------------------------------- |
| POST   | /estoque/entrada | Registra entrada de estoque | `{ "produto_id": 1, "quantidade": 50 }` |
| POST   | /estoque/saida   | Registra saída de estoque   | `{ "produto_id": 1, "quantidade": 10 }` |

### Relatórios

| Método | Rota                      | Descrição                        |
| ------ | ------------------------- | -------------------------------- |
| GET    | /relatorios/mais-vendidos | Lista os produtos mais vendidos  |
| GET    | /relatorios/estoque-baixo | Lista produtos com estoque baixo |

### Integração com API Externa (ViaCEP)

| Método | Rota                    | Descrição                         | Exemplo                    |
| ------ | ----------------------- | --------------------------------- | -------------------------- |
| GET    | /externo/endereco/\:cep | Consulta endereço a partir do CEP | /externo/endereco/01001000 |



