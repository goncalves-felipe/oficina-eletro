package oficina.eletro.model;

import java.util.Date;

public class Funcionario extends Pessoa {
	private float custoHora;
	private Date dataContratacao;
	
	public Funcionario() {
		super();
		this.custoHora = 0;
		this.dataContratacao = null;
	}

	public Funcionario(int id, String nome, String email, String nroTelefone, float custoHora, Date dataContratacao) {
		super(id, nome, email, nroTelefone);
		this.custoHora = custoHora;
		this.dataContratacao = dataContratacao;
	}

	public float getCustoHora() {
		return custoHora;
	}

	public void setCustoHora(float custoHora) {
		this.custoHora = custoHora;
	}

	public Date getDataContratacao() {
		return dataContratacao;
	}

	public void setDataContratacao(Date dataContratacao) {
		this.dataContratacao = dataContratacao;
	}
}
