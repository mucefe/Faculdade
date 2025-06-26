function somar(a, b, callback) {
  const resultado = a + b;
  callback(resultado);
}

somar(10, 20, (resultado) => {
  console.log("Resultado da soma:", resultado);
});
