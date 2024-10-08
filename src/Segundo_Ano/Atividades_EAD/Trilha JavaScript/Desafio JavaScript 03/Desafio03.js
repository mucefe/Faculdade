// Desafio 03
// Declarar uma variável qualquer, que receba um objeto vazio.

let objeto = {};

let variavel = objeto;

/*
Declarar uma variável `pessoa`, que receba suas informações pessoais.
As propriedades e tipos de valores para cada propriedade desse objeto devem
ser:
- `nome` - String
- `sobrenome` - String
- `sexo` - String
- `idade` - Number
- `altura` - Number
- `peso` - Number
- `andando` - Boolean - recebe "falso" por padrão
- `caminhouQuantosMetros` - Number - recebe "zero" por padrão
*/
var pessoa = {
  nome: "João",
  sobrenome: "Silva",
  sexo: "Masculino",
  idade: 61, 
  altura: 1.60, 
  peso: 65, 
  andando: false,
  caminhouQuantosMetros: 0
};

/*
Adicione um método ao objeto `pessoa` chamado `fazerAniversario`. O
método deve alterar o valor da propriedade `idade` dessa pessoa, somando `1` a cada vez
que for chamado.
*/
pessoa.fazerAniversario = function() {
  this.idade++;
};

/*
Adicione um método ao objeto `pessoa` chamado `andar`, que terá as seguintes
características:
- Esse método deve receber por parâmetro um valor que representará a quantidade
de metros caminhados;
- Ele deve alterar o valor da propriedade `caminhouQuantosMetros`, somando
ao valor dessa propriedade a quantidade passada por parâmetro;
- Ele deverá modificar o valor da propriedade `andando` para o valor
booleano que representa "verdadeiro";
*/
pessoa.andar = function(distanciaMetros) {
  this.caminhouQuantosMetros += distanciaMetros;
  this.andando = true;
};

/*
Adicione um método ao objeto `pessoa` chamado `parar`, que irá modificar o
valor da propriedade `andando` para o valor booleano que representa "falso".
*/
pessoa.parar = function() {
  this.andando = false;
};

/*
Crie um método chamado `nomeCompleto`, que retorne a frase:
- "Olá! Meu nome é [NOME] [SOBRENOME]!"
*/
pessoa.nomeCompleto = function() {
  return "Olá! Meu nome é " + this.nome + " " + this.sobrenome;
};

/*
Crie um método chamado `mostrarIdade`, que retorne a frase:
- "Olá, eu tenho [IDADE] anos!"
*/
pessoa.mostrarIdade = function() {
  return "Olá, eu tenho " + this.idade + " anos.";
};

/*
Crie um método chamado `mostrarPeso`, que retorne a frase:
- "Eu peso [PESO]Kg."
*/
pessoa.mostrarPeso = function() {
  return "Eu peso " + this.peso + "kg.";
};

/*
Crie um método chamado `mostrarAltura` que retorne a frase:
- "Minha altura é [ALTURA]m."
*/
pessoa.mostrarAltura = function() {
  return "Minha altura é " + this.altura + "m.";
};

/*
Agora vamos brincar um pouco com o objeto criado:
Qual o nome completo da pessoa? (Use a instrução para responder e
comentários inline ao lado da instrução para mostrar qual foi a resposta retornada)
*/
console.log(pessoa.nomeCompleto()); // "Olá, meu nome é João Silva."

/*
Qual a idade da pessoa? (Use a instrução para responder e comentários
inline ao lado da instrução para mostrar qual foi a resposta retornada)
*/
console.log(pessoa.mostrarIdade()); // "Olá, eu tenho 61 anos."

/*
Qual o peso da pessoa? (Use a instrução para responder e comentários
inline ao lado da instrução para mostrar qual foi a resposta retornada)
*/
console.log(pessoa.mostrarPeso()); // "Eu peso 65kg."

/*
Qual a altura da pessoa? (Use a instrução para responder e comentários
inline ao lado da instrução para mostrar qual foi a resposta retornada)
*/
console.log(pessoa.mostrarAltura()); // "Minha altura é 1.6m."

/*
Faça a `pessoa` fazer 3 aniversários.
*/
pessoa.fazerAniversario();
pessoa.fazerAniversario();
pessoa.fazerAniversario();

/*
Quantos anos a `pessoa` tem agora? (Use a instrução para responder e
comentários inline ao lado da instrução para mostrar qual foi a resposta retornada)
*/
console.log(pessoa.mostrarIdade()); // "Olá, eu tenho 64 anos."

/*
Agora, faça a `pessoa` caminhar alguns metros, invocando o método `andar`
3x, com metragens diferentes passadas por parâmetro.
*/
pessoa.andar(4);
pessoa.andar(6);
pessoa.andar(20);

/*
A pessoa ainda está andando? (Use a instrução para responder e comentários
inline ao lado da instrução para mostrar qual foi a resposta retornada)
*/
if (pessoa.andando) {
  console.log("A pessoa ainda está andando.");
} else {
  console.log("A pessoa está parada.");
}

/*
Se a pessoa ainda está andando, faça-a parar.
*/
if (pessoa.andando) {
  pessoa.parar();
}

/*
E agora: a pessoa ainda está andando? (Use uma instrução para responder e
comentários inline ao lado da instrução para mostrar a resposta retornada)
*/
console.log(pessoa.andando); // false

/*
Quantos metros a pessoa andou? (Use uma instrução para responder e
comentários inline ao lado da instrução para mostrar a resposta retornada)
*/
console.log("A pessoa andou " + pessoa.caminhouQuantosMetros + " metros."); // "A pessoa andou 30 metros."

/*
Agora vamos deixar a brincadeira um pouco mais divertida! :D
Crie um método para o objeto `pessoa` chamado `apresentacao`. Esse método deve
retornar a string:
- "Olá, eu sou o [NOME COMPLETO], tenho [IDADE] anos, [ALTURA], meu
peso é [PESO] e, só hoje, eu já caminhei [CAMINHOU QUANTOS METROS]
metros!"
Só que, antes de retornar a string, você vai fazer algumas validações:
- Se o `sexo` de `pessoa` for "Feminino", a frase acima, no início da
apresentação, onde diz "eu sou o", deve mostrar "a" no lugar do "o";
- Se a idade for `1`, a frase acima, na parte que fala da idade, vai mostrar a
palavra "ano" ao invés de "anos", pois é singular;
- Se a quantidade de metros caminhados for igual a `1`, então a palavra que
deve conter no retorno da frase acima é "metro" no lugar de "metros".
- Para cada validação, você irá declarar uma variável localmente (dentro do
método), que será concatenada com a frase de retorno, mostrando a resposta
correta, de acordo com os dados inseridos no objeto.
*/
pessoa.apresentacao = function() {
  var msgNome = "";
  var msgIdade = "tenho " + this.idade;
  var msgMetros = " e, só hoje, eu já caminhei " + this.caminhouQuantosMetros;

  if (this.sexo === "Feminino") {
    msgNome = "Olá, eu sou a " + this.nome + " " + this.sobrenome + ", ";
  } else {
    msgNome = "Olá, eu sou o " + this.nome + " " + this.sobrenome + ", ";
  }

  if (this.idade == 1) {
    msgIdade += " ano, ";
  } else {
    msgIdade += " anos, ";
  }

  if (this.caminhouQuantosMetros == 1) {
    msgMetros += " metro!";
  } else {
    msgMetros += " metros!";
  }

  return msgNome + msgIdade + this.altura + "m, meu peso é " + this.peso + "kg" + msgMetros;
};

// Agora, apresente-se ;)
console.log(pessoa.apresentacao());
