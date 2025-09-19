import axios from 'axios';

const viaCepApi = axios.create({
  baseURL: 'https://viacep.com.br/ws',
  timeout: 5000,
});

export default viaCepApi;
