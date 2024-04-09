

function verificaNome(){
    var nome = document.frmJunteSeANos.campoNome.value;           
    
    
    var expRegNome = new RegExp("^[A-zÀ-ü]{3,}([ ]{1}[A-zÀ-ü]{2,})+$");   
                                                                       
    if (!expRegNome.test(nome)){                              
        alert("Preencha o campo Nome corretamente");
        document.frmJunteSeANos.txtnome.focus();
        return false;
    }
    }
    function verificaCPF(){
        var cpf = document.frmJunteSeANos.campoCPF.value;           
        
        var expRegCPF = new RegExp("^[0-9]{3}\.?[0-9]{3}\.?[0-9]{3}\-?[0-9]{2}$");   
                                                                           
        if (!expRegCPF.test(cpf)){                              
            alert("Preencha o campo CPF corretamente");
            document.frmJunteSeANos.campoCPF.value="";
            document.frmJunteSeANos.campoCPF.focus();
            return false;
        }
        }

        async function verificaMunicipio() {
            var nomeMunicipio = document.frmJunteSeANos.cidade.value;
            const response = await fetch('https://servicodados.ibge.gov.br/api/v1/localidades/municipios');
            const municipios = await response.json();
            const nomesMunicipios = municipios.map(municipio => municipio.nome);
            if (!nomesMunicipios.includes(nomeMunicipio)){
                alert("Cidade inválida")
                document.frmJunteSeANos.cidade.value="";
            }
        }
        
        
  