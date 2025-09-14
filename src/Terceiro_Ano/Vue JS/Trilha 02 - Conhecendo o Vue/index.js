const app = Vue.createApp({
    data() {
        return {
            lista: ['Item 1', 'Item 2', 'Item 3'],
            novoItem: ''    
        };
    },
    methods: {
        adicionarItem() {
            if (this.novoItem.trim() !== '') {
                this.lista.push(this.novoItem);
                this.novoItem = '';
            }
        },
        removerItem(index) {
            this.lista.splice(index, 1);
        }
    }
});

app.mount('#app');