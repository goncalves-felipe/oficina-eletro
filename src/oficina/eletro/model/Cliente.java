package oficina.eletro.model;

public class Cliente extends Pessoa {
	private String endereco;
	
	public Cliente() {
		super();
		this.endereco = "";
	}

	public Cliente(int id, String nome, String email, String endereco, String nroTelefone) {
		super(id, nome, email, nroTelefone);
		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	// TODO:
	public void solicitarOrcamento() {
		
	}
}
