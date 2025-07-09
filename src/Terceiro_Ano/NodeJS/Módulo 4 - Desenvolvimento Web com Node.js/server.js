const express = require('express');
const app = express();

app.get('/',(req,res) => {
    res.send('Bem vindo ao servidor Express.js');
});

const PORT = 3000;
app.listen(PORT, () =>{
    console.log(`Servidor rodando na porta ${PORT}`);
});

app.get('/users',(req,res) => {
    res.json({message: 'Listando usuários'});
});

app.post('/users/:id', (req,res) => {
    res.json({message: 'Usuário criado'});
});

app.put('/users/:id', (req,res) =>{
    res.json({message: `Usuário ${req.params.id} atualizado`});
});

app.delete('/users/:id', (req,res) => {
    res.json({message: `Usuário ${req.params.id} excluído`});
});