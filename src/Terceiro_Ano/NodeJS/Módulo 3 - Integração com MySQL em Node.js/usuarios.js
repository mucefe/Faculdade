const pool = require('conexao.js');

async function listarUsuarios() {
    const [rows] = await pool.query('SELECT * FROM usuarios');
    return rows;
}

module.exports = {listarUsuarios};