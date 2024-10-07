// 1. Criar e Adicionar Valores ao Set: Crie um Set chamado frutas e
// adicione nele três frutas diferentes. Depois, tente adicionar uma fruta
// que já está no Set.

var frutas = new Set();
frutas.add("laranja");
frutas.add("maçã");
frutas.add("tomate");

// 2. Verificar Valores no Set: Use o método has para verificar se uma fruta
// específica está no seu Set frutas.

console.log(frutas.has("tomate"));

// 3. Remover Valores do Set: Use o método delete para remover uma fruta
// do seu Set frutas.

frutas.delete("maçã");

// 4. Limpar o Set: Use o método clear para limpar todo o seu Set frutas.

frutas.clear();

// 5. Tamanho do Set: Crie um Set com vários valores e use a propriedade

var novoSet = new Set();

novoSet.add(1);
novoSet.add(52);
novoSet.add(31);
novoSet.add(0);

// size para imprimir o número de elementos no Set.

console.log(novoSet.size);

// 6. Iterar Sobre um Set: Use um loop for...of para iterar sobre o seu Set
// e imprimir cada valor.

for (let valor of novoSet){
    console.log(valor);
}

// 7. Criar um Set a Partir de um Array: Crie um array com alguns valores
// duplicados. Em seguida, crie um Set a partir desse array para remover
// as duplicatas.
let array = [1,3,5,8,10,2,5,8,10,1,5,21,1,5];
let arraySet = new Set(array);
console.log(arraySet);