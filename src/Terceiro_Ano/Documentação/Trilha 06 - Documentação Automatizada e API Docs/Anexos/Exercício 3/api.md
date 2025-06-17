
# Documentação da API de Produtos

Esta API permite o gerenciamento de produtos através de operações para listar, criar e atualizar registros de produtos.

## Endpoints Disponíveis

### 1. Listar Produtos

- **Método:** GET  
- **Endpoint:** `/products`  
- **Descrição:** Retorna uma lista com todos os produtos cadastrados.  
- **Resposta de Sucesso (200):**
```json
[
  {
    "id": 1,
    "name": "Produto A",
    "price": 100.0
  },
  {
    "id": 2,
    "name": "Produto B",
    "price": 200.0
  }
]
```

---

### 2. Criar um Novo Produto

- **Método:** POST  
- **Endpoint:** `/products`  
- **Descrição:** Cria um novo produto no sistema com nome e preço definidos.  
- **Exemplo de Requisição:**
```json
{
  "name": "Produto C",
  "price": 150.0
}
```
- **Resposta de Sucesso (201):**
```json
{
  "id": 3,
  "name": "Produto C",
  "price": 150.0
}
```

---

### 3. Atualizar um Produto Existente

- **Método:** PUT  
- **Endpoint:** `/products/{id}`  
- **Descrição:** Atualiza os dados de um produto específico, identificado pelo seu ID.  
- **Parâmetros de Caminho:**
  - `id` (integer) – ID do produto a ser atualizado.

- **Exemplo de Requisição:**
```json
{
  "name": "Produto C Atualizado",
  "price": 180.0
}
```
- **Resposta de Sucesso (200):**
```json
{
  "id": 3,
  "name": "Produto C Atualizado",
  "price": 180.0
}
```

---

> **Observação:** Para todos os endpoints, as respostas de erro seguem o padrão HTTP, retornando códigos como 400 (Bad Request), 404 (Not Found) e 500 (Internal Server Error) quando aplicável.
