import express from 'express';
const app = express();

app.use(express.urlencoded({ extended: true }));

app.use(express.json());

var carros = [
    { nome: "Fiat Uno", preco: "50000", marca: "Fiat" },
    { nome: "Volkswagen Gol", preco: "55000", marca: "Volkswagen" },
    { nome: "Chevrolet Onix", preco: "60000", marca: "Chevrolet" },
    { nome: "Ford Ka", preco: "52000", marca: "Ford" },
    { nome: "Renault Kwid", preco: "48000", marca: "Renault" },
    { nome: "Honda Civic", preco: "80000", marca: "Honda" },
    { nome: "Hyundai HB20", preco: "58000", marca: "Hyundai" }
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
    const { nome, preco, marca } = req.body;
    const novoCarro = { nome, preco, marca };
    carros.push(novoCarro);
    return res.json(novoCarro);
});

// Rota para exibir um carro específico pelo seu ID, retorna o carro com o ID fornecido
app.get('/cars/:id', (req, res) => {
    const id = parseInt(req.params.id, 10);
    if (id < 0 || id >= carros.length) {
        return res.status(404).send("Carro não encontrado");
    }
    return res.json(carros[id]);
});

app.put('/cars/update/:id', (req, res) => {
    const id = parseInt(req.params.id, 10);
    const { nome, preco, marca } = req.body;

    console.log("ID:", id);
    console.log("Nome:", nome);
    console.log("Preço:", preco);
    console.log("Marca:", marca);

    
    if (!nome || !marca) {
        console.log("Dados inválidos: nome ou marca ausentes.");
        return res.status(400).send("Dados inválidos: nome ou marca ausentes.");
    }

   
    const precoNumber = preco !== undefined ? parseFloat(preco) : 0;

    
    if (isNaN(precoNumber)) {
        console.log("Preço inválido:", preco);
        return res.status(400).send("Preço inválido: " + preco);
    }

    carros[id].nome = nome;
    carros[id].preco = precoNumber;
    carros[id].marca = marca;

    console.log("Carro atualizado:", carros[id]);
    return res.status(200).json(carros[id]);
});



// Rota para excluir um carro pelo seu ID, exclui o carro com o ID fornecido e retorna o carro excluído
app.delete('/cars/delete/:id', (req, res) => {
    const id = parseInt(req.params.id, 10);
    if (id < 0 || id >= carros.length) {
        return res.status(404).send("Carro não encontrado");
    }
    const deletedCar = carros.splice(id, 1);
    return res.json(deletedCar);
});

app.listen(3000, () => {
    console.log('Servidor iniciado na porta 3000');
});