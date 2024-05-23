import express from 'express';
import { buscarufs, buscarufporid, buscarufspornome } from './Servicos/servicos.js'; // Caminho ajustado

const app = express();

app.get('/ufs', (req, res) => {
    const nomeuf = req.query.busca;
    const resultado = nomeuf ? buscarufspornome(nomeuf) : buscarufs();
    if (resultado.length > 0) {
        res.json(resultado);
    } else {
        res.status(404).send({"erro": "Nenhuma UF encontrada"});
    }
});

app.get('/ufs/:iduf', (req, res) => {
    const uf = buscarufporid(req.params.iduf);  
    if (uf) {
        res.json(uf);
    } else if (isNaN(parseInt(req.params.iduf))) {
        res.status(400).send({"erro": "Requisição inválida"});
    } else {
        res.status(404).send({"erro": "UF não encontrada"});
    }
});

app.listen(8080, () => {
    console.log('Servidor iniciado na porta 8080');
});
