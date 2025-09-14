<template>
  <div class="container">
    <h1>Lista de Usuários</h1>
    <table border="1">
      <thead>
        <tr>
          <th>ID</th>
          <th>Nome</th>
          <th>Email</th>
          <th>Ações</th>
        </tr>
      </thead>
      <tbody>
        <tr v-for="usuario in usuarios" :key="usuario.id">
          <td>{{ usuario.id }}</td>
          <td>{{ usuario.nome }}</td>
          <td>{{ usuario.email }}</td>
          <td>
            <button @click="deletarUsuario(usuario.id)">Excluir</button>
          </td>
        </tr>
      </tbody>
    </table>

    <hr />

    <h2>Consulta de CEP</h2>
    <input v-model="cep" placeholder="Digite o CEP" maxlength="8" />
    <button @click="buscarCep">Buscar CEP</button>

    <div v-if="endereco">
      <p><strong>Logradouro:</strong> {{ endereco.logradouro }}</p>
      <p><strong>Bairro:</strong> {{ endereco.bairro }}</p>
      <p><strong>Cidade:</strong> {{ endereco.localidade }}</p>
      <p><strong>Estado:</strong> {{ endereco.uf }}</p>
    </div>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  data() {
    return {
      usuarios: [],
      cep: '',
      endereco: null
    };
  },
  mounted() {
    this.buscarUsuarios();
  },
  methods: {
    // Buscar usuários
    buscarUsuarios() {
      axios.get('http://localhost:3000/usuarios')
        .then(response => {
          this.usuarios = response.data;
        })
        .catch(error => {
          console.error('Erro ao buscar usuários:', error);
        });
    },

    // Deletar usuário
    deletarUsuario(id) {
      console.log('Tentando deletar o usuário com ID:', id); 
      axios.delete(`http://localhost:3000/usuarios/${id}`)
        .then(response => {
          console.log('Resposta do DELETE:', response.data); 
          this.buscarUsuarios();
        })
        .catch(error => {
          console.error('Erro ao deletar usuário:', error.response || error.message); 
        });
    },

    // Buscar endereço pelo CEP usando ViaCEP
    buscarCep() {
      if (this.cep.length !== 8) {
        alert('Digite um CEP válido com 8 dígitos!');
        return;
      }
      axios.get(`https://viacep.com.br/ws/${this.cep}/json/`)
        .then(response => {
          if (response.data.erro) {
            alert('CEP não encontrado!');
            this.endereco = null;
          } else {
            this.endereco = response.data;
          }
        })
        .catch(error => {
          console.error('Erro ao buscar CEP:', error);
        });
    }
  }
};
</script>

<style>
.container {
  max-width: 600px;
  margin: 40px auto;
  font-family: Arial, sans-serif;
  text-align: center;
}
table {
  width: 100%;
  border-collapse: collapse;
  margin-top: 20px;
}
th, td {
  padding: 10px;
}
th {
  background-color: #f0f0f0;
}
button {
  background: red;
  color: white;
  border: none;
  padding: 5px 10px;
  cursor: pointer;
  margin-top: 10px;
}
button:hover {
  background: darkred;
}
input {
  padding: 5px;
  margin: 10px;
  width: 200px;
}
hr {
  margin: 30px 0;
}
</style>
