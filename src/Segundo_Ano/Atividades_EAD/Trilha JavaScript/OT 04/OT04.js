// 1) Classificação por Idade: 
// Escreva um programa que classifica uma pessoa em categorias de idade: 
// 'criança' (menos de 13 anos), 'adolescente' (entre 13 e 17 anos), 
// 'adulto' (entre 18 e 64 anos) e 'idoso' (65 anos ou mais). 
// Use a estrutura if/else/else if.

function classificarIdade(idade) {
    if (idade < 13) {
        return "criança";
    } else if (idade >= 13 && idade <= 17) {
        return "adolescente";
    } else if (idade >= 18 && idade <= 64) {
        return "adulto";
    } else if (idade >= 65) {
        return "idoso";
    }
}

console.log(classificarIdade(10));  // Resultado: criança
console.log(classificarIdade(15));  // Resultado: adolescente
console.log(classificarIdade(30));  // Resultado: adulto
console.log(classificarIdade(70));  // Resultado: idoso


// 2) Jogo de Adivinhação com Switch: 
// Desenvolva um jogo simples de adivinhação onde o usuário tenta adivinhar 
// um número entre 1 e 5. Use switch para verificar a escolha e imprimir se acertou ou não.

function jogoAdivinhacao() {
    const palpite = parseInt(prompt("Adivinhe um número entre 1 e 5:"));
    const numeroCorreto = Math.floor(Math.random() * 5) + 1; // Gera um número aleatório entre 1 e 5

    switch (palpite) {
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
            if (palpite === numeroCorreto) {
                return "Parabéns! Você acertou!";
            } else {
                return `Que pena! O número correto era ${numeroCorreto}.`;
            }
        default:
            return "Por favor, escolha um número entre 1 e 5.";
    }
}

console.log(jogoAdivinhacao()); // Resultado depende do palpite e do número aleatório gerado
console.log(jogoAdivinhacao(3)); // Resultado depende do número aleatório gerado


// 3) Avaliação de Notas: 
// Crie um programa que, dada uma nota de um aluno, classifica a nota como 
// 'Reprovado' (menos de 6), 'Recuperação' (entre 6 e 7), ou 'Aprovado' (mais de 7). 
// Use switch.

function avaliarNota(nota) {
    let status;
    switch (true) {
        case (nota < 6):
            status = "Reprovado";
            break;
        case (nota >= 6 && nota <= 7):
            status = "Recuperação";
            break;
        case (nota > 7):
            status = "Aprovado";
            break;
        default:
            status = "Nota inválida";
    }
    return status;
}

console.log(avaliarNota(5));   // Resultado: Reprovado
console.log(avaliarNota(6.5)); // Resultado: Recuperação
console.log(avaliarNota(8));   // Resultado: Aprovado
