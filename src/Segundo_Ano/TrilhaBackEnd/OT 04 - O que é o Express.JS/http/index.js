import express from 'express';
const app = express();
app.listen(3000,() => console.log('Servidor iniciado na porta 3000'));

app.get('/',(req,res) => 
res.send('<h1 style="color: blue">CRIANDO UM SERVIDOR COM EXPRESS.JS</h1>'));

app.get('/sobre',(req1,res1) => 
res1.send('<h1 style="color: blue">PÁGINA SOBRE</h1>'));

app.get('/contato',(req2,res2) => 
res2.send('<h1 style="color: blue">PÁGINA CONTATO</h1>'));

app.get('/empresa',(req3,res3) => 
res3.send('<h1 style="color: blue">PÁGINA DA EMPRESA</h1>'));