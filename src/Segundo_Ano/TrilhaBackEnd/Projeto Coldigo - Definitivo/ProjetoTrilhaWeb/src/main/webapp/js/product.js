COLDIGO.produto = {}; 

$(document).ready(function() {
	

	COLDIGO.produto.carregarMarcas = function(id) {
		if (id != undefined) {
			select = "#selMarcaEdicao";
		} else {
			select = "#selMarca";
		}
		$.ajax({
			type: "GET",
			url: COLDIGO.PATH + "/marca/buscar",
			success: function(marcas) {	
				if (marcas != "") {
					$(select).html("");
					var option = document.createElement("option");
					option.setAttribute("value", "");
					option.innerHTML = ("Escolha");
					$(select).append(option);

					for (var i = 0; i < marcas.length; i++) {
						var option = document.createElement("option");
						option.setAttribute("value", marcas[i].id);
						if ((id != undefined) && (id == marcas[i].id)) {
							option.setAttribute("selected", "selected");
						}
						option.innerHTML = (marcas[i].nome);
						$(select).append(option);
					}
				} else {
					$(select).html("");
					var option = document.createElement("option");
					option.setAttribute("value", "");
					option.innerHTML = ("Cadastre uma marca primeiro!");
					$(select).append(option);
					$(select).addClass("aviso");
				}
			},
			error: function(info) {
				COLDIGO.exibirAviso("Erro ao buscar as marcas: " + info.status + " - " + info.statusText);
				$(select).html("");
				var option = document.createElement("option");
				option.setAttribute("value", "");
				option.innerHTML = ("Erro ao carregar marcas!");
				$(select).append(option);
				$(select).addClass("aviso");
			}
		});
	};

	COLDIGO.produto.carregarMarcas();

	COLDIGO.produto.cadastrar = function() {
		var produto = {};
		produto.categoria = document.frmAddProduto.categoria.value;
		produto.marcaId = document.frmAddProduto.selMarca.value;  
		produto.modelo = document.frmAddProduto.modelo.value;
		produto.capacidade = document.frmAddProduto.capacidade.value;
		produto.valor = document.frmAddProduto.valor.value;

		if (produto.categoria == "" || produto.marcaId == "" || produto.modelo == "" || produto.capacidade == "" || produto.valor === "") {
			COLDIGO.exibirAviso("Preencha todos os campos!");
		} else {
			$.ajax({
				type: "POST",
				url: COLDIGO.PATH + "/produto/inserir",
				data: JSON.stringify(produto),
				success: function(msg) {
					COLDIGO.exibirAviso(msg);
					$("#addProduto").trigger("reset");
					COLDIGO.produto.buscar();
				},
				error: function(info) {
					COLDIGO.exibirAviso("Erro ao cadastrar um novo produto: " + info.status + ". " + info.statusText);
				}
			});
		}
	};

	COLDIGO.produto.buscar = function() {
		var valorBusca = $("#campoBuscaProduto").val();
		console.log("Valor de busca enviado: ", valorBusca);  // Adicionado para verificar valor

		$.ajax({
			type: "GET",
			url: COLDIGO.PATH + "/produto/buscar",
			data: { valorBusca: valorBusca },
			success: function(dados) {
				dados = JSON.parse(dados);
				console.log("Dados recebidos do servidor:", dados);  // Adicionado para log de resposta
				$("#listaProdutos").html(COLDIGO.produto.exibir(dados));
			},
			error: function(info) {
				COLDIGO.exibirAviso("Erro ao consultar os produtos: " + info.status + " - " + info.statusText); 
			}
		});
	};

	COLDIGO.produto.exibir = function(listaDeProdutos) {
    var tabela = "<table>" +
        "<tr>" + 
        "<th>Categoria</th>" +
        "<th>Marca</th>" +
        "<th>Modelo</th>" +
        "<th>Cap.(1)</th>" +
        "<th>Valor</th>" +
        "<th class='acoes'>Ações</th>" +
        "</tr>";                            

    if (listaDeProdutos != undefined && listaDeProdutos.length > 0) {
        for (var i = 0; i < listaDeProdutos.length; i++) {
            tabela += "<tr>" +
                "<td>" + listaDeProdutos[i].categoria + "</td>" +
                "<td>" + listaDeProdutos[i].marcaNome + "</td>" +
                "<td>" + listaDeProdutos[i].modelo + "</td>" +
                "<td>" + listaDeProdutos[i].capacidade + "</td>" +
                "<td> R$ " + COLDIGO.formatarDinheiro(listaDeProdutos[i].valor) + "</td>" +
                "<td>" + 
                    "<a onclick=\"COLDIGO.produto.exibirEdicao('" + listaDeProdutos[i].id + "')\"><img src='../../imgs/edit.png' alt='Editar registro'></a>" +
                    "<a onclick=\"COLDIGO.produto.excluir('" + listaDeProdutos[i].id + "')\"><img src='../../imgs/delete.png' alt='Excluir registro'></a>" +
                "</td>" + 
                "</tr>";
        }
    } else {
        tabela += "<tr><td colspan='6'>Nenhum registro encontrado</td></tr>";
    }
    
    tabela += "</table>";
    console.log("Tabela gerada: ", tabela);  // Adiciona log para verificar a tabela gerada
    return tabela;
};


	COLDIGO.produto.buscar();
	
	COLDIGO.produto.excluir = function(id) {
		console.log("Passou pelo AJAX");
		console.log(id);
		console.log("url: " + COLDIGO.PATH);
		$.ajax({
			type: "DELETE",
			url: COLDIGO.PATH + "/produto/excluir/" + id,
			success: function(msg) {
				console.log("sucesso");
				COLDIGO.exibirAviso(msg);
				COLDIGO.produto.buscar();
			},
			error: function(info) {
				COLDIGO.exibirAviso("Erro ao excluir produto: " + info.status + " - " + info.statusText);
			}
		});
	};

	COLDIGO.produto.exibirEdicao = function(id) {
		console.log("exibirEdicao");
		$.ajax({
			type: "GET",
			url: COLDIGO.PATH + "/produto/buscarPorId",
			data: "id=" + id,
			success: function(produto) {
				console.log(produto); // Para verificar se o valor está vindo corretamente

				// Definir valores no formulário de edição
				document.frmEditaProduto.idProduto.value = produto.id;
				document.frmEditaProduto.modelo.value = produto.modelo;
				document.frmEditaProduto.capacidade.value = produto.capacidade;
				document.frmEditaProduto.valor.value = produto.valor; // Certifique-se de que o campo "valor" exista no formulário
				
				// Ajuste para seleção da categoria correta
				var selCategoria = document.getElementById('selCategoriaEdicao');
				for (var i = 0; i < selCategoria.options.length; i++) {
					if (selCategoria.options[i].value == produto.categoria) {
						selCategoria.options[i].setAttribute("selected", "selected");
					} else {
						selCategoria.options[i].removeAttribute("selected");
					}
				}
				COLDIGO.produto.carregarMarcas(produto.marcaId);

				// Definir e abrir o modal de edição
				var modalEditaProduto = {
					title: "Editar Produto",
					height: 500,	// Aumentei a altura para garantir que todos os campos estejam visíveis				
					width: 550,
					modal: true,
					buttons: {
						"Salvar": function() {
							COLDIGO.produto.editar();
						},
						"Cancelar": function() {
							$(this).dialog("close");
						}
					},
					close: function() {
						// Fechar o modal
					}
				};
				$("#modalEditaProduto").dialog(modalEditaProduto);
			},
			error: function(info) {
				COLDIGO.exibirAviso("Erro ao buscar produto para edição: " + info.status + " - " + info.statusText);
			}
		});
	};

	COLDIGO.produto.editar = function() {
		var produto = new Object();
		produto.id = document.frmEditaProduto.idProduto.value;
		produto.categoria = document.frmEditaProduto.categoria.value;
		produto.marcaId = document.frmEditaProduto.marcaId.value;
		produto.modelo = document.frmEditaProduto.modelo.value;
		produto.capacidade = document.frmEditaProduto.capacidade.value;
		produto.valor = document.frmEditaProduto.valor.value;

		$.ajax({
			type: "PUT",
			url: COLDIGO.PATH + "/produto/alterar",
			data: JSON.stringify(produto),
			success: function(msg) {
				COLDIGO.exibirAviso(msg);
				COLDIGO.produto.buscar();
				$("#modalEditaProduto").dialog("close");
				COLDIGO.produto.buscar(); // Atualiza a lista de produtos
			},
			error: function(info) {
				COLDIGO.exibirAviso("Erro ao editar produto: " + info.status + " - " + info.statusText);
			}
		});
	};
});
