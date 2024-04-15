function validaFaleConosco() {
    if (document.frmfaleconosco.txtnome.value == "") {
        alert("Preencha o campo Nome!");
        document.frmfaleconosco.txtnome.focus();
        return false;
    }

    if (document.frmfaleconosco.txtfone.value == "") {
        alert("Preencha o campo Telefone!");
        document.frmfaleconosco.txtfone.focus();
        return false;
    }

    if (document.frmfaleconosco.txtemail.value == "") {
        alert("Preencha o campo Email!");
        document.frmfaleconosco.txtemail.focus();
        return false;
    }

    if (document.frmfaleconosco.selmotivo.value == "") {
        alert("Preencha o campo Motivo!");
        document.frmfaleconosco.selmotivo.focus();
        return false;
    }

    if (documento.frmfaleconoscotxacomentario.value == "") {
        alert("Preencha o campo Motivo!");
        document.frmfaleconosco.txacomentario.focus();
        return false;
    }
    return true;
}

function verificaMotivo(motivo) {

    var elemento = document.getElementById("opcaoproduto");

    if (motivo == "PR") {
        var select = document.createElement("select");
        select.setAttribute("name", "selproduto");

        var option = document.createElement("option");
        option.setAttribute("value", "FR");
        var texto = document.createTextNode("Freezer");
        option.appendChild(texto);
        select.appendChild(option);
        var option = document.createElement("option");
        option.setAttribute("value", "GE");
        var texto = document.createTextNode("Geladeira");
        option.appendChild(texto);
        select.appendChild(option);
        elemento.appendChild(select);
        } else {
        if (elemento.firstChild)
            elemento.removeChild(elemento.firstChild);
        
        }   
}
 function verificaNome(){
var nome = document.frmfaleconosco.txtnome.value;           // Recebe o valor do campo txtnome em uma variável


var expRegNome = new RegExp("^[A-zÀ-ü]{3,}([ ]{1}[A-zÀ-ü]{2,})+$");  // Cria a expressão regular como um objeto de 
                                                                   // ExpReg e o atribui a expRegNome
if (!expRegNome.test(nome)){                              // Testar o nome digitado com a expressão regular, onde se o resultado for
                                                          // falso (devido ao caractere “!”, que assim como no Java, representa
                                                        // negação), mostra o alerta, foca no campo e retorna falso.
    alert("Preencha o campo Nome corretamente");
    document.frmfaleconosco.txtnome.focus();
    return false;
}
}

function verificatelefone(){
var fone = document.frmfaleconosco.txtfone.value;
var expRegFone = new RegExp ("^[(]{1}[1-9]{2}[)]{1}[0-9]{4,5}[-]{1}[0-9]{4,5}$");

if (!expRegFone.test(fone)){
    alert("Preencha o campo Telefone corretamente.");
document.frmfaleconosco.txtfone.focus();
return false;
}


}