frmfaleconosco.addEventListener('DOMContentLoaded', function() {
    const form = frmfaleconosco.forms['frmfaleconosco'];
    
    form.addEventListener('submit', function(event) {
        if (!validaFaleConosco()) {
            event.preventDefault();
        }
    });

    frmfaleconosco['txtnome'].addEventListener('change', verificaNome);
    frmfaleconosco['txtendereco'].addEventListener('change', verificaEndereco);
    frmfaleconosco['txttelefone'].addEventListener('change', verificaTelefone);
});

function validaFaleConosco() {
    return verificaNome() && verificaEndereco() && verificaTelefone();
}

function verificaNome() {
    var nome = document.forms['frmfaleconosco']['txtnome'].value;
    var expRegNome = /^[A-Za-zÀ-ÖØ-öø-ÿ\s]+$/;

    if (!expRegNome.test(nome) || nome.trim().length < 3) {
        alert("Preencha o campo Nome corretamente. Ele deve conter pelo menos 3 caracteres, apenas letras e espaços.");
        document.forms['frmfaleconosco']['txtnome'].focus();
        return false;
    }
    return true;
}

function verificaEndereco() {
    var endereco = frmfaleconosco.forms['frmfaleconosco']['txtendereco'].value;
    var expRegEndereco = /^[A-Za-zÀ-ÖØ-öø-ÿ0-9,\s.-]{5,}$/;

    if (!expRegEndereco.test(endereco)) {
        alert("Preencha o campo Endereço corretamente");
        document.forms['frmfaleconosco']['txtendereco'].focus();
        return false;
    }
    return true;
}

function verificaTelefone() {
    var telefone = frmfaleconosco.forms['frmfaleconosco']['txttelefone'].value;
    var expRegTelefone = /^\(\d{2}\)\d{4,5}-\d{4}$/;

    if (!expRegTelefone.test(telefone)) {
        alert("Preencha o campo Telefone corretamente.");
        document.forms['frmfaleconosco']['txttelefone'].focus();
        return false;
    }
    return true;
}

