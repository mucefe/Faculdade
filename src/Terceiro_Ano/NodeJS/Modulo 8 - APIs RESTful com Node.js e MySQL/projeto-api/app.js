const express = require('express');
const app = express();

app.use(express.json());

app.listen(3000,() => {
    console.log('API rodando na porta 3000');
});

// Create (POST)
app.post('/usuarios', (req, res) => {
  const { nome, email, senha } = req.body;
  db.query(
    'INSERT INTO usuarios (nome, email, senha) VALUES (?, ?, ?)',
    [nome, email, senha],
    (err) => {
      if (err) {
        res.status(500).send(err);
        return;
      }
      res.status(201).send('Usuário criado com sucesso!');
    }
  );
});

// Read (GET)
app.get('/usuarios',(req,res) => {
    RTCPeerConnection.query('SELECT * FROM usuarios',(err,results) =>{
        if(err) {
            res.status(500).send(err);
            return;
        }
        res.json(results);
    });
});

// Update (PUT)

app.put('/usuarios/:id',(req,res) => {
    const {nome,email,senha} = req.body;
    connection.query('UPDATE usuarios SET nome = ?, email = ?, senha = ? WHERE id=?',
    [nome,email,senha,req.params.id],(err) => {
        if(err){
            res.status(500).send(err);
            return;
        }
        res.send('Usuário atualizado com sucesso!');
    });
});

// Delete(DELETE)

app.delete('/usuarios/:id', (req, res) => {
  connection.query(
    'DELETE FROM usuarios WHERE id = ?',
    [req.params.id],
    (err) => {
      if (err) {
        res.status(500).send(err);
        return;
      }
      res.send('Usuário excluído com sucesso!');
    }
  );
});

const Joi = require('joi');

const schema = Joi.object({
  nome: Joi.string().min(3).required(),
  email: Joi.string().email().required(),
  senha: Joi.string().min(6).required()
});

app.post('/usuarios', (req, res) => {
  const { error } = schema.validate(req.body);

  if (error) {
    res.status(400).send(error.details[0].message);
    return;
  }

  const { nome, email, senha } = req.body;

  connection.query(
    'INSERT INTO usuarios (nome, email, senha) VALUES (?, ?, ?)',
    [nome, email, senha],
    (err) => {
      if (err) {
        res.status(500).send(err);
        return;
      }
      res.status(201).send('Usuário criado com sucesso!');
    }
  );
});

app.get('/usuarios', (req, res) => {
    const { page = 1, limit = 10 } = req.query;
    const offset = (page - 1) * limit;

    connection.query('SELECT * FROM usuarios LIMIT ? OFFSET ?', [parseInt(limit), parseInt(offset)], (err, results) => {
        if (err) {
            res.status(500).send(err);
            return;
        }
        res.json(results);
    });
});

const swaggerUi = require('swagger-ui-express');
const swaggerDocument = require('./swagger.json');

app.use('/api-docs',swaggerUi.serve,swaggerUi.setup(swaggerDocument));





