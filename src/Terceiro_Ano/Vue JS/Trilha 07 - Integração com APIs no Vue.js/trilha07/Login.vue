<template>
  <div>
    <h2>Login</h2>
    <input v-model="email" type="email" placeholder="Email" />
    <input v-model="senha" type="password" placeholder="Senha" />
    <button @click="login">Entrar</button>
    <div v-if="loading">Conectando...</div>
    <div v-if="erro" style="color: red;">{{ erro }}</div>
  </div>
</template>
<script>
import { ref } from 'vue';
import api from '../services/api';
export default {
  setup() {
    const email = ref('');
    const senha = ref('');
    const loading = ref(false);
    const erro = ref('');

    const login = async () => {
      if (!email.value || !senha.value) {
        erro.value = 'Preencha email e senha.';
        return;
      }
      loading.value = true;
      erro.value = '';
      try {
        const response = await api.post('/auth/login', {
          email: email.value,
          password: senha.value
        });
        const token = response.data.token;
        localStorage.setItem('token', token);
        alert('Login realizado com sucesso!');        
      } catch (err) {
        console.error(err);
        if (err.response && err.response.status === 401) {
          erro.value = 'Email ou senha inválidos.';
        } else {
          erro.value = 'Erro ao conectar na API. Tente novamente.';
        }
      } finally {
        loading.value = false;
      }
    };
    return { email, senha, loading, erro, login };
  }
};
</script>
<style>
input {
  display: block;
  margin-bottom: 10px;
  padding: 5px;
}
button {
  padding: 5px 10px;
  cursor: pointer;
}
</style>


