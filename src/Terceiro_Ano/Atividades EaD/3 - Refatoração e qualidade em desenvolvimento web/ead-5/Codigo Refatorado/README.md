                        EaD 5 -  Projeto de Refatoração de Código HTML, CSS e JavaScript
Descrição do Projeto

Este projeto consiste na refatoração de um código HTML, CSS e JavaScript para melhorar sua organização, modularidade e manutenção. A principal meta foi separar as regras de estilo do HTML, garantindo um código mais limpo e estruturado. Além disso, foram feitas otimizações no JavaScript para melhorar a legibilidade, prevenir erros e aprimorar a experiência do usuário ao interagir com os formulários.

                                        Como Rodar o Projeto

Siga os passos abaixo para rodar o projeto corretamente:

    Clonar o repositório
    git clone https://github.com/seu-usuario/nome-do-repositorio.git

    Acessar o diretório do projeto
    cd nome-do-repositorio

    Abrir o arquivo HTML no navegador

        Você pode simplesmente abrir o arquivo index.html em qualquer navegador moderno.

        Alternativamente, se quiser rodar um servidor local, utilize a extensão Live Server no VS Code ou o comando:
        npx serve .

Problemas Encontrados e Motivos dos Ajustes

Durante a análise e refatoração do código, foram identificados diversos problemas que impactavam a estrutura e manutenção do projeto. Abaixo estão os principais problemas e as soluções aplicadas:
1 -  Uso excessivo de estilos inline no HTML

    Problema: O código original possuía muitas regras CSS diretamente dentro das tags HTML, dificultando a manutenção e a padronização do design.

    Solução: Todo o estilo foi transferido para um arquivo CSS externo (styles.css), garantindo modularidade e reaproveitamento.

2 -  Tag <style> dentro do <head>

    Problema: O código continha uma seção <style> dentro do <head>, misturando estrutura e estilização.

    Solução: Esse bloco foi removido e suas regras incorporadas no arquivo CSS externo.

3 - Uso de <center> no HTML

    Problema: O alinhamento do título principal usava a tag <center>, que é obsoleta.

    Solução: Foi substituído por text-align: center; no CSS.

4 - Estilização inconsistente dos botões

    Problema: Os botões possuíam estilos duplicados e conflitantes.

    Solução: Criamos uma classe CSS padronizada para botões, garantindo consistência no design.

5 -  JavaScript sem validação e código pouco legível

    Problema: O evento de submissão do formulário não garantia que os campos estivessem preenchidos, e a concatenação de strings dificultava a leitura.

    Solução:

        Adicionamos trim() para evitar espaços em branco.

        Implementamos uma validação para impedir submissão com campos vazios.

        Substituímos concatenação por template literals (${}) para melhor legibilidade.

        Garantimos que o script execute apenas quando o DOM estiver completamente carregado.

6 - Falta de modularização no JavaScript

    Problema: O código JavaScript estava misturado sem uma estrutura clara.

    Solução: Criamos funções separadas para cada funcionalidade, tornando o código mais organizado e reutilizável.



Conclusão

Com essas mudanças, o código se tornou mais limpo, organizado e de fácil manutenção. A separação entre HTML, CSS e JavaScript melhora a escalabilidade do projeto e permite futuras melhorias sem comprometer a estrutura existente.