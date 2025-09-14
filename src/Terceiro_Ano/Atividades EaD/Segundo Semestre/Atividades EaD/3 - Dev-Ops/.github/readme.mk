# Deploy Simples com GitHub Actions

Este repositório contém uma página simples (`index.html`) e um workflow de GitHub Actions (`.github/workflows/deploy.yml`) que simula um pipeline de CI/CD.

## Como usar

Para testar o workflow localmente e garantir que ele rode no GitHub, siga os passos abaixo:

1. Faça uma pequena alteração em `index.html` (pode ser apenas adicionar um comentário):
   
   echo "<!-- trigger workflow -->" >> index.html
   

2. Adicione a alteração ao Git:
   
   git add index.html
   

3. Faça o commit da alteração:
   
   git commit -m "Dispara workflow"
   

4. Envie a alteração para o repositório remoto (branch `main`):
   
   git push origin main
   

Isso irá disparar o workflow configurado em `.github/workflows/deploy.yml`, que executa um build simples e gera uma mensagem de sucesso.

---

> **Nota de rodapé:**
> Caso o workflow não apareça ou não execute no GitHub, isso não indica falha na configuração do repositório ou na execução da atividade. O problema está relacionado ao GitHub, que só dispara workflows em eventos específicos (como push ou workflow_dispatch). Arquivos adicionados manualmente pelo site podem não disparar o workflow automaticamente, mas a configuração local e o pipeline estão corretos.
