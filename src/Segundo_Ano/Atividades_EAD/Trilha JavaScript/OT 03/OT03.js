// 1. Criando um loop: Crie um loop for que imprima números de 0 a 10.
for (let i = 0; i <= 10; i++) {
    console.log(i);
}

// 2. Loop com condição: Crie um loop for que imprima somente números ímpares de 0 a 20.
for (let i = 0; i <= 20; i++) {
    if (i % 2 != 0) {
        console.log(i);
    }
}

// 3. Usando while: Crie um loop while que imprima números de 0 a 10.
let j = 0;
while (j <= 10) {
    console.log(j);
    j++;
}

// 4. Interrompendo um loop: Crie um loop for que imprima números de 0 a 100, mas interrompa a execução quando chegar ao número 50.
for (let k = 0; k <= 100; k++) {
    if (k == 50) {
        break;
    }
    console.log(k);
}

// 5. Pulando uma iteração: Crie um loop for que imprima números de 0 a 20, mas pule a impressão do número 13.
for (let l = 0; l <= 20; l++) {
    if (l == 13) {
        continue;
    }
    console.log(l);
}

// 6. Iterando um Array: Crie um array de nomes e use um loop for...of para imprimir cada nome do array.
const nomes = ["Alice", "Bruno", "Carlos", "Diana"];
for (const nome of nomes) {
    console.log(nome);
}
