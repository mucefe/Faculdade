const express = require("express");
const app = express();

app.listen(3080,() => {
    console.log("Servidor rodando!")
});

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
    {title: "Horizon Zero Chase 2", studio: "Aquiris Game Studio", price:112},
]

app.get("/", (req,res) => {
    res.json(games);
})


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

app.put('/novogame/:index', (req, res) => {
    const { index } = req.params;
    const { title, studio, price } = req.body;

    console.log("Index:", index);
    console.log("Title:", title);
    console.log("Studio:", studio);
    console.log("Price:", price);

    
    if (isNaN(index) || index < 0 || index >= games.length) {
        return res.status(400).send("Índice inválido");
    }

   
    games[index] = { title, studio, price };
    
    
    return res.json(games);
});