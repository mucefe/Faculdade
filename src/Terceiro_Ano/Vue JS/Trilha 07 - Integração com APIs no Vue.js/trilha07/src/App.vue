<template>
  <div>
    <h1>Busca de Endereço por CEP</h1>
    <input
      type="text"
      v-model="cep"
      placeholder="Digite o CEP (somente números)"
      @keyup.enter="buscarEndereco"
    />
    <button @click="buscarEndereco">Buscar</button>

    <div v-if="loadingCep">
      <p>Carregando endereço...</p>
    </div>
    <div v-else-if="erroCep">
      <p style="color: red;">{{ erroCep }}</p>
    </div>
    <div v-else-if="endereco">
      <h2>Endereço:</h2>
      <p>{{ endereco.logradouro }}, {{ endereco.bairro }}</p>
      <p>{{ endereco.localidade }} - {{ endereco.uf }}</p>
    </div>
  </div>
</template>
<script setup>
import { ref } from 'vue';
import viaCepApi from './services/viacep';
const cep = ref('');
const endereco = ref(null);
const loadingCep = ref(false);
const erroCep = ref('');
const buscarEndereco = async () => {
  if (!cep.value) return;
  loadingCep.value = true;
  erroCep.value = '';
  endereco.value = null;
  try {
    const response = await viaCepApi.get(`/${cep.value}/json/`);
    if (response.data.erro) {
      erroCep.value = 'CEP não encontrado.';
    } else {
      endereco.value = response.data;
    }
  } catch (err) {
    erroCep.value = 'Erro ao buscar o CEP. Verifique e tente novamente.';
    console.error(err);
  } finally {
    loadingCep.value = false;
  }
};
</script>
<style>
input {
  padding: 5px;
  margin-right: 10px;
  margin-bottom: 10px;
}
button {
  padding: 5px 10px;
  cursor: pointer;
  margin-bottom: 10px;
}
hr {
  margin: 30px 0;
}
</style>
