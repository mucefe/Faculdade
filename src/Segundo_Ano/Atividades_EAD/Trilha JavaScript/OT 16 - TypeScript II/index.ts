let message: string = "Hello, TypeScript!";
console.log(message);

// Exercícios para Praticar
// 1. Trabalhando com Tipos:
// ○ Crie variáveis para cada tipo básico e imprima-as.
// ○ Tente atribuir valores incorretos a essas variáveis para ver o que
// acontece.

var verdadeiroFalso: boolean = false;
var numero: number = 0;
var palavra: string = "Teste";
var cores: Array<string> = ["Azul", "Verde", "Vermelho"];
var usuario: [string, number] = ["João da Silva", 32];
enum frutas {Tomate,Pimenta,Berinjela};
var qualquerCoisa: any = "Qualquer coisa";

console.log(frutas.Pimenta);
console.log(verdadeiroFalso);
console.log(numero);
console.log(cores[1]);
console.log(qualquerCoisa);
console.log(palavra);

palavra=3;
verdadeiroFalso="true";
numero = "três";
cores.push(3);
usuario=[34,"José da Silva"];
frutas="Mamão";

// 2. Função com Tipos:
// ○ Escreva uma função que aceita um array de números e retorna a
// soma de todos os elementos.
// ○ Assegure-se de tipar tanto a entrada quanto a saída da função.

function soma (...numeros: Array<number>): number {
    var resultado:number =0;

    for (var i=0;i<numeros.length;i++){
        resultado+=numeros[i];
    }


    return resultado;
}

// 3. Enumerações:
// ○ Crie um enum para representar os dias da semana e use-o em
// uma função que imprime uma mensagem de acordo com o dia
// passado.
enum DiaDaSemana {
    Domingo = 0,
    Segunda,
    Terça,
    Quarta,
    Quinta,
    Sexta,
    Sábado,
  }
function imprimirMensagemDoDia(dia: DiaDaSemana): void {
    switch (dia) {
      case DiaDaSemana.Domingo:
        console.log("Hoje é domingo. Dia de descanso!");
        break;
      case DiaDaSemana.Segunda:
        console.log("Segunda-feira: Começo da semana de trabalho!");
        break;
      case DiaDaSemana.Terça:
        console.log("Terça-feira: Vamos manter o ritmo!");
        break;
      case DiaDaSemana.Quarta:
        console.log("Quarta-feira: Metade da semana, força!");
        break;
      case DiaDaSemana.Quinta:
        console.log("Quinta-feira: O fim de semana está próximo.");
        break;
      case DiaDaSemana.Sexta:
        console.log("Sexta-feira: Último dia útil. Preparado para o descanso?");
        break;
      case DiaDaSemana.Sábado:
        console.log("Sábado: Aproveite o fim de semana!");
        break;
      default:
        console.log("Dia inválido.");
    }
  }

  imprimirMensagemDoDia(DiaDaSemana.Terça);

// 4. Tuplas:
// ○ Crie uma tupla que representa um produto (com nome e preço).
// Use essa tupla em uma função que imprime o nome e o preço do
// produto.

var formato: [string, number] = ["Nome do produto",0.0];

function imprimeProduto (imprimir: formato){
    console.log(imprimir);
}
var produto: formato = ["Caneta", 0.5];
imprimeProduto(produto);

// 5. Any:
// ○ Crie uma variável do tipo any e atribua diferentes tipos de valores
// a ela. Note como o TypeScript não emite erros nesse caso.

var qualquer: any = 3;
qualquer = "Teste";
qualquer = null;

// 6. Void, Null e Undefined:
// ○ Crie uma função que não retorna nada (void) e outra que retorna
// undefined. Compare as duas.

function retornaNada() :void {

}

function retornaUndefined() : undefined{
    return undefined;
}
