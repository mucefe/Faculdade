const express = require("express");

const app = express();

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

app.listen(3080,() => {
    console.log("Servidor rodando!")
})