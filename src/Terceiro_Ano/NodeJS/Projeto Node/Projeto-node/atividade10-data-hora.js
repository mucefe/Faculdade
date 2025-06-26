const agora = new Date();

const dataFormatada = agora.toLocaleDateString();
const horaFormatada = agora.toLocaleTimeString();

console.log(`Data: ${dataFormatada} | Hora: ${horaFormatada}`);
