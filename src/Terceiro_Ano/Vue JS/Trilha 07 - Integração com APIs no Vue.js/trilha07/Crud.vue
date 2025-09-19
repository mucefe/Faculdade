<template>
  <div>
    <h2>CRUD de Posts</h2>
    <form @submit.prevent="salvarPost">
      <input v-model="novoPost.title" placeholder="Título" required />
      <textarea v-model="novoPost.body" placeholder="Conteúdo" required></textarea>
      <button type="submit">{{ editando ? 'Atualizar' : 'Adicionar' }}</button>
      <button v-if="editando" type="button" @click="cancelarEdicao">Cancelar</button>
    </form>
    <ul>
      <li v-for="post in posts" :key="post.id">
        <h3>{{ post.title }}</h3>
        <p>{{ post.body }}</p>
        <button @click="editarPost(post)">Editar</button>
        <button @click="excluirPost(post.id)">Excluir</button>
      </li>
    </ul>
    <div v-if="loading">Carregando...</div>
    <div v-if="erro" style="color:red;">{{ erro }}</div>
  </div>
</template>

<script>
import axios from 'axios';
export default {
  data() {
    return {
      posts: [],
      novoPost: {
        title: '',
        body: ''
      },
      editando: false,
      idEditando: null,
      loading: false,
      erro: ''
    };
  },
  mounted() {
    this.listarPosts();
  },
  methods: {
    async listarPosts() {
      this.loading = true;
      this.erro = '';
      try {
        const response = await axios.get('https://jsonplaceholder.typicode.com/posts?_limit=10');
        this.posts = response.data;
      } catch (err) {
        console.error(err);
        this.erro = 'Erro ao carregar posts.';
      } finally {
        this.loading = false;
      }
    },
    async salvarPost() {
      this.loading = true;
      this.erro = '';

      try {
        if (this.editando) {
          // Atualiza o post existente
          await axios.put(`https://jsonplaceholder.typicode.com/posts/${this.idEditando}`, this.novoPost);
          const index = this.posts.findIndex(p => p.id === this.idEditando);
          this.posts[index] = { id: this.idEditando, ...this.novoPost };
          this.editando = false;
          this.idEditando = null;
        } else {
          // Adiciona novo post
          const response = await axios.post('https://jsonplaceholder.typicode.com/posts', this.novoPost);
          this.posts.unshift(response.data);
        }
        this.novoPost.title = '';
        this.novoPost.body = '';
      } catch (err) {
        console.error(err);
        this.erro = 'Erro ao salvar o post.';
      } finally {
        this.loading = false;
      }
    },
    editarPost(post) {
      this.novoPost.title = post.title;
      this.novoPost.body = post.body;
      this.editando = true;
      this.idEditando = post.id;
    },
    cancelarEdicao() {
      this.editando = false;
      this.idEditando = null;
      this.novoPost.title = '';
      this.novoPost.body = '';
    },
    async excluirPost(id) {
      if (!confirm('Deseja realmente excluir este post?')) return;
      this.loading = true;
      this.erro = '';
      try {
        await axios.delete(`https://jsonplaceholder.typicode.com/posts/${id}`);
        this.posts = this.posts.filter(p => p.id !== id);
      } catch (err) {
        console.error(err);
        this.erro = 'Erro ao excluir o post.';
      } finally {
        this.loading = false;
      }
    }
  }
};
</script>

<style>
form {
  margin-bottom: 20px;
}
input, textarea {
  display: block;
  margin-bottom: 10px;
  padding: 5px;
  width: 300px;
}
button {
  margin-right: 5px;
  padding: 5px 10px;
  cursor: pointer;
}
ul {
  list-style: none;
  padding: 0;
}
li {
  border: 1px solid #ccc;
  padding: 10px;
  margin-bottom: 10px;
}
</style>
