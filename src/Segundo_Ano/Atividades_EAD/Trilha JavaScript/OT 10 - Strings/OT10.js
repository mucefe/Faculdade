// Exercício

// 1. Criando um Convite: Use a concatenação de strings para criar um
// convite. Inclua o nome do destinatário, o tipo de evento e a data, usando
// variáveis.

var nome,tipo,data;

console.log(`Prezado ${nome}, você foi convidado para um(a) ${tipo} no dia ${data}`)

// 2. Diário de Bordo: Escreva um pequeno diário de bordo usando template
// literals, incluindo data, local e uma descrição do que aconteceu no dia.
var local,data;
console.log(`Diário de bordo:\nData: ${data}\nLocal: ${local}\n\nHoje aconteceram muitas coisas que vou escrever nesse diário de bordo... `);

// 3. Redator de Notícias: Crie uma string que represente uma notícia,
// utilizando o método replace() para substituir um fato errado por um
// correto.
var noticia="A partir de amanhã vou fazer exercícios diariamente";

var fato="começar a procrastinar o início dos exercícios"
var fake="fazer exercícios diariamente"

console.log(noticia.replace(fake,fato));

// 4. Caixa de Comentários: Use o método trim() para limpar os
// comentários dos usuários antes de publicá-los em um blog ou fórum.

var comentario = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum." 
comentario.trim();
console.log(comentario);

// 5. Carta para um Amigo: Utilize \\n para formatar uma carta para um
// amigo, com saudação, corpo da mensagem e despedida, cada um em
// uma nova linha.

console.log("Salve, amice dilecte!\nSed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, \neaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut \nodit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum \nquia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat \nvoluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut \naliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam \nnihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?\n\nCura ut valeas, amice fidelis.");


// 6. Citações Famosas: Crie uma string que inclua uma citação famosa de
// uma pessoa, utilizando caracteres de escape para incluir aspas na
// citação.

console.log("\"Não há nada mais trabalhoso do que viver sem trabalhar\"(MADRUGA, Seu)");