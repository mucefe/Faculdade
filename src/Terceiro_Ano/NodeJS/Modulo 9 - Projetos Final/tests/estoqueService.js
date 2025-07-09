const { registrarMovimentacao } = require('../services/estoqueService');
const Produto = require('../models/Produto');

jest.mock('../models/Produto');

describe('Serviço de Estoque', () => {
  it('deve registrar entrada de estoque corretamente', async () => {
    const produtoMock = {
      id: 1,
      quantidade: 50,
      save: jest.fn()
    };
    Produto.findByPk.mockResolvedValue(produtoMock);

    const resultado = await registrarMovimentacao(1, 'entrada', 10, 1);

    expect(resultado.quantidade).toBe(60);
    expect(produtoMock.save).toHaveBeenCalled();
  });

  it('deve lançar erro para saída maior que estoque', async () => {
    const produtoMock = {
      id: 1,
      quantidade: 5,
      save: jest.fn()
    };
    Produto.findByPk.mockResolvedValue(produtoMock);

    await expect(registrarMovimentacao(1, 'saida', 10, 1))
      .rejects
      .toThrow('Quantidade insuficiente em estoque');
  });
});