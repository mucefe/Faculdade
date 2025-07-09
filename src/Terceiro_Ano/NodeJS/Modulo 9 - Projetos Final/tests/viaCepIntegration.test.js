const axios = require('axios');
const { consultarCEP } = require('../services/cepService');

jest.mock('axios');

describe('Integração ViaCEP', () => {
  it('deve retornar endereço para CEP válido', async () => {
    const mockResponse = {
      data: {
        cep: '01001-000',
        logradouro: 'Praça da Sé'
      }
    };
    axios.get.mockResolvedValue(mockResponse);

    const endereco = await consultarCEP('01001000');

    expect(endereco).toEqual(mockResponse.data);
    expect(axios.get).toHaveBeenCalledWith('https://viacep.com.br/ws/01001000/json/');
  });

  it('deve lançar erro para CEP inválido', async () => {
    axios.get.mockRejectedValue(new Error('CEP inválido'));

    await expect(consultarCEP('00000000')).rejects.toThrow('CEP inválido');
  });
});