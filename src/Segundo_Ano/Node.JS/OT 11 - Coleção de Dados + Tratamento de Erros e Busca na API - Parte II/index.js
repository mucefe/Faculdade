import express from 'express';
import colecaoUf from './dados.js';

const app = express();

app.get('/ufs', (req, res) => {
    res.json(colecaoUf);
});

app.get('/ufs/:iduf', (req, res) => {
    const idUf = parseInt(req.params.iduf);  // Corrigido de idUf para iduf
    const uF = colecaoUf.find(u => u.id === idUf);  // Removidos parênteses extras
    
    if (uF) {
        res.json(uF);
    } else {
        res.status(404).json({ error: 'UF não encontrada' });
    }
});

app.listen(8080, () => {
    console.log('Servidor iniciado na porta 8080');
});
