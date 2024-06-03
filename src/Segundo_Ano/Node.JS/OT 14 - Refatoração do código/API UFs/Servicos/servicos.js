import { colecaoUf } from '../Dados/dados.js'; 

export const buscarufs = () => {
   return colecaoUf;
}

export const buscarufspornome = (nomeuf) => {
    return colecaoUf.filter(uf => uf.nome.toLowerCase().includes(nomeuf.toLowerCase()))
};

export const buscarufporid = (id) => {
    const iduf = parseInt(id);
    return colecaoUf.find(uf => uf.id === iduf);
}