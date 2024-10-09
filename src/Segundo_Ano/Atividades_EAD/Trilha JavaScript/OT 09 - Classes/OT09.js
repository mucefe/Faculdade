// Exercícios para Praticar
// 1. Criar uma Classe Animal: Crie uma classe Animal com um construtor
// que recebe o nome e o som que o animal faz. Adicione um método
// falar que imprime o som do animal.

class Animal {
    constructor (nome, som){
        this.nome = nome;
        this.som = som;
    }
    falar() {
        console.log(som);
    }
}

// 2. Classe Veículo com Método de Velocidade: Desenvolva uma classe
// Veiculo com propriedades como marca, modelo e velocidadeMaxima.
// Adicione um método descrever que imprime uma descrição do veículo.

class Veiculo{
    constructor (marca,modelo,velocidadeMaxima){
        this.marca = marca;
        this.modelo=modelo;
        this.velocidadeMaxima=velocidadeMaxima;
    }

    descrever(){
        console.log("Marca: " + marca + "\nmodelo: " + this.modelo + "\nvelocidadeMaxima: " + velocidadeMaxima);
    }

}

// 3. Classe Estudante com Notas: Amplie a classe Estudante para incluir
// um array de notas. Adicione um método calcularMedia que retorna a
// média das notas.

class Estudante {
    constructor (nome,idade,curso){
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    calcularMedia(nota1,nota2,nota3,nota4){
        return (nota1+nota2+nota3+nota4)/4;
    }
}

// 4. Método Estático para Conversão de Temperatura: Na classe
// Utilitario, adicione um método estático que converte temperatura de
// Celsius para Fahrenheit.

class Utilitario{
    
    static celsiusToFahrenheit(celsius) {
        return (celsius * 9/5) + 32;
    }
}

// 5. Jogo Simples com Classe: Crie uma classe Jogo com um método
// estático que gera um número aleatório e permite ao usuário adivinhar. O
// método retorna se o usuário acertou ou não.

class Jogo {
    
    static adivinharNumero(tentativa) {
        
        const numeroAleatorio = Math.floor(Math.random() * 10) + 1;
  
        if (tentativa === numeroAleatorio) {
            return `Parabéns! Você acertou. O número era ${numeroAleatorio}.`;
        } else {
            return `Que pena! Você errou. O número era ${numeroAleatorio}.`;
        }
    }
}

console.log(Jogo.adivinharNumero(5));  


// 6. Classe ContaBancaria com Método de Saque: Na classe
// ContaBancaria, adicione um método sacar que permite sacar um
// valor do saldo, garantindo que o saldo não fique negativo.

class ContaBancaria {
    constructor (saldo){
        this.saldo = saldo;
    }

    sacar (valor){
        if (valor<=saldo){
            saldo-=valor;
            console.log("Saque de R$ " + valor + " realizado com sucesso!");
        } else {
            console.log("Erro! Saldo insuficiente!");
        }
    }
}