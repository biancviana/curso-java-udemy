package atividades_seção09;

import java.util.Locale;
import java.util.Scanner;


public class ProdutoMain {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do produto: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		
		//System.out.print("Quantidade em estoque: ");
		//int quantidade = sc.nextInt();
		
		//obrigando o programador a informar os dados do produto no momento da instanciação dele.
		//assim, o construtor protege que o programador faça besteira, criando um produto sem preço, nome, quantidade, deixando ele num estado inconsistente.
		Produto product = new Produto(nome, preco);
		
		System.out.println();		
		System.out.println("Dados do produto: " + product);
		
		System.out.println();		
		System.out.print("Entre com o número de produtos para serem adicionados do estoque: ");
		int quantidade = sc.nextInt();
		product.adicionarProdutos(quantidade);
		
		System.out.println();
		System.out.println("Produtos atualizados: " + product);
		
		System.out.println();
		System.out.print("Entre com o número de produtos para serem removidos do estoque: ");
		quantidade = sc.nextInt();
		product.removerProdutos(quantidade);
		System.out.println();
		System.out.println("Produtos atualizados: " + product);
		
		sc.close();

	}


	}
