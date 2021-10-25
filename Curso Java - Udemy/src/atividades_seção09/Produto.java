package atividades_se��o09;

public class Produto {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	/* PONTOS SOBRE CONSTRUTOR:
	 * 
	 * - Entendo que o construtor refira-se algo que 'n�o faz sentido o objeto viver sem'.
	 * por exemplo um aluno precisa ter um nome ou um cpf sempre, por que esses s�o atributos que o identifica, 
	 * j� que sempre temos que informar isso, � melhor ter um construtor que obrigue que estas informa��es sejam informadas.
	 * 
	 * - Importante pois al�m de iniciar valores dos atributos, permite ou obriga que o objeto instanciado 
	 * recebe dados/depend�ncias no momento de sua instancia��o.
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
	
	//M�todos
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
