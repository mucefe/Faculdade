package desafio_final;

import java.util.Scanner;

// Este é o código de um programa para administrar doações de ração e medicamentos para cães e gatos.
// O código foi apresentado com o desafio final da trilha de Java no curso de Análise e Desenvolvimento de Sistemas
// da UniSenai.


public class Principal {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Variáveis Operacionais
		int opcao = 0;
		boolean continua = false;
		double peso = 0;
		int quantidade = 0;

		
		// Variáveis de dados
		double deli_dogP = 100.0; // As variáveis de dados foram inicializadas com 100 
		double deli_dogM = 100.0; // para fins de teste.
		double deli_dogG = 100.0;
		double deli_dogT = 100.0;
		double royal_caninP = 100.0;
		double royal_caninM = 100.0;
		double royal_caninG = 100.0;
		double royal_caninT = 100.0;
		double biribaP = 100.0;
		double biribaM = 100.0;
		double biribaG = 100.0;
		double biribaT = 100.0;
		double whiskasF = 100.0;
		double whiskasA = 100.0;
		double whiskasC = 100.0;
		double whiskasT = 100.0;
		double friskiesF = 100.0;
		double friskiesA = 100.0;
		double friskiesC = 100.0;
		double friskiesT = 100.0;
		double premierF = 100.0;
		double premierA = 100.0;
		double premierC = 100.0;
		double premierT = 100.0;
		int rimadyl = 100;
		int cerenia = 100;
		int apoquel = 100;
		int metacam = 100;
		int felimazole = 100;
		int profender = 100;

		
		// Programa
		do {

			System.out.println("LÓGICA DE PROGRAMAÇÃO - Desafio Final");
			System.out.println("\nEste programa tem por finalidade controlar o recebimento e os estoques de doações de rações de cães e gatos.");
			System.out.println("\n1 - Cadastrar Nova Doação;");
			System.out.println("\n2 - Verificar Estoques;");
			System.out.println("\n3 - Retirar Estoques;");
			System.out.print("\nDigite o número da opção desejada: ");
			int cadastraOuVerifica = sc.nextInt();

			switch (cadastraOuVerifica) {
			case 1:

				System.out.println("CADASTRAR NOVA DOAÇÃO:");
				System.out.println("\n1 - Ração para cães;");
				System.out.println("\n2 - Ração para gatos;");
				System.out.print("\nDigite o número da opção desejada: ");
				int caesOuGatos = sc.nextInt();

				switch (caesOuGatos) {
				case 1:

					System.out.println("RAÇÃO PARA CÃES");
					System.out.println("\n1 - Cães de pequeno porte;");
					System.out.println("\n2 - Cães de médio porte;");
					System.out.println("\n3 - Cães de grande porte;");
					System.out.print("\nDigite o número da opção desejada: ");
					int caes = sc.nextInt();

					switch (caes) {
					case 1:

						System.out.println("CÃES DE PEQUENO PORTE");
						System.out.println("\nMarcas disponíveis: ");
						System.out.println("\n1 - Deli Dog;");
						System.out.println("\n2 - Royal Canin;");
						System.out.println("\n3 - Biriba;");
						System.out.print("\nDigite o número da opção desejada: ");
						int caesP = sc.nextInt();

						switch (caesP) {
						case 1:

							System.out.print("\nInsira o peso(kg) da embalagem: ");
							deli_dogP = sc.nextDouble();
							System.out
									.println("\n" + deli_dogP + " kg de ração Deli Dog contabilizados com sucesso.\n");
							continua = continuaOuNao();
							break;

						case 2:

							System.out.print("\nInsira o peso(kg) da embalagem: ");
							royal_caninP = sc.nextDouble();
							System.out.println(
									"\n" + royal_caninP + " kg de ração Royal Canin contabilizados com sucesso.\n");
							continua = continuaOuNao();
							break;

						case 3:

							System.out.print("\nInsira o peso(kg) da embalagem: ");
							biribaP = sc.nextDouble();

							System.out.println("\n" + biribaP + " kg de ração Biriba contabilizados com sucesso.\n");
							continua = continuaOuNao();
							break;

						default:

							System.out.println("\nOpção inválida. Digite um número válido.");
							continua = continuaOuNao();
							break;

						}

						break;

					case 2:

						System.out.println("CÃES DE MÉDIO PORTE");
						System.out.println("\n1 - Deli Dog");
						System.out.println("\n2 - Royal Canin");
						System.out.println("\n3 - Biriba");
						System.out.print("\nDigite o número da opção desejada: ");
						int caesM = sc.nextInt();

						switch (caesM) {
						case 1:

							System.out.println("\nDELI DOG");
							System.out.print("\nInsira o peso da embalagem: ");
							deli_dogM = sc.nextDouble();

							System.out
									.println("\n" + deli_dogM + " kg de ração Deli Dog contabilizados com sucesso.\n");
							continua = continuaOuNao();
							break;

						case 2:

							System.out.println("ROYAL CANIN");
							System.out.print("\nInsira o peso da embalagem: ");
							royal_caninM = sc.nextDouble();

							System.out.println(
									"\n" + royal_caninM + " kg de ração Royal Canin contabilizados com sucesso.\n");
							continua = continuaOuNao();
							break;

						case 3:

							System.out.println("BIRIBA");
							System.out.println("\nInsira o peso da embalagem: ");
							biribaM = sc.nextDouble();
							System.out.println("\n" + biribaM + " kg de ração Biriba contabilizados com sucesso.\n");
							continua = continuaOuNao();
							break;

						default:
							System.out.println("\nOpção inválida. Digite um número válido.");
							continua = true;
							break;
						}
						break;

					case 3:

						System.out.println("CÃES DE GRANDE PORTE");
						System.out.println("\n1 - Deli Dog");
						System.out.println("\n2 - Royal Canin");
						System.out.println("\n3 - Biriba");
						System.out.print("\nDigite o número da opção desejada: ");
						int caesG = sc.nextInt();

						switch (caesG) {
						case 1:

							System.out.println("DELI DOG");
							System.out.print("\nInsira o peso(Kg) da embalagem: ");
							deli_dogG = sc.nextDouble();
							System.out
									.println("\n" + deli_dogG + " kg de ração Deli Dog contabilizados com sucesso.\n");
							continua = true;
							break;

						case 2:

							System.out.println("ROYAL CANIN");
							System.out.print("\nInsira o peso(Kg) da embalagem: ");
							royal_caninG = sc.nextDouble();
							System.out.println(
									"\n" + royal_caninG + " kg de ração Royal Canin contabilizados com sucesso.\n");
							continua = true;

							break;

						case 3:

							System.out.println("BIRIBA");
							System.out.print("\nInsira o peso(Kg) da embalagem: ");
							biribaG = sc.nextDouble();
							System.out.println("\n" + biribaG + " kg de ração Biriba contabilizados com sucesso.\n");
							continua = true;
						}
						break;

					default:
						System.out.println("\nOpção inválida. Digite um número inteiro de 1 a 3.");
						break;
					}
					break;

				case 2:

					System.out.println("RAÇÃO PARA GATOS");
					System.out.println("\n1 - Gatos Filhotes;");
					System.out.println("\n2 - Gatos Adultos;");
					System.out.println("\n3 - Gatos Castrados;");
					System.out.print("\nDigite o número da opção desejada: ");
					int gatos = sc.nextInt();

					switch (gatos) {
					case 1:

						System.out.println("GATOS FILHOTES");
						System.out.println("\nMarcas Disponíveis: ");
						System.out.println("\n1 - Whiskas;");
						System.out.println("\n2 - Friskies;");
						System.out.println("\n3 - Premier;");
						System.out.print("\nDigite o número da opção desejada: ");
						opcao = sc.nextInt();

						switch (opcao) {
						case 1:

							System.out.println("WHISKAS");
							System.out.print("\nInsira o peso(Kg) da embalagem: ");
							whiskasF = sc.nextDouble();
							System.out.println("\n" + whiskasF + " kg de ração Whiskas contabilizados com sucesso.\n");
							continua = continuaOuNao();
							break;

						case 2:

							System.out.println("FRISKIES");
							System.out.print("\nInsira o peso(Kg) da embalagem: ");
							friskiesF = sc.nextDouble();
							System.out
									.println("\n" + friskiesF + " kg de ração Friskies contabilizados com sucesso.\n");
							continua = continuaOuNao();

							break;

						case 3:

							System.out.println("PREMIER");
							System.out.println("\nInsira o peso(Kg) da embalagem: ");
							premierF = sc.nextDouble();
							System.out.println("\n" + premierF + " kg de ração Premier contabilizados com sucesso.\n");
							continua = continuaOuNao();
							break;

						default:

							System.out.println("Opção inválida. Digite um número de 1 a 3.");
							continua = true;
						}
						break;

					case 2:

						System.out.println("GATOS ADULTOS");
						System.out.println("\nMarcas Disponﾃｭveis: ");
						System.out.println("\n1 - Whiskas;");
						System.out.println("\n2 - Friskies;");
						System.out.println("\n3 - Premier;");
						System.out.print("\nDigite o número da opção desejada: ");
						int gatosA = sc.nextInt();

						switch (gatosA) {
						case 1:

							System.out.println("WHISKAS");
							System.out.println("\nInsira o peso da embalagem: ");
							whiskasA = sc.nextInt();

							System.out.println("\n" + whiskasA + " kg de ração Whiskas contabilizados com sucesso.\n");
							continua = continuaOuNao();
							break;

						case 2:

							System.out.println("FRISKIES");
							System.out.println("\nInsira o peso(Kg) da embalagem: ");
							friskiesA = sc.nextDouble();
							System.out
									.println("\n" + friskiesA + " kg de ração Friskies contabilizados com sucesso.\n");
							continua = continuaOuNao();
							break;

						case 3:

							System.out.println("PREMIER");
							System.out.println("\nInsira o peso(Kg) da embalagem: ");
							premierA = sc.nextDouble();

							System.out.println("\n" + premierA + " kg de ração Premier contabilizados com sucesso.\n");
							continua = continuaOuNao();
							break;

						default:
							System.out.println("\nOpção inválida. Digite um número de 1 a 3.");
							continua = continuaOuNao();
						}
						break;

					case 3:

						System.out.println("GATOS CASTRADOS");
						System.out.println("Marcas Disponíveis: ");
						System.out.println("\n1 - Whiskas;");
						System.out.println("\n2 - Friskies;");
						System.out.println("\n3 - Premier;");
						System.out.print("\nDigite o número da opção desejada: ");
						int gatosC = sc.nextInt();

						switch (gatosC) {
						case 1:

							System.out.println("WHISKAS");
							System.out.println("\nInsira o peso(Kg) da embalagem: ");
							whiskasC = sc.nextDouble();

							System.out.println("\n" + whiskasC + " kg de ração Whiskas contabilizados com sucesso.\n");
							continua = continuaOuNao();
							break;

						case 2:

							System.out.println("FRISKIES");
							System.out.println("\nInsira o peso(Kg) da embalagem: ");
							friskiesC = sc.nextDouble();
							System.out
									.println("\n" + friskiesC + " kg de ração Friskies contabilizados com sucesso.\n");
							continua = continuaOuNao();
							break;

						case 3:

							System.out.println("PREMIER");
							System.out.print("\nInsira o peso(Kg) da embalagem: ");
							premierC = sc.nextDouble();

							System.out.println("\n" + premierC + " kg de ração Premier contabilizados com sucesso.\n");
							continua = continuaOuNao();

							break;

						default:

							System.out.println("Opção inválida. Digite um número de 1 a 3.");
							continua = true;
							break;
						}

						break;

					default:

						System.out.println("Opção inválida. Digite um número válido.");
						continua = true;
						break;
					}
					break;

				default:

					System.out.println("Opção inválida. Digite um número válido.");

					break;
				}
				break;

			case 2:

				// Cálculos
				deli_dogT = deli_dogP + deli_dogM + deli_dogG;
				royal_caninT = royal_caninP + royal_caninM + royal_caninG;
				biribaT = biribaP + biribaM + biribaG;
				whiskasT = whiskasF + whiskasA + whiskasC;
				friskiesT = friskiesF + friskiesA + friskiesC;
				premierT = premierF + premierA + premierC;

				System.out.println("VERIFICAR ESTOQUES");
				System.out.println("\n1 - Marcas de ração armazenadas; ");
				System.out.println("\n2 - Marcas de ração por porte do animal;");
				System.out.println("\n3 - Quantidade de alimentos por porte do animal;");
				System.out.println("\n4 - Medicamentos para cães;");
				System.out.println("\n5 - Medicamentos para gatos");
				System.out.print("\nDigite o número da opção desejada: ");
				int estoques = sc.nextInt();

				switch (estoques) {
				case 1:

					System.out.println("MARCAS DE RAÇÃO ARMAZENADAS");
					System.out.println("\n1 - Cães;");
					System.out.println("\n2 - Gatos;");
					System.out.println("\nDigite o número da opção desejada: ");
					int racoesCaesOuGatos = sc.nextInt();

					switch (racoesCaesOuGatos) {
					case 1:

						System.out.println("\t\t\tRAÇÕES PARA CÃES");
						System.out.println("\nMarca							Quantidade");
						System.out.println("\nDeli Dog 			       		   	" + deli_dogT + " kg");
						System.out.println("\nRoyal Canin						" + royal_caninT + " kg");
						System.out.println("\nBiriba							" + biribaT + " kg\n");
						continua = continuaOuNao();

						break;

					case 2:

						System.out.println("\t\t\tRAÇÕES PARA GATOS");
						System.out.println("\nMarca							Quantidade");
						System.out.println("\nWhiskas  			       		   	" + whiskasT + " kg");
						System.out.println("\nFriskies 						" + friskiesT + " kg");
						System.out.println("\nPremier							" + premierT + " kg\n");
						continua = continuaOuNao();
						break;

					default:

						System.out.println("Opção inválida. Digite 1 ou 2.");
						continua = true;

						break;

					}

					break;

				case 2:

					System.out.println("MARCAS DE RAÇÃO POR PORTE DO ANIMAL");
					System.out.println("\n1 - Gatos;");
					System.out.println("\n2 - Cães;");
					System.out.print("\nDigite o número da opção desejada: ");
					int porteCaesOuGatos = sc.nextInt();

					switch (porteCaesOuGatos) {
					case 1:

						System.out.println("MARCAS DE RAÇÃO DE GATOS POR PORTE DO ANIMAL");
						System.out.println("\n1 - Filhotes;");
						System.out.println("\n2 - Adultos;");
						System.out.println("\n3 - Castrados;");
						System.out.print("\nDigite o número da opção desejada: ");
						opcao = sc.nextInt();
						switch (opcao) {
						case 1:

							System.out.println("MARCAS DE RAÇÃO PARA GATOS FILHOTES ARMAZENADAS");
							System.out.println("\nMarca					Quantidade");
							System.out.println("\nWhiskas					  " + whiskasF + " kg");
							System.out.println("\nFriskies				  " + friskiesF + " kg");
							System.out.print("\nPremier					  " + premierF + " kg\n");
							continua = continuaOuNao();
							break;
						case 2:

							System.out.println("MARCAS DE RAÇÃO PARA GATOS ADULTOS ARMAZENADAS");
							System.out.println("\nMarca					Quantidade");
							System.out.println("\nWhiskas					  " + whiskasA + " kg");
							System.out.println("\nFriskies				  " + friskiesA + " kg");
							System.out.println("\nPremier					  " + premierA + " kg\n");

							continua = continuaOuNao();

							break;
						case 3:

							System.out.println("MARCAS DE RAÇÃO PARA GATOS CASTRADOS ARMAZENADAS");
							System.out.println("\nMarca					Quantidade");
							System.out.println("\nWhiskas                          " + whiskasC + " kg");
							System.out.println("\nFriskies                         " + friskiesC + " kg");
							System.out.println("\nPremier					    " + premierC + " kg\n");
							continua = continuaOuNao();
							break;
							
						default:

							System.out.println("Opção inválida. Digite um número de 1 a 3.");
							continua = true;
						}
						break;

					case 2:

						System.out.println("MARCAS DE RAÇÃO DE CÃES POR PORTE DO ANIMAL");
						System.out.println("\n1 - Pequeno Porte;");
						System.out.println("\n2 - Médio Porte;");
						System.out.println("\n3 - Grande Porte;");
						System.out.print("\nDigite o número da opção desejada: ");
						int caesPorte = sc.nextInt();

						switch (caesPorte) {
						case 1:

							System.out.println("MARCAS DE RAÇÃO PARA CÃES DE PEQUENO PORTE ARMAZENADAS");
							System.out.println("\nMarca					Quantidade");
							System.out.println("\nDeli Dog				       " + deli_dogP + " kg");
							System.out.println("\nRoyal Canin				  " + royal_caninP + " kg");
							System.out.println("\nBiriba					  " + biribaP + " kg\n");
							continua = continuaOuNao();

							break;

						case 2:

							System.out.println("MARCAS DE RAÇÃO PARA CÃES DE MÉDIO PORTE ARMAZENADAS");
							System.out.println("\nMarca					Quantidade");
							System.out.println("\nDeli Dog				       " + deli_dogM + " kg");
							System.out.println("\nRoyal Canin				  " + royal_caninM + " kg");
							System.out.println("\nBiriba					  " + biribaM + " kg\n");
							continua = continuaOuNao();
							break;

						case 3:

							System.out.println("MARCAS DE RAÇÃO PARA CÃES DE GRANDE PORTE ARMAZENADAS");
							System.out.println("\nMarca					Quantidade");
							System.out.println("\nDeli Dog				       " + deli_dogG + " kg");
							System.out.println("\nRoyal Canin				  " + royal_caninG + " kg");
							System.out.println("\nBiriba					  " + biribaG + " kg\n");
							continua = continuaOuNao();
							break;

						
						default:

							System.out.println("Opção inválida. Digite um número de 1 a 3.");
							break;
						}
						break;

					default:

						System.out.println("Opção Inválida. Digite 1 ou 2.");
						continua = true;
						break;
					}
					break;

				case 3:
					System.out.println("QUANTIDADE DE ALIMENTOS POR PORTE DO ANIMAL");
					System.out.println("\n1 - Cães;");
					System.out.println("\n2 - Gatos;");
					System.out.print("\nDigite o número da opção desejada: ");
					int alimentosCaesOuGatos = sc.nextInt();

					switch (alimentosCaesOuGatos) {
					case 1:

						System.out.println("QUANTIDADE DE RAÇÃO PARA CÃES POR PORTE");
						System.out.println("\nPequeno Porte: " + (deli_dogP + royal_caninP + biribaP) + " kg");
						System.out.println("\nMédio Porte: " + (deli_dogM + royal_caninM + biribaM) + " kg");
						System.out.println("\nGrande Porte: " + (deli_dogG + royal_caninG + biribaG) + " kg\n");
						continua = continuaOuNao();
						break;

					case 2:

						System.out.println("QUANTIDADE DE RAÇÃO PARA GATOS POR PORTE");
						System.out.println("\nFilhotes: " + (whiskasF + friskiesF + premierF) + " kg");
						System.out.println("\nAdultos: " + (whiskasA + friskiesA + premierA) + " kg");
						System.out.println("\nCastrados: " + (whiskasC + friskiesC + premierC) + " kg\n");
						continua = continuaOuNao();
						break;

					default:

						System.out.println("Opção inválida. Digite 1 ou 2.");
						continua = true;
						break;
					}
					break;
				case 4:
					System.out.println("MEDICAMENTOS PARA CÃES");
					System.out.println("Nome                   Qt. Caixas");
					System.out.println("Rimadyl                   " + rimadyl);
					System.out.println("Cerenia                   " + cerenia);
					System.out.println("Apoquel                   " + apoquel);
					continua = continuaOuNao();
					break;

				case 5:
					System.out.println("MEDICAMENTOS PARA GATOS");
					System.out.println("Nome                    Qt. Caixas");
					System.out.println("Metacam                     " + metacam);
					System.out.println("Felimazole                  " + felimazole);
					System.out.println("Profender                   " + profender);
					continua = continuaOuNao();
					break;


				default:
					System.out.println("Opção inválida. Digite um número de 1 a 3.");
					continua = true;

					break;
				}
				break;

			case 3:
				System.out.println("\nRETIRADA DE ESTOQUES");
				System.out.println("\n1 - Retirada de ração para cães;");
				System.out.println("\n2 - Retirada de ração para gatos;");
				System.out.println("\n3 - Retirada de medicamentos para cães;");
				System.out.println("\n4 - Retirada de medicamentos para gatos;");
				System.out.print("Digite o número da opção desejada: ");
				int opcaoRetEstoques = sc.nextInt();

				switch (opcaoRetEstoques) {
				case 1:
					System.out.println("\nRETIRADA DE RAÇÃO PARA CÃES");
					System.out.println("\n1 - Deli Dog Pequeno Porte;");
					System.out.println("\n2 - Deli Dog Médio Porte;");
					System.out.println("\n3 - Deli Dog Grande Porte;");
					System.out.println("\n4 - Royal Canin Pequeno Porte;");
					System.out.println("\n5 - Royal Canin Médio Porte;");
					System.out.println("\n6 - Royal Canin Grande Porte;");
					System.out.println("\n7 - Biriba Pequeno Porte;");
					System.out.println("\n8 - Biriba Médio Porte;");
					System.out.println("\n9 - Biriba Grande Porte;");
					System.out.print("Digite o número da opção desejada: ");
					opcao = sc.nextInt();
					switch (opcao) {
					case 1:
						System.out.println("DELI DOG PEQUENO PORTE");
						System.out.print("Insira a quantidade(kg) de ração que deseja retirar: ");
						peso = sc.nextDouble();
						if (peso <= deli_dogP) {
							deli_dogP -= peso;
							System.out.println(peso + "kg de ração retirados com sucesso.");
							continua = continuaOuNao();
						} else {
							System.out.println(
									"Estoques insuficientes. Digite uma quantidade menor que " + deli_dogP + "kg.");

						}
						break;

					case 2:
						System.out.println("DELI DOG MÉDIO PORTE");
						System.out.print("Insira a quantidade(kg) de ração que deseja retirar: ");
						peso = sc.nextDouble();
						if (peso <= deli_dogM) {
							deli_dogM -= peso;
							System.out.println(peso + "kg de ração retirados com sucesso.");
							continua = continuaOuNao();
						} else {
							System.out.println(
									"Estoques insuficientes. Digite uma quantidade menor que " + deli_dogM + "kg.");

						}
						break;

					case 3:
						System.out.println("DELI DOG GRANDE PORTE");
						System.out.print("Insira a quantidade(kg) de ração que deseja retirar: ");
						peso = sc.nextDouble();
						if (peso <= deli_dogG) {
							deli_dogG -= peso;
							System.out.println(peso + "kg de ração retirados com sucesso.");
							continua = continuaOuNao();
						} else {
							System.out.println(
									"Estoques insuficientes. Digite uma quantidade menor que " + deli_dogG + "kg.");

						}
						break;

					case 4:
						System.out.println("ROYAL CANIN PEQUENO PORTE");
						System.out.print("Insira a quantidade(kg) de ração que deseja retirar: ");
						peso = sc.nextDouble();
						if (peso <= royal_caninP) {
							royal_caninP -= peso;
							System.out.println(peso + "kg de ração retirados com sucesso.");
							continua = continuaOuNao();
						} else {
							System.out.println(
									"Estoques insuficientes. Digite uma quantidade menor que " + royal_caninP + "kg.");

						}
						break;

					case 5:
						System.out.println("ROYAL CANIN MÉDIO PORTE");
						System.out.print("Insira a quantidade(kg) de ração que deseja retirar: ");
						peso = sc.nextDouble();
						if (peso <= royal_caninM) {
							royal_caninM -= peso;
							System.out.println(peso + "kg de ração retirados com sucesso.");
							continua = continuaOuNao();
						} else {
							System.out.println(
									"Estoques insuficientes. Digite uma quantidade menor que " + royal_caninM + "kg.");

						}
						break;

					case 6:
						System.out.println("ROYAL CANIN GRANDE PORTE");
						System.out.print("Insira a quantidade(kg) de ração que deseja retirar: ");
						peso = sc.nextDouble();
						if (peso <= royal_caninG) {
							royal_caninP -= peso;
							System.out.println(peso + "kg de ração retirados com sucesso.");
							continua = continuaOuNao();
						} else {
							System.out.println(
									"Estoques insuficientes. Digite uma quantidade menor que " + royal_caninG + "kg.");

						}
						break;

					case 7:
						System.out.println("BIRIBA PEQUENO PORTE");
						System.out.print("Insira a quantidade(kg) de ração que deseja retirar: ");
						peso = sc.nextDouble();
						if (peso <= biribaP) {
							biribaP -= peso;
							System.out.println(peso + "kg de ração retirados com sucesso.");
							continua = continuaOuNao();
						} else {
							System.out.println(
									"Estoques insuficientes. Digite uma quantidade menor que " + biribaP + "kg.");

						}
						break;

					case 8:
						System.out.println("BIRIBA MÉDIO PORTE");
						System.out.print("Insira a quantidade(kg) de ração que deseja retirar: ");
						peso = sc.nextDouble();
						if (peso <= biribaM) {
							biribaM -= peso;
							System.out.println(peso + "kg de ração retirados com sucesso.");
							continua = continuaOuNao();
						} else {
							System.out.println(
									"Estoques insuficientes. Digite uma quantidade menor que " + biribaM + "kg.");

						}
						break;

					case 9:
						System.out.println("BIRIBA GRANDE PORTE");
						System.out.print("Insira a quantidade(kg) de ração que deseja retirar: ");
						peso = sc.nextDouble();
						if (peso <= biribaG) {
							biribaG -= peso;
							System.out.println(peso + "kg de ração retirados com sucesso.");
							continua = continuaOuNao();
						} else {
							System.out.println(
									"Estoques insuficientes. Digite uma quantidade menor que " + biribaG + "kg.");

						}
						break;
					default:
						System.out.println("Opção inválida. Digite um número de 1 a 9.");
						continua = true;

					}
					break;

				case 2:
					System.out.println("RETIRADA DE RAÇÃO PARA GATOS");
					System.out.println("\n1 - Whiskas Filhotes");
					System.out.println("\n2 - Whiskas Adultos;");
					System.out.println("\n3 - Whiskas Castrados;");
					System.out.println("\n4 - Friskies Filhotes;");
					System.out.println("\n5 - Friskies Adultos;");
					System.out.println("\n6 - Friskies Castrados;");
					System.out.println("\n7 - Premier Filhotes;");
					System.out.println("\n8 - Premier Adultos;");
					System.out.println("\n9 - Premier Castrados;");

					break;

				case 3:
					System.out.println("\nMEDICAMENTOS PARA CÃES");
					System.out.println("\n1 - Rimadyl;");
					System.out.println("\n2 - Cerenia;");
					System.out.println("\n3 - Apoquel;");
					System.out.print("Digite o número da opção de desejada: ");
					opcao = sc.nextInt();
					
					switch (opcao) {
					case 1:
						System.out.println("RIMADYL");
						System.out.print("Insira a quantidade de caixas que deseja retirar: ");
						quantidade = sc.nextInt();
						if (quantidade <= rimadyl) {
							rimadyl -= quantidade;
							System.out.println(quantidade + " caixas de rimadyl retiradas com sucesso.");
							continua = continuaOuNao();
						} else {
							System.out.println("Estoques insuficientes. Você pode retirar, no máximo " + rimadyl + " caixas.");
							continua = true;

						}
						break;
					case 2:
						System.out.println("CERENIA");
						System.out.print("Insira a quantidade de caixas que deseja retirar: ");
						quantidade = sc.nextInt();
						if (quantidade <= cerenia) {
							cerenia -= quantidade;
							System.out.println(quantidade + " caixas de Cerenia retiradas com sucesso.");
							continua = continuaOuNao();
						} else {
							System.out.println("Estoques insuficientes. Você pode retirar, no máximo " + cerenia + " caixas.");
							continua = true;

						}
						break;
					case 3:
						System.out.println("APOQUEL");
						System.out.print("Insira a quantidade de caixas que deseja retirar: ");
						quantidade = sc.nextInt();
						if (quantidade <= apoquel) {
							apoquel -= quantidade;
							System.out.println(quantidade + " caixas de Apoquel retiradas com sucesso.");
							continua = continuaOuNao();
						} else {
							System.out.println(
									"Estoques insuficientes. Você pode retirar, no máximo, " + apoquel + " caixas.");
							continua = true;

						}
						break;
					default:
						System.out.println("Opção inválida. Digite 1,2 ou 3.");
						continua = true;
					}
					break;

				case 4:
					System.out.println("\nMEDICAMENTOS PARA GATOS");
					System.out.println("\n1 - Metacam;");
					System.out.println("\n2 - Felimazole;");
					System.out.println("\n3 - Profender;");
					System.out.print("Digite o número da opção desejada: ");
					opcao = sc.nextInt();

					switch (opcao) {
					case 1:
						System.out.println("METACAM");
						System.out.print("Insira a quantidade de caixas que deseja retirar: ");
						quantidade = sc.nextInt();
						if (quantidade <= metacam) {
							metacam -= quantidade;
							System.out.println(quantidade + " caixas de Metacam retiradas com sucesso.");
							continua = continuaOuNao();
						} else {
							System.out.println(
									"Estoques insuficientes. Você pode retirar, no máximo " + metacam + " caixas.");
							continua = true;

						}
						break;
					case 2:
						System.out.println("FELIMAZOLE");
						System.out.print("Insira a quantidade de caixas que deseja retirar: ");
						quantidade = sc.nextInt();
						if (quantidade <= felimazole) {
							felimazole -= quantidade;
							System.out.println(quantidade + " caixas de Felimazole retiradas com sucesso.");
							continua = continuaOuNao();
						} else {
							System.out.println(
									"Estoques insuficientes. Você pode retirar, no máximo " + felimazole + " caixas.");
							continua = true;

						}
						break;

					case 3:
						System.out.println("PROFENDER");
						System.out.print("Insira a quantidade de caixas que deseja retirar: ");
						quantidade = sc.nextInt();
						if (quantidade <= profender) {
							profender -= quantidade;
							System.out.println(quantidade + " caixas de Profender retiradas com sucesso.");
							continua = continuaOuNao();
						} else {
							System.out.println(
									"Estoques insuficientes. Você pode retirar, no máximo " + profender + " caixas.");
							continua = true;

						}
						break;

					default:
						System.out.println("Opção inválida. Digite 1,2 ou 3.");
						continua = true;
						break;
					}

					break;

				default:
					System.out.println("Opção inválida. Escolha 1,2,3 ou 4.");
					continua = true;
					break;
				}

				break;

			default:
				System.out.println("Escolha uma opção válida.");
				continua = true;
				break;
			}
		} while (continua == true);

	}

	public static boolean continuaOuNao() {
		String perguntaContinuar = "";
		boolean continuarSimOuNao = false;

		System.out.println("Continuar no programa? (S/N): ");
		perguntaContinuar = sc.next().toUpperCase();
		char resp = perguntaContinuar.charAt(0);
		if (resp == 'S') {
			continuarSimOuNao = true;
		} else if (resp == 'N') {
			System.out.println("Programa encerrado.");
			continuarSimOuNao = false;
		} else {
			System.out.println("Opção Inválida. Digite S ou N.");
			continuarSimOuNao = false;
		}

		return continuarSimOuNao;

	}

}
