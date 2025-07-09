require('dotenv').config(); // Corrigido: carregar .env antes de usar process.env

const mysql = require('mysql2');

const connection = mysql.createConnection({
    host: process.env.DB_HOST,
    user: process.env.DB_USER,
    password: process.env.DB_PASS,
    database: process.env.DB_NAME
});

connection.connect((err) => { 
    if (err) {
        console.error('Erro ao conectar ao MySQL', err);
        return;
    }
    console.log('Conectado ao MySQL com sucesso!');
});

connection.query('SELECT * FROM usuarios', (err, results) => {
    if (err) {
        console.error('Erro ao executar consulta:', err);
        return;
    }
    console.log('Resultados:', results);
});

const mysql1 = require('mysql2/promise'); 

async function executarConsulta() {
    const connection = await mysql1.createConnection({
        host: process.env.DB_HOST,
        user: process.env.DB_USER,
        password: process.env.DB_PASS,
        database: process.env.DB_NAME
    });

    const [rows] = await connection.execute('SELECT * FROM usuarios');
    console.log(rows);
}

executarConsulta();

const usuario = { nnome: 'João', email: 'joao@email.com'};
connection.query('INSERT INTO usuarios (nome, email) VALUES (?,?)', [usuario.nnome,usuario.email], (err) => {
    if(err){
        console.error('Erro ao inserir dados:',err);
        return;
    }
    console.log('Usuário inserido com sucesso!');
});

connection.query('SELECT * FROM usuarios',(err,results) => {
    if(err) throw err;
    console.log(results);
});

connection.query('UPDATE usuarios SET nome = ? WHERE id = ?',['Carlos',1],(err) =>
{
    if (err) throw err;
    console.log('Usuário atualizado com sucesso!');
});

const nome = 'Carlos';
connection.query('SELECT * FROM usuarios WHERE nome = ?',[nome],(err,results) => {
    if (err) throw err;
    console.log(results);
});

connection.query('DELETE FROM usuarios WHERE id = ?',[1],(err) => {
    if (err) throw err;
    console.log('Usuário excluído com sucesso!');
})

const pool = mmysql.createPool({
    host: process.env.DB_HOST,
    user: process.env.DB_USER,
    password: process.env.DB_PASS,
    database: process.env.DB_NAME,
    waitForConnections: true,
    connectionLimit: 10
});

pool.query('SELECT * FROM usuarios', (err, results) => {
    if (err) throw err;
    console.log(results);
});

