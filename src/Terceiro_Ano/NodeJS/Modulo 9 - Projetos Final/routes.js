const express = require('express');
const axios = require('axios');
const router = express.Router();
const authMiddleware = require('./middlewares/auth');
const roleMiddleware = require('./middlewares/role');
const produtosController = require('./controllers/produtosController');
const estoqueController = require('./controllers/estoqueController');
const relatoriosController = require('./controllers/relatoriosController');
const usuariosController = require('./controllers/usuariosController');

// Rotas públicas
router.post('/login', usuariosController.login);
router.post('/register', usuariosController.register);

// Middleware global de autenticação
router.use(authMiddleware);

// PRODUTOS
router.post('/produtos', roleMiddleware(['admin']), produtosController.criarProduto);
router.get('/produtos', produtosController.listarProdutos);
router.get('/produtos/:id', produtosController.obterProduto);
router.put('/produtos/:id', roleMiddleware(['admin']), produtosController.atualizarProduto);
router.delete('/produtos/:id', roleMiddleware(['admin']), produtosController.deletarProduto);

// ESTOQUE
router.post('/estoque/entrada', roleMiddleware(['admin']), estoqueController.entrada);
router.post('/estoque/saida', roleMiddleware(['admin']), estoqueController.saida);

// RELATÓRIOS
router.get('/relatorios/mais-vendidos', relatoriosController.maisVendidos);
router.get('/relatorios/estoque-baixo', relatoriosController.estoqueBaixo);

// USUÁRIOS
router.get('/usuarios', roleMiddleware(['admin']), usuariosController.listarUsuarios);
router.put('/usuarios/me', usuariosController.atualizarPerfil);

// API EXTERNA - Consulta de endereço via CEP (ViaCEP)
router.get('/externo/endereco/:cep', async (req, res) => {
    try {
        const cep = req.params.cep;
        const response = await axios.get(`https://viacep.com.br/ws/${cep}/json/`);

        if (response.data.erro) {
            return res.status(404).json({ erro: 'CEP não encontrado' });
        }

        res.json(response.data);
    } catch (error) {
        res.status(500).json({ erro: 'Erro ao consultar o CEP' });
    }
});

module.exports = router;
