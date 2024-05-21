const express = require("express");
const app = express();

app.listen(3080, () => {
    console.log("Servidor rodando!")
});

app.use(express.json());

let games = [
    { title: "Sea of Thieves", studio: "Rare", price: 30 },
    { title: "WOW", studio: "Blizzard", price: 120 },
    { title: "Valorant", studio: "Riot", price: 0 },
    { title: "COD", studio: "Activision", price: 200 },
    { title: "Minecraft", studio: "Mojang", price: 80 },
    { title: "Halo", studio: "Microsoft", price: 90 },
    { title: "The Sims", studio: "EA Games", price: 0 },
    { title: "Assassin's Creed", studio: "Ubisoft", price: 50 },
    { title: "Townsmen", studio: "Handygames", price: 50 },
    { title: "Dead By Daylight", studio: "Behaviour Interactive", price: 60 },
    { title: "Detroit: Become Human", studio: "Quantic Dream", price: 120 },
    { title: "GTA V", studio: "Rockstar Games", price: 59 },
    { title: "Cities Skylines", studio: "Colossal Order", price: 107 },
    { title: "Tibia", studio: "CipSoft", price: 0 },
    { title: "Stardew Valley", studio: "ConcernedApe", price: 16 },
    { title: "Horizon Zero Chase 2", studio: "Aquiris Game Studio", price: 112 },
];

app.get("/", (req, res) => {
    res.json(games);
});

app.post("/novogame", (req, res) => {
    let title = req.body.title;
    let studio = req.body.studio;
    let price = req.body.price;

    let newGame = { title, studio, price };
    games.push(newGame);

    console.log(title);
    console.log(studio);
    console.log(price);

    res.send("OK");
});

app.delete("/:index", (req, res) => {
    const { index } = req.params;
    if (games[index]) {
        games.splice(index, 1);
        return res.json({ message: "O Jogo foi deletado" });
    } else {
        return res.status(404).json({ error: "Jogo não encontrado" });
    }
});

app.put('/novogame/:index', (req, res) => {
    const { index } = req.params;
    let title = req.body.title;
    let studio = req.body.studio;
    let price = req.body.price;

    if (games[index]) {
        games[index] = { title, studio, price };
        return res.json(games);
    } else {
        return res.status(404).json({ error: "Jogo não encontrado" });
    }
});

app.get("/games/:id", (req, res) => {
    const { id } = req.params;
    const game = games[parseInt(id)];
    
    if (game) {
        res.json(game);
    } else {
        res.status(404).json({ error: "Jogo não encontrado" });
    }
});
