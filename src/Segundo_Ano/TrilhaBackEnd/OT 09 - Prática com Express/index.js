import express from 'express';
const app = express();

app.use(express.urlencoded({ extended: true }));

var carros = [
        {
            nome: "Fiat Uno",
            preco: "50000",
            marca: "Fiat"
        },
        {
            nome: "Volkswagen Gol",
            preco: "55000",
            marca: "Volkswagen"
        },
        {
            nome: "Chevrolet Onix",
            preco: "60000",
            marca: "Chevrolet"
        },
        {
            nome: "Ford Ka",
            preco: "52000",
            marca: "Ford"
        },
        {
            nome: "Renault Kwid",
            preco: "48000",
            marca: "Renault"
        },
        {
            nome: "Honda Civic",
            preco: "80000",
            marca: "Honda"
        },
        {
            nome: "Hyundai HB20",
            preco: "58000",
            marca: "Hyundai"
        }
    ];

// Rota inicial, retorna uma mensagem simples
app.get('/', (req, res) => res.send("<h3>Rotas no Express</h3><p>Rota '/'</p>"));

// Rota sobre, retorna uma mensagem sobre rotas no Express
app.get('/sobre', (req, res) => res.send("<h3>Rotas no Express</h3><p>Vamos aprender a utilizar Rotas com Express '/'</p>"));

// Rota para exibir um usuário específico, retorna o nome do usuário fornecido
app.get('/users/:name', (req, res) => res.json([req.params.name]));

// Rota para exibir todos os carros, retorna um array com todos os carros
app.get('/cars', (req, res) => res.json(carros));

// Rota para adicionar um novo carro, adiciona um novo carro ao array e retorna o carro adicionado
app.post('/cars', (req, res) => {
    const { name, preco, marca } = req.body;
    const novoCarro = { nome: name, preco: preco, marca: marca };
    carros.push(novoCarro);
    return res.json(novoCarro);
});

// Rota para exibir um carro específico pelo seu ID, retorna o carro com o ID fornecido
app.get('/cars/:id', (req, res) => {
    const id = req.params.id;
    return res.json(carros[id]);
});

// Rota para atualizar um carro existente pelo seu ID, atualiza o nome do carro com o ID fornecido e retorna o carro atualizado
app.put('/cars/update/:id', (req, res) => {
    const id = req.params.id;
    const { nome, preco, marca } = req.body;
    carros[id].name = nome;
    carros[id].preco = preco;
    carros[id].marca = marca;

    return res.json(carros[id]);
});

// Rota para excluir um carro pelo seu ID, exclui o carro com o ID fornecido e retorna o carro excluído
app.delete('/cars/delete/:id', (req, res) => {
    const id = req.params.id;
    const deletedCar = carros.splice(id, 1);
    return res.json(deletedCar);
});


app.listen(3000, () =>
    console.log('Servidor iniciado na porta 3000')
);



