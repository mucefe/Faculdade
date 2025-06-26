const fs = require('fs');

fs.readFile('user.json', 'utf8', (err, data) => {
  if (err) {
    console.error("Erro ao ler user.json:", err);
    return;
  }
  const usuario = JSON.parse(data);
  console.log("Usuário:", usuario);
});
