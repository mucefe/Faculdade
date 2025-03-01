const div = document.querySelector('.divProjeto');
var divBoxShadow = getComputedStyle(div).boxShadow;
console.log(divBoxShadow);
const elementos = div.querySelectorAll('*');
div.addEventListener('mouseenter', () => {
    var boxShadowOriginal = 
    div.style.boxShadow = "0px 4px 10px rgba(0, 0, 0, 0.5)";
    elementos.forEach(el => {        
        div.style.transform = "scale(1.2)";
    });

    div.addEventListener('mouseleave', () => {
        div.style.boxShadow = "none";
        elementos.forEach(el => {
            div.style.transform = "scale(1)";
            div.style.boxShadow = divBoxShadow;
        });
    });

});