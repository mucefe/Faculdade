document.addEventListener("DOMContentLoaded", function () {
    
    window.onload=ajustarTexto;

    window.onresize=ajustarTexto;


    function ajustarTexto(){
        const letraQ = document.getElementById('letraQ');
        const letraP = document.getElementById('letraP');
        const letraC = document.getElementById('letraC');
        const letraB = document.getElementById('letraB');
        const letraF = document.getElementById('letraF');
        const letraA = document.getElementById('letraA');

        const divsVazias = document.querySelectorAll('.vazia');

        if (window.innerWidth<=428){
            letraQ.innerText='Quem Somos';
            letraP.innerText='Projetos';
            letraC.innerText='Contato';
            letraB.innerText='Blog';
            letraF.innerText='Faça Parte';
            letraA.innerText='Apoio';
            
            divsVazias.forEach(elemento => {
                elemento.style.visibility = 'hidden';
            });

        } else {
            letraQ.innerText='Q';
            letraP.innerText='P';
            letraC.innerText='C';
            letraB.innerText='B';
            letraF.innerText='F';
            letraA.innerText='A';

            divsVazias.forEach(elemento => {
                elemento.style.visibility = 'visible';
            });
        }
    }
    
    
    var letraQ = document.getElementById('letraQ');   
    
    letraQ.addEventListener('mouseover', () => {
        letraQ.innerText = 'quem somos';
        letraQ.style.fontSize = '12px';
        letraQ.style.fontFamily = 'Merriweather';
    });

    letraQ.addEventListener('mouseout', () => {
        letraQ.innerText = 'Q';
        letraQ.style.fontSize = '60px';
        letraQ.style.fontFamily = 'Gorditas';
    });

    var letraP = document.getElementById('letraP');   
    
    letraP.addEventListener('mouseover', () => {
        letraP.innerText = 'projetos';
        letraP.style.fontSize = '12px';
        letraP.style.fontFamily = 'Merriweather';
    });

    letraP.addEventListener('mouseout', () => {
        letraP.innerText = 'P';
        letraP.style.fontSize = '60px';
        letraP.style.fontFamily = 'Gorditas';
    });

    var letraC = document.getElementById('letraC');   
    
    letraC.addEventListener('mouseover', () => {
        letraC.innerText = 'contato';
        letraC.style.fontSize = '12px';
        letraC.style.fontFamily = 'Merriweather';
    });

    letraC.addEventListener('mouseout', () => {
        letraC.innerText = 'C';
        letraC.style.fontSize = '60px';
        letraC.style.fontFamily = 'Gorditas';
    });

    var letraB = document.getElementById('letraB');   
    
    letraB.addEventListener('mouseover', () => {
        letraB.innerText = 'blog';
        letraB.style.fontSize = '12px';
        letraB.style.fontFamily = 'Merriweather';
    });

    letraB.addEventListener('mouseout', () => {
        letraB.innerText = 'B';
        letraB.style.fontSize = '60px';
        letraB.style.fontFamily = 'Gorditas';
    });

    var letraF = document.getElementById('letraF');   
    
    letraF.addEventListener('mouseover', () => {
        letraF.innerText = 'faça parte';
        letraF.style.fontSize = '12px';
        letraF.style.fontFamily = 'Merriweather';
    });

    letraF.addEventListener('mouseout', () => {
        letraF.innerText = 'F';
        letraF.style.fontSize = '60px';
        letraF.style.fontFamily = 'Gorditas';
    });

    var letraA = document.getElementById('letraA');   
    
    letraA.addEventListener('mouseover', () => {
        letraA.innerText = 'apoio';
        letraA.style.fontSize = '12px';
        letraA.style.fontFamily = 'Merriweather';
    });

    letraA.addEventListener('mouseout', () => {
        letraA.innerText = 'A';
        letraA.style.fontSize = '60px';
        letraA.style.fontFamily = 'Gorditas';
    });


});
