COLDIGO.produto = new Object();

$(document).ready(function() {
	console.log("product.js");
	COLDIGO.produto.carregarMarcas = function(){
		
		$.ajax({
			type: "GET",
			url: "/ProjetoTrilhaWeb/rest/marca/buscar",
			success: function(marcas) {	
				if (marcas!=""){
					$("#selMarca").html("");
					var option = document.createElement("option");
					option.setAttribute("value","");
					option.innerHTML = ("Escolha");
					$("#selMarca").append(option);
					
					for(var i=0;i<marcas.length;i++){
						var option = document.createElement("option");
						option.setAttribute("value", marcas[i].id);
						option.innerHTML = (marcas[i].nome);
						$("#selMarca").append(option);
					}
				} else {
					$("#selMarca").html("");
					
					var option = document.createElement("option");
					option.setAttribute("value","");
					option.innerHTML = ("Cadastre uma marca primeiro!");
					$("#selMarca").append(option);
					$("#selMarca").addClass("aviso");
				}
			},
			error: function(info) {
				
				COLDIGO.exibirAviso("Erro ao buscar as marcas: " + info.status + " - " + info.statusText);
				$("#selMarca").html("");
				var option = document.createElement("option");
				option.setAttribute("value","");
				option.innerHTML = ("Erro ao carregar marcas!");
				$("#selMarca").apppend(option);
				$("#selMarca").addClass("aviso");
			}
		});
	}	
	COLDIGO.produto.carregarMarcas();
	
})