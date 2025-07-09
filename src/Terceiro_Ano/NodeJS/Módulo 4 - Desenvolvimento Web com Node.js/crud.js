// Create
app.post('/users', (req, res) => {
    const { nome, email } = req.body;
    connection.query("INSERT INTO usuarios (nome, email) VALUES (?, ?)", [nome, email], (err) => {
        if (err) {
            res.status(500).send(err);
            return;
        }
        res.status(201).send("Usuário criado com sucesso!");
    });
});

// Read
app.get('/users', (req, res) => {
    connection.query("SELECT * FROM usuarios", (err, results) => {
        if (err) {
            res.status(500).send(err);
            return;
        }
        res.json(results);
    });
});

// Update
app.put('/users/:id', (req, res) => {
    const { nome, email } = req.body;
    connection.query("UPDATE usuarios SET nome = ?, email = ? WHERE id = ?", [nome, email, req.params.id], (err) => {
        if (err) {
            res.status(500).send(err);
            return;
        }
        res.send("Usuário atualizado com sucesso!");
    });
});

// Delete
app.delete("/users/:id", (req, res) => {
    connection.query("DELETE FROM usuarios WHERE id = ?", [req.params.id], (err) => {
        if (err) {
            res.status(500).send(err);
            return;
        }
        res.send("Usuário excluído com sucesso!");
    });
});

app.get('/users',(req,res) =>{
    const nome = req.query.nome;
    connection.query('SELECT * FROM usuarios WHERE nome = ?',[nome],(err,results) =>{
        if (err) {
            res.status(500).send(err);
            return;
        }
        res.json(results);
    });
});

app.get('/users', (req, res) => {
    const nome = req.query.nome;
    connection.query('SELECT * FROM usuarios WHERE nome = ?', [nome], (err, results) => {
        if (err) {
            res.status(500).send(err);
            return;
        }
        res.json(results);
    });
});

const EventEmitter = require('events');

const myEmitter = new EventEmitter();
myEmitter.on('greet',(name) => {
    console.log(`Olá, ${name}!`);
});

myEmitter.emit('greet', 'João');

