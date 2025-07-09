const express = require('express');
const axios = require('axios');
const path = require('path');

const app = express();
const PORT = 3000;


app.set('view engine', 'ejs');
app.set('views', path.join(__dirname, 'views'));


app.get('/', (req, res) => {
  const products = [
    { name: 'Arroz', price: 5.99 },
    { name: 'Feijão', price: 7.49 },
    { name: 'Macarrão', price: 3.89 }
  ];

  res.render('index', {
    title: 'SSR com Node.js',
    message: 'Bem-vindo ao SSR!',
    products
  });
});


app.get('/users', async (req, res) => {
  try {
    const response = await axios.get('https://jsonplaceholder.typicode.com/users');
    const users = response.data;

    res.render('users', {
      title: 'Lista de Usuários',
      users
    });
  } catch (error) {
    console.error('Erro ao buscar usuários:', error);
    res.status(500).send('Erro ao obter dados da API');
  }
});

app.listen(PORT, () => {
  console.log(`Servidor rodando em http://localhost:${PORT}`);
});
