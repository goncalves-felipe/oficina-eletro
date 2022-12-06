package oficina.eletro;

public class Fornecedor extends Pessoa {
	private String cnpj;
	
	public Fornecedor() {
		super();
		this.cnpj = "";
	}

	public Fornecedor(int id, String nome, String email, String nroTelefone, String cnpj) {
		super(id, nome, email, nroTelefone);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
