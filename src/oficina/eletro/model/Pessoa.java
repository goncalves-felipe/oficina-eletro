package oficina.eletro.model;

public class Pessoa {
	private int id;
	private String nome;
	private String email;
	private String nroTelefone;
	
	public Pessoa() {
		this.id = -1;
		this.nome = "";
		this.email = "";
		this.nroTelefone = "";
	}
	
	public Pessoa(int id, String nome, String email, String nroTelefone) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.nroTelefone = nroTelefone;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNroTelefone() {
		return nroTelefone;
	}

	public void setNroTelefone(String nroTelefone) {
		this.nroTelefone = nroTelefone;
	}
}
