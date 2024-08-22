COLDIGO.produto = new Object();

$(document).ready(function() {
	console.log("product.js");
	COLDIGO.produto.carregarMarcas = function(){
		
		$.ajax({
			type: "GET",
			URL: "/ProjetoTrilhaWeb/rest/marca/buscar",
			success: function(marcas) {	
				console.log("Teste de marcas " + marcas);
						
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