# Documentação da API de Produtos

Esta API permite o gerenciamento de produtos através de operações para listar, criar, atualizar e excluir produtos.

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
