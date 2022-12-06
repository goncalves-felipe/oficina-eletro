package oficina.eletro.model;

public class ServicoFuncionario {
	private Funcionario funcionario;
	private float horasAlocadas;
	
	public ServicoFuncionario() {
		this.funcionario = null;
		this.horasAlocadas = 0;
	}
	
	public ServicoFuncionario(Funcionario funcionario, float horasAlocadas) {
		this.funcionario = funcionario;
		this.horasAlocadas = horasAlocadas;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public float getHorasAlocadas() {
		return horasAlocadas;
	}

	public void setHorasAlocadas(float horasAlocadas) {
		this.horasAlocadas = horasAlocadas;
	}
	
	public void alocarHoras(float horas) {
		this.horasAlocadas += horas;
	}
}
