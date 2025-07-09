application.use((req,res,next) =>{
    console.log(`Método: ${req.method}, URL: ${req.url}`);
    next();
});

application.use('/users', (req,res,next) => {
    console.log('Middleware aplicado apenas às rodas de /jusers');
    next();
});
