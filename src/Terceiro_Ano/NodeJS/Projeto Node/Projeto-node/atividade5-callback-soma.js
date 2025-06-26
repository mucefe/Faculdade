function somar(a, b, callback) {
  callback(a + b);
}

somar(10, 15, (resultado) => {
  console.log("Resultado da soma:", resultado);
});
