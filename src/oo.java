import java.util.Scanner;

public class oo{

	public static void main(String[] args) {

		int qtd_clientes_cadastrados = 10;
		int qtd_produtos_cadastrados = 10;
		int opcao;
		String info_produtos[][] = new String [50][5];
		info_produtos[0][0] = "Batata"; info_produtos[0][1] = "Tuberculo"; info_produtos[0][2] = "5/kg"; info_produtos[0][3] = "5%"; info_produtos[0][4] = "50";
		info_produtos[1][0] = "Banana"; info_produtos[1][1] = "Fruta"; info_produtos[1][2] = "5/kg"; info_produtos[1][3] = "5%"; info_produtos[1][4] = "50";
		info_produtos[2][0] = "Tomate"; info_produtos[2][1] = "Fruta"; info_produtos[2][2] = "5/kg"; info_produtos[2][3] = "5%"; info_produtos[2][4] = "50";
		info_produtos[3][0] = "Alface"; info_produtos[3][1] = "Hortaliça"; info_produtos[3][2] = "4/ramo"; info_produtos[3][3] = "5%"; info_produtos[3][4] = "50";
		info_produtos[4][0] = "Picanha"; info_produtos[4][1] = "Carne Bovina"; info_produtos[4][2] = "50/kg"; info_produtos[4][3] = "5%"; info_produtos[4][4] = "50";
		info_produtos[5][0] = "Farinha"; info_produtos[5][1] = "Fecula de Mandioca"; info_produtos[5][2] = "20/kg"; info_produtos[5][3] = "5%"; info_produtos[5][4] = "50";
		info_produtos[6][0] = "Oleo"; info_produtos[6][1] = "Acido Graxo Insaturado"; info_produtos[6][2] = "12/L"; info_produtos[6][3] = "5%"; info_produtos[6][4] = "50";
		info_produtos[7][0] = "Manteiga"; info_produtos[7][1] = "Acido Graxo Saturado"; info_produtos[7][2] = "25/pote"; info_produtos[7][3] = "5%"; info_produtos[7][4] = "50";
		info_produtos[8][0] = "Oregano"; info_produtos[8][1] = "Tempero"; info_produtos[8][2] = "6/saco"; info_produtos[8][3] = "5%"; info_produtos[8][4] = "50";
		info_produtos[9][0] = "Chocolate"; info_produtos[9][1] = "Cacau em Barra"; info_produtos[9][2] = "8/barra"; info_produtos[9][3] = "5%"; info_produtos[9][4] = "50";
		
		
		
		String info_clientes[][] = new String [50][3];
		info_clientes[0][0] = "Leticia"; info_clientes[0][1] = "Lago Norte"; info_clientes[0][2] = "982395678";
		info_clientes[1][0] = "Joao"; info_clientes[1][1] = "Paranoa"; info_clientes[1][2] = "999273981";
		info_clientes[2][0] = "Vitor"; info_clientes[2][1] = "Asa Norte"; info_clientes[2][2] = "992948194";
		info_clientes[3][0] = "Arivaldo"; info_clientes[3][1] = "Asa Sul"; info_clientes[3][2] = "981418855";
		info_clientes[4][0] = "Maria"; info_clientes[4][1] = "Lago Norte"; info_clientes[4][2] = "981562026";
		info_clientes[5][0] = "Jacyra"; info_clientes[5][1] = "Lago Sul"; info_clientes[5][2] = "34681437";
		info_clientes[6][0] = "Sandra"; info_clientes[6][1] = "Itapoa"; info_clientes[6][2] = "993768910";
		info_clientes[7][0] = "Mateus"; info_clientes[7][1] = "Gama"; info_clientes[7][2] = "985587888";
		info_clientes[8][0] = "Laura"; info_clientes[8][1] = "Sobradinho"; info_clientes[8][2] = "998838300";
		info_clientes[9][0] = "Rafael"; info_clientes[9][1] = "Aguas Claras"; info_clientes[9][2] = "985595215";
		Scanner ler = new Scanner(System.in);
		
		
		do{
			menu(); 
			System.out.print("\nInsira a opção desejada:\n");
			 opcao = ler.nextInt();

			 if (opcao == 7) {
				 System.out.print("\nVolte sempre!\n");
				 System.exit(0);;
				 
			 }else{
				 switch(opcao){
		            case 1:
		            	qtd_clientes_cadastrados = cadastro_cliente(info_clientes, qtd_clientes_cadastrados);
		                break;
		            case 2:
		            	busca_cliente(info_clientes, qtd_clientes_cadastrados);
		                break;
		            case 3:
		            	qtd_produtos_cadastrados = cadastro_produto(info_produtos, qtd_produtos_cadastrados);
		                break;
		            case 4:
		            	busca_produto(info_produtos, qtd_produtos_cadastrados);
		                break;
		            case 5:
		            	cadastro_venda(info_clientes, qtd_clientes_cadastrados, info_produtos, qtd_produtos_cadastrados);
		                break;
		            case 6:
		            	estoque_disponivel(info_produtos, qtd_produtos_cadastrados);
		                break;
		            default:
		            	System.out.print("\nEntrada invalida. Tente novamente.\n");
				 }
			 } 
		}while(opcao != 7);
		
	}
	
	
	public static void menu() {

		System.out.print("----------------MENU-----------------\n" +
					"(1) Cadastro de novo cliente\n" +
					"(2) Busca por cliente\n" +
					"(3) Cadastro de novo produto\n" +
					"(4) Busca por produto\n" +
					"(5) Cadastro de venda\n" +
					"(6) Mostrar produtos em estoque\n" +
					"(7) Sair\n"); 
		
	}
	
	
	public static int cadastro_cliente(String info_clientes[][], int qtd_clientes_cadastrados) {

		int qtd_clientes_cadastrar;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("------------Cadastro de Cliente------------\n\n" +
						"Quantos clientes serão cadastrados?\n");
		

		qtd_clientes_cadastrar = ler.nextInt();
		ler.nextLine();
		
		System.out.println("\nInsira os seguintes dados do cliente:\n" + "- NOME\n" + "- ENDEREÇO\n" + "- TELEFONE\n" );
		for (int i = qtd_clientes_cadastrados; i < qtd_clientes_cadastrar + qtd_clientes_cadastrados; i++) {
			for (int j = 0; j < 3; j++) {
				info_clientes[i][j] = ler.nextLine();
			}
		}
		
		return qtd_clientes_cadastrados + qtd_clientes_cadastrar;
	}
		
	
	public static void busca_cliente(String info_clientes[][], int qtd_clientes_cadastrados) { 

		
		int decide1;
		int decide2;
		boolean flag = false;
		String nome = new String();
		Scanner ler = new Scanner(System.in);
		
		System.out.print("------------Busca por Cliente------------\n\n" + "Insira o nome que deseja buscar:\n");
		nome = ler.next();
		
		for (int i = 0; i < qtd_clientes_cadastrados; i++) {
			for (int j = 0; j < 3; j++) {
				if (info_clientes[i][j].equals(nome)) {
					System.out.print("Cliente encontrado com sucesso!\n\n" + "Seguem os dados de " + nome + ":\n\n" + "Endereço: " + info_clientes[i][j+1] + "\n" + "Telefone: " + info_clientes[i][j+2] + "\n");
					flag = true;
				}
			}
		}
		
		if(flag == false){
			System.out.print("Cliente não encontrado!\n");
		}
		
		if(flag == true) {
			for (int i = 0; i < qtd_clientes_cadastrados; i++) {
				for (int j = 0; j < 3; j++) {
					if (info_clientes[i][j].equals(nome)) {
						System.out.print("\n\nDeseja alterar os dados de " + nome + "?\n" + "1- Sim\n2- Retornar ao menu\nOpção: ");
						decide1 = ler.nextInt();
						ler.nextLine();
						if(decide1 == 2) {
							break;
						}else if(decide1 == 1) {
							System.out.print("\nQual dado deseja alterar?\n1- Endereço\n2- Telefone\nOpção: ");
							decide2 = ler.nextInt();
							ler.nextLine();
						
							if(decide2 == 1) {
								System.out.print("\nInsira o endereço: ");
								info_clientes[i][j+1] = ler.next();
								break;
							}else if(decide2 == 2) {
								System.out.print("\nInsira o telefone: ");
								info_clientes[i][j+2] = ler.next();
								break;
							}else {
								System.out.print("\nOpção inválida.\n");
								break;
							}
						}else {
							System.out.print("Opção inválida\n");
							break;
						}
				
					}
			
				}
			}
		
		}
		
	}
	
	
	public static int cadastro_produto(String info_produtos[][], int qtd_produtos_cadastrados) {
		
		int qtd_produtos_cadastrar;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("------------Cadastro de Produto------------\n\n" +
						"Quantos produtos serão cadastrados?\n");
		

		qtd_produtos_cadastrar = ler.nextInt();
		ler.nextLine();
		
		System.out.println("\nInsira os seguintes dados do produto:\n" + "- NOME DO PRODUTO\n" + "- DESCRIÇÃO\n" + "- VALOR DA COMPRA\n" + "- PORCENTAGEM DE LUCRO\n" + "- QUANTIDADE EM ESTOQUE\n");
		for (int i = qtd_produtos_cadastrados; i < qtd_produtos_cadastrar + qtd_produtos_cadastrados; i++) {
			for (int j = 0; j < 5; j++) {
				info_produtos[i][j] = ler.nextLine();
			}
		}
		
		return qtd_produtos_cadastrados + qtd_produtos_cadastrar;

	}
	
	
	public static void busca_produto(String info_produtos[][], int qtd_produtos_cadastrados) {
		
		int decide1;
		int decide2;
		boolean flag = false;
		String produto = new String();
		Scanner ler = new Scanner(System.in);
		
		System.out.print("------------Busca por Produto------------\n\n" + "Insira o produto que deseja buscar:\n");
		produto = ler.next();
		
		for (int i = 0; i < qtd_produtos_cadastrados; i++) {
			
			for (int j = 0; j < 5; j++) {
				
				if (info_produtos[i][j].equals(produto)) {
					
					System.out.print("Produto encontrado com sucesso!\n\n" + "Seguem os dados de " + produto + ":\n\n" + "Descrição: " + info_produtos[i][j+1] + "\n" + "Valor de compra: " + info_produtos[i][j+2] + "\n" + "Porcentagem de lucro: " + info_produtos[i][j+3] + "\n" + "Quantidade em estoque: " + info_produtos[i][j+4]);
					flag = true;
					
				}
			}
		}
		
		if(flag == false){
			
			System.out.print("Produto não encontrado!\n");
		}
		
		if(flag == true) {
			
			for (int i = 0; i < qtd_produtos_cadastrados; i++) {
				
				for (int j = 0; j < 5; j++) {
					
					if (info_produtos[i][j].equals(produto)) {
						
						System.out.print("\n\nDeseja alterar os dados de " + produto + "?\n" + "1- Sim\n2- Retornar ao menu\nOpção: ");
						decide1 = ler.nextInt();
						ler.nextLine();
						if(decide1 == 2) {
							
							break;
							
						}else if(decide1 == 1) {
							
							System.out.print("\nQual dado deseja alterar?\n1- Descrição\n2- Valor de compra\n3- Porcentagem de lucro\n4- Quantidade em estoque\nOpção: ");
							decide2 = ler.nextInt();
							ler.nextLine();
						
							if(decide2 == 1) {
								
								System.out.print("\nInsira a descrição: ");
								info_produtos[i][j+1] = ler.next();
								break;
								
							}else if(decide2 == 2) {
								
								System.out.print("\nInsira o valor de compra: ");
								info_produtos[i][j+2] = ler.next();
								break;
								
							}else if(decide2 == 3) {
								
								System.out.print("\nPorcentagem de lucro: ");
								info_produtos[i][j+3] = ler.next();
								break;
								
							}else if(decide2 == 4) {
								
								System.out.print("\nQuantidade em estoque: ");
								info_produtos[i][j+4] = ler.next();
								break;
								
							}else {
								
								System.out.print("Opção inválida\n");
								break;
							}
						}else {
							
							System.out.print("Opção inválida\n");
							break;
						}
				
					}
			
				}
			}
		
		}
		
	}
		
	
	public static void cadastro_venda(String info_clientes[][], int qtd_clientes_cadastrados, String info_produtos[][], int qtd_produtos_cadastrados) {
		
		Scanner ler = new Scanner(System.in);
		boolean flag_cliente = false;
		boolean flag_produto = false;
		String nome_slct = new String();
		String produto_slct = new String();
		int qtd;
		int result;
		int decide;
		
		System.out.print("------------Cadastro de Venda------------\n\n");
		System.out.print("------------Lista de Clientes------------\n");
		
		
		for (int i = 0; i < qtd_clientes_cadastrados; i++) {
			
			System.out.print(info_clientes[i][0] + "\n");
		}
		
		System.out.print("\nSelecione um cliente:\n");
		nome_slct = ler.nextLine();
		
		for (int i = 0; i < qtd_clientes_cadastrados; i++) {
			for (int j = 0; j < 3; j++) {
				if (info_clientes[i][j].equals(nome_slct)) {
					flag_cliente = true;
				}
			}
		}
		
		if(flag_cliente == false) {
			System.out.print("Cliente não encontrado. Tente novamente\n");
			nome_slct = ler.nextLine();
		}
		
		
		do {
			System.out.print("\nDeseja cadastrar uma venda para " + nome_slct + "?\n" + "1- Sim\n2- Retornar ao menu\nOpção:");
			decide = ler.nextInt();
			ler.nextLine();
			if (decide != 1) {
				break;
			}
			System.out.print("------------Lista de Produtos------------\n");
		
		
			for (int i = 0; i < qtd_produtos_cadastrados; i++) {
			
				System.out.print(info_produtos[i][0] + "\n");
			}
	
			System.out.print("\nSelecione um produto:\n");
			produto_slct = ler.nextLine();
		
			for (int i = 0; i < qtd_produtos_cadastrados; i++) {
				for (int j = 0; j < 3; j++) {
					if (info_produtos[i][j].equals(produto_slct)) {
						flag_produto = true;
					}
				}
			}
		
			if(flag_produto == false) {
				System.out.print("\nProduto não encontrado. Tente novamente\n");
				produto_slct = ler.nextLine();
			}
		
			System.out.print("\nQuantas unidades de " + produto_slct + " foram vendidas para " + nome_slct + "?\n");
			qtd = ler.nextInt();
			ler.nextLine();
		
			for (int i = 0; i < qtd_produtos_cadastrados; i++) {
				if (info_produtos[i][0].equals(produto_slct)) {
				int aux = Integer.parseInt(info_produtos[i][4]);
					result = aux - qtd;
					info_produtos[i][4] = String.valueOf(result);
				}
			}
		}while(decide == 1);
	}

	
	public static void estoque_disponivel(String info_produtos[][], int qtd_produtos_cadastrados) {
		
		System.out.print("------------Produtos em Estoque------------\n\n");
		
		for (int i = 0; i < qtd_produtos_cadastrados; i++) {
			
			System.out.print(info_produtos[i][0] + " : " + info_produtos[i][4] + "\n");
		}
	}
	
}
