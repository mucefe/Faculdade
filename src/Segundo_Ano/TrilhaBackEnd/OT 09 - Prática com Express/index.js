import express from 'express';

const app = express();

var carros = [
    {
        nome: "Fiat Uno",
        preco: 50000,
        marca: "Fiat"
    },
    {
        nome: "Volkswagen Gol",
        preco: 55000,
        marca: "Volkswagen"
    },
    {
        nome: "Chevrolet Onix",
        preco: 60000,
        marca: "Chevrolet"
    },
    {
        nome: "Ford Ka",
        preco: 52000,
        marca: "Ford"
    },
    {
        nome: "Renault Kwid",
        preco: 48000,
        marca: "Renault"
    },
    {
        nome: "Hyundai HB20",
        preco: 58000,
        marca: "Hyundai"
    }
];


app.use(express.urlencoded({ extended: true}));

app.get('/', (req, res) =>
    res.send("<h3>Rotas no Express</h3><p>Rota '/'")
);

app.get('/sobre', (req, res) =>
    res.send("<h3>Rotas no Express</h3><p>Vamos aprender a utilizar Rotas com Express '/'")
);

app.get('/users/:name', (req,res) => {
    return res.json([req.params.name]);
});
app.get('/cars', (req,res) => {
    return carros.toString;
});

app.post('/cars/',(req,res) =>{
    let name = req.body.name;
    carros[(carros.length)] = name;
    return res.json([carros[(carros.length -1)]]);
})

app.get('/cars/:id', (req, res) => {
    let id = req.params.id;
    return res.json([carros[id]])
});

app.listen(3000, () =>
    console.log('Servidor iniciado na porta 3000')
);

app.put('/cars/update/:id',(req,res) => {
    let name = req.body.name;
    carros[req.params.id] = name;
    return res.json(carros[req.params.id]);
});

app.delete('/cars/delete/:id', (req,res) =>{
    let id = req.params.id;
    carros[id] = null; //deletar item
    return res.json(carros[id]);
});

