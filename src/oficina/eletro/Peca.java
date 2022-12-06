package oficina.eletro;

public class Peca {
	private int id;
	private String nome;
	private float preco;
	private float altura;
	private float largura;
	private float comprimento;
	private int estoque;
	
	public Peca() {
		this.id = -1;
		this.nome = "";
		this.preco = 0;
		this.altura = 0;
		this.largura = 0;
		this.comprimento = 0;
		this.estoque = 0;
	}

	public Peca(int id, String nome, float preco, float altura, float largura, float comprimento, int estoque) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.altura = altura;
		this.largura = largura;
		this.comprimento = comprimento;
		this.estoque = estoque;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getLargura() {
		return largura;
	}

	public void setLargura(float largura) {
		this.largura = largura;
	}

	public float getComprimento() {
		return comprimento;
	}

	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	// TODO:
	public void fazerPedido(int quantidade) {
		
	}
}
