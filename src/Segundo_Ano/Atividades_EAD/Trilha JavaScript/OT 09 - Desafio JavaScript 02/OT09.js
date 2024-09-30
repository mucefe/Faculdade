// Desafio 02
// Nesse exercício, você está livre para escolher os nomes para suas variáveis e
// funções! 😄
// // Crie uma função que receba dois argumentos e retorne a soma dos mesmos.
// ?
function soma (a,b) {return a+b};

// // Declare uma variável que receba a invocação da função criada acima,
// passando dois números quaisquer por argumento, e somando `5` ao resultado
// retornado da função.
// ?

var varSoma = soma(5,3)+5;
// // Qual o valor atualizado dessa variável?
// ?
13;
// // Declare uma nova variável, sem valor.
// ?
var novaVar;
// Crie uma função que adicione um valor à variável criada acima, e retorne a
// string:
// O valor da variável agora é VALOR.
// Onde VALOR é o novo valor da variável.
function addValor(valor){
    novaVar=valor;
    return "O valor da variável agora é " + valor;
}
// // Invoque a função criada acima.
addValor(5);
// // Qual o retorno da função? (Use comentários de bloco).
"O valor da variável agora é 5"
// Crie uma função com as seguintes características:
// 1. A função deve receber 3 argumentos;
// 2. Se qualquer um dos três argumentos não estiverem preenchidos, a função
// deve retornar a string:
// Preencha todos os valores corretamente!
// 3. O retorno da função deve ser a multiplicação dos 3 argumentos, somando
// `2` ao resultado da multiplicação.
function multiplicar(a,b,c){
    if (a==null||b==null||c==null){
        return "Preencha todos os valores corretamente!"
    } else {
        return (a*b*c)+2;
    }
}
// // Invoque a função criada acima, passando só dois números como argumento.
// ?
console.log(multiplicar(2,4));
// // Qual o resultado da invocação acima? (Use comentários para mostrar o
// valor retornado).
// R: "Preencha todos os valores corretamente!"

// // Agora invoque novamente a função criada acima, mas passando todos os
// três argumentos necessários.

console.log(multiplicar(2,4,6));

// // Qual o resultado da invocação acima? (Use comentários para mostrar o
// valor retornado).
// R: 50;

// Crie uma função com as seguintes características:
// 1. A função deve receber 3 argumentos.
// 2. Se somente um argumento for passado, retorne o valor do argumento.
// 3. Se dois argumentos forem passados, retorne a soma dos dois argumentos.
// 4. Se todos os argumentos forem passados, retorne a soma do primeiro com o
// segundo, e o resultado, dividido pelo terceiro.
// 5. Se nenhum argumento for passado, retorne o valor booleano `false`.
// 6. E ainda, se nenhuma das condições acima forem atendidas, retorne `null`.
// */

function funcoes(a,b,c){
    if (arguments.length===0){
        return false;
    }
    if (arguments.length===1){
        return a;
    }
    if (arguments.length===2){
        return a+b;
    }
    if (arguments.length===3){
        return (a+b)/c;
    }
    return null;
}


// // Invoque a função acima utilizando todas as possibilidades (com nenhum
// argumento, com um, com dois e com três.) Coloque um comentário de linha
// ao lado da função com o resultado de cada invocação.
// ?

console.log(funcoes(2,4,6));
console.log(funcoes(2,4));
console.log(funcoes(2));
console.log(funcoes());