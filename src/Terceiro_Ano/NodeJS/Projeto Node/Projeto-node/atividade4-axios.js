const axios = require('axios');

axios.get('https://jsonplaceholder.typicode.com/posts/1')
  .then(response => {
    console.log("Resposta da API:", response.data);
  })
  .catch(error => {
    console.error("Erro na requisição:", error.message);
  });
