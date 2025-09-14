const express = require('express');
const cors = require('cors');
const app = express();
const port = 3000;
const usuariosPadrao = [
  { id: 1, nome: 'João', email: 'joao@email.com' },
  { id: 2, nome: 'Maria', email: 'maria@email.com' }
];
app.use(cors());
app.use(express.json());


let usuarios = [
  { id: 1, nome: 'João', email: 'joao@email.com' },
  { id: 2, nome: 'Maria', email: 'maria@email.com' }
];
usuarios = [...usuariosPadrao];

app.get('/usuarios', (req, res) => {
  res.json(usuarios);
});


app.post('/usuarios', (req, res) => {
  const { nome, email } = req.body;
  if (!nome || !email) {
    return res.status(400).json({ erro: 'Nome e email são obrigatórios.' });
  }
  
  const novoUsuario = {
    id: usuarios.length > 0 ? usuarios[usuarios.length - 1].id + 1 : 1,
    nome,
    email
  };

  usuarios.push(novoUsuario);
  res.status(201).json(novoUsuario);
});


app.delete('/usuarios/:id', (req, res) => {
  const id = parseInt(req.params.id);
  const indice = usuarios.findIndex(u => u.id === id);

  if (indice === -1) {
    return res.status(404).json({ erro: 'Usuário não encontrado.' });
  }

  const usuarioRemovido = usuarios.splice(indice, 1);
  res.json({ mensagem: 'Usuário removido com sucesso!', usuario: usuarioRemovido[0] });
});

app.listen(port, () => {
  console.log(`Servidor rodando em http://localhost:${port}`);
});
