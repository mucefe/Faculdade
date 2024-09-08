// 1. Função que Calcula a Área de um Retângulo: Crie uma função que calcula a área de um retângulo dado largura e altura.
function calculaAreaRetangulo(largura, altura) {
    return largura * altura;
  }
  
  // 2. Função para Verificar Número Par: Faça uma função que recebe um número e retorna true se for par e false se for ímpar.
  function verificaPar(numero) {
    return numero % 2 === 0;
  }
  
  // 3. Converter Polegadas em Centímetros: Escreva uma função que converte polegadas em centímetros.
  function polegadasParaCentimetros(polegadas) {
    return polegadas * 2.54;
  }
  
  // 4. IMC: Escreva uma função que calcula o Índice de Massa Corporal (IMC).
  function calculaIMC(peso, altura) {
    return peso / (altura * altura);
  }
  
  // 5. Maiúsculas para Minúsculas: Crie uma função que recebe uma string e retorna a mesma string em letras minúsculas.
  function converteParaMinusculas(str) {
    return str.toLowerCase();
  }
  
  // 6. Crie uma arrow function chamada multiplicaPorDez que recebe um número como parâmetro e retorna o valor multiplicado por 10.
  const multiplicaPorDez = (numero) => numero * 10;
  