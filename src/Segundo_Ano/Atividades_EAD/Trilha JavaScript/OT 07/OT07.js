
//                        Exercícios
// 1 - Criar e Adicionar Pares Chave-Valor no Map: Crie um Map chamado
// livros e adicione nele três pares de chave-valor, onde a chave é o
// título do livro e o valor é o autor.

let livros = new Map();

livros.set('1984', 'George Orwell');
livros.set('Sapiens','Yuval Noah Harari');
livros.set('Médico', 'Noah Gordon');

// 2 - Acessar Valor no Map: Acesse o valor associado a uma das chaves no
// Map livros que você criou e imprima o nome do autor.

console.log(livros.get('1984'));

// 3 - Iterar Sobre um Map: Use um loop for...of para iterar sobre o Map
// livros e imprimir todos os pares chave-valor.

for (let [chave, valor] of livros){
    console.log(`${chave}: ${valor}`);
}

// 4 - Usando Métodos do Map: size, delete, has: No seu Map livros, use o
// método size para imprimir o número de livros, delete para remover um
// livro pelo título e has para verificar se um livro ainda está no Map.

let tamanho = livros.size;

console.log("O Map possui ", tamanho, " entradas.");
livros.delete('Médico');
if (livros.has('1984')){
    console.log("O livro 1984 ainda está no Map")
} else {
    console.log("O livro 1984 não está mais no Map.")
}

// 5 - Map com Tipos de Chaves Diferentes: Crie um Map chamado colecao
// que contém diferentes tipos de chaves (como string, number, object)
// e seus respectivos valores.
let objetoLivros = Object.fromEntries(livros);
let colecao = new Map();
colecao.set(20, "Exemplo de string");
colesao.set(21, objetoLivros);