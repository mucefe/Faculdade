//Desafio 05
/*
Crie uma variável qualquer, que receba um array com alguns valores
aleatórios
- ao menos 5 - (fica por sua conta os valores do array).
*/

var valores = [1,3,5,12,21];


/*
Crie uma função que receba um array como parâmetro, e retorne esse array.
*/

function retornaArray(array = [1,4,16,13]){
    return array;
}

/*
Imprima o segundo índice do array retornado pela função criada acima.
*/
console.log(retornaArray[1]);
/*
Crie uma função que receba dois parâmetros: o primeiro, um array de valores;
e o
segundo, um número. A função deve retornar o valor de um índice do array
que foi passado
no primeiro parâmetro. O índice usado para retornar o valor, deve ser o
número passado no
segundo parâmetro.
*/

function retornaNumero (arrayValores, num){
arrayValores = [2,5,11,21,7,1];
return arrayValores[num];
}

/*
Declare uma variável que recebe um array com 5 valores, de tipos diferentes.
*/


var array = [2,3,7,5,1];

/*
Invoque a função criada acima, fazendo-a retornar todos os valores do último
array criado.
*/
retornaNumero(array,0);
retornaNumero(array,1);
retornaNumero(array,2);
retornaNumero(array,3);
retornaNumero(array,4);



/*
Crie uma função chamada `book`, que recebe um parâmetro, que será o nome
do
livro. Dentro dessa função, declare uma variável que recebe um objeto com as
seguintes características:
- esse objeto irá receber 3 propriedades, que serão nomes de livros;
- cada uma dessas propriedades será um novo objeto, que terá outras 3
propriedades:
- `quantidadePaginas` - Number (quantidade de páginas)
- `autor` - String
- `editora` - String
- A função deve retornar o objeto referente ao livro passado por parâmetro.
- Se o parâmetro não for passado, a função deve retornar o objeto com todos
os livros.
*/

function book(nomeDoLivro) {
    const livros = {
        "Livro1": {
            quantidadePaginas: 300,
            autor: "Autor 1",
            editora: "Editora A"
        },
        "Livro2": {
            quantidadePaginas: 450,
            autor: "Autor 2",
            editora: "Editora B"
        },
        "Livro3": {
            quantidadePaginas: 150,
            autor: "Autor 3",
            editora: "Editora C"
        }
    };
    
    if (nomeDoLivro) {
        return livros[nomeDoLivro];
    }
    return livros;
}
console.log(book("Livro1"));
console.log(book());



/*
Usando a função criada acima, imprima o objeto com todos os livros.
*/

console.log(book);

/*
Ainda com a função acima, imprima a quantidade de páginas de um livro
qualquer,
usando a frase:
"O livro [NOME_DO_LIVRO] tem [X] páginas!"
*/

console.log("O livro " + book[2].nomeDoLivro + " possui " + book[2].quantidadePaginas + " páginas!");

/*
Ainda com a função acima, imprima o nome do autor de um livro qualquer,
usando
a frase:
"O autor do livro [NOME_DO_LIVRO] é [AUTOR]."
*/

console.log("O autor do livro " + book[3].nomeDoLivro + " é " + book[3].autor);

/*
Ainda com a função acima, imprima o nome da editora de um livro qualquer,
usando
a frase:
"O livro [NOME_DO_LIVRO] foi publicado pela editora [NOME_DA_EDITORA]."
*/

console.log("O livro " + book[1].nomeDoLivro + " foi publicado pela editora " + book[1].editora);
