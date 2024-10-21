// Exercícios de Desestruturação
// 1. Extrair Dados de um Array: Crie um array com três elementos e utilize a
// desestruturação para criar três variáveis, cada uma recebendo um
// elemento do array.

let array = [1,2,3];
let [a,b,c] = array;

// 2. Extrair Propriedades de um Objeto: Crie um objeto com propriedades
// como nome e idade. Use a desestruturação para criar variáveis a partir
// dessas propriedades.

let pessoa = {nome: "João", idade: 55};
let {nome,idade} = pessoa;
console.log(nome,idade);

// 3. Desestruturação em Funções: Escreva uma função que recebe um
// objeto como parâmetro e use a desestruturação para trabalhar com as
// propriedades do objeto dentro da função.

function desestruturar({ a, b, c }) {
    return a + b + c;
}

let obj = { a: 1, b: 2, c: 3 };
console.log(desestruturar(obj));

// 4. Desestruturação com Arrays Aninhados: Crie um array de arrays e use a
// desestruturação para criar variáveis a partir dos elementos do array
// aninhado.

let numeros =[[1,3,5,7,9],[2,4,6,8,10]];
let [impares,pares]=numeros;
console.log(impares,pares);

// 5. Valores Padrão na Desestruturação: Crie um array com um elemento e
// utilize a desestruturação para criar duas variáveis. A primeira deve
// receber o valor do array e a segunda deve usar um valor padrão.

let [elemento1=2,elemento2=10] = [5];
console.log(elemento1,elemento2);

// 6. Trocar Valores de Variáveis com Desestruturação: Crie duas variáveis e
// troque os valores entre elas utilizando desestruturação
let a1 = "direito";
let b1 = "esquerdo";

[a1,b1]=[b1,a1];

console.log(a1,b1);