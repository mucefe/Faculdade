const express = require("express");
const app = express();

// Middleware para interpretar o corpo das requisições como JSON
app.use(express.json());

let games = [
    {title: "Sea of Thieves", studio: "Rare", price: 30},
    {title: "WOW", studio: "Blizzard", price: 120},
    {title: "Valorant", studio: "Riot", price: 0},
    {title: "COD", studio: "Activision", price: 200},
    {title: "Minecraft", studio: "Mojang", price: 80},
    {title: "Halo", studio: "Microsoft", price: 90},
    {title: "The Sims", studio: "EA Games", price: 0},
    {title: "Assassin's Creed", studio: "Ubisoft", price: 50},
    {title: "Townsmen", studio: "Handygames", price: 50},
    {title: "Dead By Daylight", studio: "Behaviour Interactive", price: 60},
    {title: "Detroit: Become Human", studio: "Quantic Dream", price: 120},
    {title: "GTA V", studio: "Rockstar Games", price: 59},
    {title: "Cities Skylines", studio: "Colossal Order", price: 107},
    {title: "Tibia", studio: "CipSoft", price: 0},
    {title: "Stardew Valley", studio: "ConcernedApe", price: 16},
    {title: "Horizon Zero Chase 2", studio: "Aquiris Game Studio", price: 112},
];

// Rota para obter a lista de todos os jogos
app.get("/", (req, res) => {
    res.json(games);
});

// Rota para adicionar um novo jogo
app.post("/novogame", (req, res) => {
    let title = req.body.title;
    let studio = req.body.studio;
    let price = req.body.price;

    let newGame = {title, studio, price};
    games.push(newGame);

    console.log(title);
    console.log(studio);
    console.log(price);

    res.send("OK");
});

// Rota para atualizar um jogo existente com base no índice
app.put('/novogame/:index', (req, res) => {
    const index = parseInt(req.params.index, 10);
    const { title, studio, price } = req.body;

    console.log("Index:", index);
    console.log("Request Body:", req.body); // Adiciona log para o corpo da requisição

    console.log("Title:", title);
    console.log("Studio:", studio);
    console.log("Price:", price);

    // Verificar se o índice é um número válido
    if (isNaN(index) || index < 0 || index >= games.length) {
        return res.status(400).send("Índice inválido");
    }

    // Verificar se todas as propriedades necessárias estão presentes no corpo da requisição
    if (typeof title === 'undefined' || typeof studio === 'undefined' || typeof price === 'undefined') {
        return res.status(400).send("Dados inválidos no corpo da requisição");
    }

    // Atualizar o jogo no array
    games[index] = { title, studio, price };

    return res.json(games);
});

// Inicia o servidor na porta 3080
app.listen(3080, () => {
    console.log("Servidor rodando!");
});
