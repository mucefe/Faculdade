// Exercícios
// 1. Calculadora Simples: Crie Arrow Functions para as operações básicas
// de matemática: soma, subtração, multiplicação e divisão. Cada função
// deve aceitar dois parâmetros e retornar o resultado da operação.

var soma = (a,b) => a+b;
var subtracao = (a,b) => a-b;
var multiplicacao = (a,b) => a*b;
var divisao = (a,b) => a/b;

// 2. Função de Saudação Personalizada: Escreva uma Arrow Function que
// recebe um nome como parâmetro e retorna uma saudação
// personalizada.

var saudacao = (nome) => `Olá, ${nome}!`

// 3. Contador com Arrow Function: Use uma Arrow Function dentro de um
// setInterval para criar um contador que imprime um número a cada
// segundo.

function Contador(){
this.contagem=0;

setInterval(() => {
    this.contagem++;
    console.log(this.contagem);
}, 1000);
}
new Contador();

// 4. Filtrar Números Pares: Dado um array de números, use uma Arrow
// Function com o método filter para criar um novo array apenas com
// números pares.

var numeros = [1,2,3,4,5,6,7,8,9,10];
var pares = numeros.filter(num => num % 2 === 0);
console.log(pares);

// 5. Conversor de Temperatura: Crie uma Arrow Function que converte a
// temperatura de Celsius para Fahrenheit.

var fahrenheit = (celsius) => celsius * (9 / 5) + 32;

// 6. Função de Ordenação: Implemente uma Arrow Function que recebe um
// array de strings e retorna um novo array com os itens ordenados
// alfabeticamente.

var cores = ["azul","verde","vermelho","ammarelo","preto","roxo","branco"]
var coresOrdenadas = (cores) => cores.sort();
