package atividades_seção09;

public class Produto {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	/* PONTOS SOBRE CONSTRUTOR:
	 * 
	 * - Entendo que o construtor refira-se algo que 'não faz sentido o objeto viver sem'.
	 * por exemplo um aluno precisa ter um nome ou um cpf sempre, por que esses são atributos que o identifica, 
	 * já que sempre temos que informar isso, é melhor ter um construtor que obrigue que estas informações sejam informadas.
	 * 
	 * - Importante pois além de iniciar valores dos atributos, permite ou obriga que o objeto instanciado 
	 * recebe dados/dependências no momento de sua instanciação.
	 * 
	 */	
	
	//Construtor 1 
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	//Construtor 2
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	//Getter
	public String getName() {
		return nome;
	}
	
	//Setter
	public void setName(String nome) {
		this.nome = nome;
	}	
	
	//Getter
	public double getPreco() {
		return preco;
	}

	//Setter
	public void setPreco(double preco) {
		this.preco = preco;
	}

	//Getter
	public int getQuantidade() {
		return quantidade;
	}	
	
	//Métodos
	public double valorTotalEmEstoque() {
		return preco * quantidade;
	}
	public void adicionarProdutos(int quantidade) {
		this.quantidade += quantidade;
	}
	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}
	public String toString() {
		return nome
				+ ", $ "
				+ String.format("%.2f", preco)
				+ ", "
				+ quantidade
				+ " unidades, Total: $ "
				+ String.format("%.2f", valorTotalEmEstoque());
	}
}
