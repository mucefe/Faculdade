const mysql = require('mysql2');

const connection = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: 'sua_senha',
    database: 'projeto_node'
});

connection.connect((err) => {
    if (err) throw err;
    console.log('Conectado ao MySQL!');
});

application.get('/users', (req,res) => {
    connection.query('SELECT * FROM usuarios', (err,resuklts) =>{
        if(err) {
            res.status(500).send(err);
            return;
        }
        res.json(results);
    });
});