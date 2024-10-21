// Exercícios
// 1. Criando uma Lista de Compras: Use o operador spread para combinar
// dois arrays de itens de supermercado em uma lista de compras.

var hortifruti = ["Tomates","Ovos","Cenoura","Alface","Rabanetes", "Repolho","Maçãs","Laranjas"];
var produtosLimpeza = ["Água Sanitária", "Diabo Verde", "Detergente","Sabão em Pó", "Aromatizante de Ambientes", "Palha de Aço", "Álcool", "Esponja"]

var listaDeCompras = [...hortifruti,...produtosLimpeza];

// 2. Atualizando um Perfil de Usuário: Crie um objeto usuario com
// propriedades como nome e email. Use o operador spread para criar um
// novo objeto com os dados do usuário e uma propriedade adicional
// status.

var usuario = {"Nome":"João","E-mail":"joao@outlook.com"};
var usuarioNovo = {...usuario,"status":"ativo"};


// 3. Festa de Aniversário: Crie uma função que aceita um número variável
// de nomes e os imprime como lista de convidados para uma festa de
// aniversário, usando o operador spread para coletar os nomes.

function festa(...nomes) {
    console.log("Lista de Convidados:\n");
    for (let nome of nomes) {
        console.log(nome);
    }
}

// 4. Clonando um Array de Músicas: Dado um array de músicas, crie uma
// cópia do array usando o operador spread. Altere um elemento no array
// copiado e verifique se o array original permanece inalterado.

var musicas = [
    { nome: 'Bohemian Rhapsody', artista: 'Queen'},
    { nome: 'Stairway to Heaven', artista: 'Led Zeppelin' },
    { nome: 'Smells Like Teen Spirit', artista: 'Nirvana' },
    { nome: 'Billie Jean', artista: 'Michael Jackson' },
    { nome: 'Imagine', artista: 'Beatles'}
];
var musicas2 = [...musicas, artista: 'John Lennon'];

// 5. Mesclando Objetos com Informações Complementares: Crie dois
// objetos, um com informações básicas de um filme (título e diretor) e
// outro com informações complementares (ano e gênero). Use o operador
// spread para mesclar esses objetos em um único objeto filme.

var basicas = {titulo : 'A Ilha do Medo', diretor: 'Martin Scorsese'};
var complementares = {ano: '2010', genero: 'suspense'};

var filme = {...basicas,...complementares};

// 6. Criando um Menu de Restaurante Variável: Faça uma função criarMenu
// que aceita vários itens (entradas, pratos principais, sobremesas) como
// arrays e usa o operador spread para criar um único array de menu.

function criarMenu (entradas,pratos,sobremesas){
var menu = [...entradas,...pratos,...sobremesas];
return menu;
}