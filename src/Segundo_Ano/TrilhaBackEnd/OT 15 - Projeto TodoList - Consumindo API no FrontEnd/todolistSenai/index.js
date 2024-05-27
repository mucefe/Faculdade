const express = require('express');
const path = require('path');
const app = express();

app.engine('html', require('ejs').renderFile); //11.4K (gzippped: 4.3k))
app.set('view engine','html');
app.use('/public',express.static(path.join(__dirname, 'public')));
app.set('views',path.join(__dirname, '/views'));

app.get('/',(req,res)=>{
    res.render('index',{nome: 'Murilo'});
});

app.listen(5000,()=>{
    console.log('Servidor rodando em http://localhost:5000');
})