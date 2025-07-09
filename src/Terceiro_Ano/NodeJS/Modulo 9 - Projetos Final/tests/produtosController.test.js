const produtosController = require('../controllers/produtosController');
const { mockRequest, mockResponse } = require('./testUtils');

describe('Produtos Controller', () => {
  let req, res;

  beforeEach(() => {
    req = mockRequest();
    res = mockResponse();
  });

  describe('criarProduto', () => {
    it('deve criar um produto com dados válidos', async () => {
      req.body = {
        nome: 'Caneta',
        quantidade: 100,
        preco: 2.5,
        categoria: 'Papelaria'
      };

      await produtosController.criarProduto(req, res);

      expect(res.status).toHaveBeenCalledWith(201);
      expect(res.json).toHaveBeenCalledWith(
        expect.objectContaining({
          nome: 'Caneta',
          quantidade: 100
        })
      );
    });

    it('deve retornar erro 400 com dados inválidos', async () => {
      req.body = { nome: '' }; 

      await produtosController.criarProduto(req, res);

      expect(res.status).toHaveBeenCalledWith(400);
    });
  });

  
});