// 1. Criar e Acessar um Objeto: Crie um objeto chamado carro com propriedades como marca, modelo e ano. Em seguida, acesse e imprima a 
//    propriedade modelo do objeto.
var carro = {
    marca: "Toyota",
    modelo: "Corolla",
    ano: 2020
  };
  console.log(carro.modelo);
  
  // 2. Adicionar e Modificar Propriedades de um Objeto: A partir do objeto carro criado, adicione uma propriedade cor e modifique o ano 
  //    do carro. Imprima o objeto modificado.
  carro.cor = "Azul";
  carro.ano = 2022;
  console.log(carro);
  
  // 3. Criar um Método em um Objeto: Crie um objeto chamado calculadora com um método soma que aceite dois números e retorne a soma deles.
  var calculadora = {
    soma: function(a, b) {
      return a + b;
    }
  };
  console.log(calculadora.soma(5, 3));
  
  // 4. Iterar Sobre as Propriedades de um Objeto: Dado um objeto, use um loop for...in para iterar sobre todas as suas propriedades e 
  //    imprimir cada uma delas.
  for (var propriedade in carro) {
    console.log(propriedade + ": " + carro[propriedade]);
  }
  
  // 5. Entendendo Referências de Objetos: Crie um objeto livro com propriedades como titulo e autor. Em seguida, crie outra variável 
  //    que referencie o objeto livro e modifique a propriedade titulo. Verifique se o objeto original foi alterado.
  var livro = {
    titulo: "1984",
    autor: "George Orwell"
  };
  var referenciaLivro = livro;
  referenciaLivro.titulo = "A Revolução dos Bichos";
  console.log(livro.titulo);
  
  // 6. Usando Métodos Avançados de Objeto: Dado um objeto, use o método Object.keys() para listar todas as chaves do objeto. Repita 
  //    o processo com Object.values() para listar todos os valores.
  console.log(Object.keys(livro));
  console.log(Object.values(livro));
  