package oficina.eletro.model;

import java.util.ArrayList;
import java.util.List;

import oficina.eletro.constantes.StatusOrdemServico;

public class OrdemServico {
	private int id;
	private String produto;
	private String descricao;
	private List<ServicoFuncionario> funcionariosAlocados;
	private Cliente cliente;
	private float horasPrevistas;
	private List<Peca> pecasPrevistas;
	private List<Peca> pecasUtilizadas;
	private float valorOrcamento;
	private float valorFinal;
	private float valorPago;
	private StatusOrdemServico status;
	private boolean entregue;
	
	public OrdemServico() {
		this.id = -1;
		this.produto = "";
		this.descricao = "";
		this.funcionariosAlocados = new ArrayList<>();
		this.cliente = null;
		this.horasPrevistas = 0;
		this.pecasPrevistas = new ArrayList<>();
		this.pecasUtilizadas = new ArrayList<>();
		this.valorOrcamento = 0;
		this.valorFinal = 0;
		this.valorPago = 0;
		this.status = StatusOrdemServico.CRIADO;
		this.entregue = false;
	}
	
	public OrdemServico(int id, String produto, String descricao, List<ServicoFuncionario> funcionariosAlocados,
			Cliente cliente, float horasPrevistas, List<Peca> pecasPrevistas, List<Peca> pecasUtilizadas,
			float valorOrcamento, StatusOrdemServico status, boolean entregue, float valorFinal, float valorPago) {
		this.id = id;
		this.produto = produto;
		this.descricao = descricao;
		this.funcionariosAlocados = funcionariosAlocados;
		this.cliente = cliente;
		this.horasPrevistas = horasPrevistas;
		this.pecasPrevistas = pecasPrevistas;
		this.pecasUtilizadas = pecasUtilizadas;
		this.valorOrcamento = valorOrcamento;
		this.status = status;
		this.entregue = entregue;
		this.valorFinal = valorFinal;
		this.valorPago = valorPago;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<ServicoFuncionario> getFuncionariosAlocados() {
		return funcionariosAlocados;
	}

	public void setFuncionariosAlocados(List<ServicoFuncionario> funcionariosAlocados) {
		this.funcionariosAlocados = funcionariosAlocados;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public float getHorasPrevistas() {
		return horasPrevistas;
	}

	public void setHorasPrevistas(float horasPrevistas) {
		this.horasPrevistas = horasPrevistas;
	}

	public List<Peca> getPecasPrevistas() {
		return pecasPrevistas;
	}

	public void setPecasPrevistas(List<Peca> pecasPrevistas) {
		this.pecasPrevistas = pecasPrevistas;
	}

	public List<Peca> getPecasUtilizadas() {
		return pecasUtilizadas;
	}

	public void setPecasUtilizadas(List<Peca> pecasUtilizadas) {
		this.pecasUtilizadas = pecasUtilizadas;
	}

	public float getValorOrcamento() {
		return valorOrcamento;
	}

	public void setValorOrcamento(float valorOrcamento) {
		this.valorOrcamento = valorOrcamento;
	}

	public StatusOrdemServico getStatus() {
		return status;
	}

	public void setStatus(StatusOrdemServico status) {
		this.status = status;
	}

	public boolean isEntregue() {
		return entregue;
	}

	public void setEntregue(boolean entregue) {
		this.entregue = entregue;
	}
	
	public float getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(float valorFinal) {
		this.valorFinal = valorFinal;
	}

	public float getValorPago() {
		return valorPago;
	}

	public void setValorPago(float valorPago) {
		this.valorPago = valorPago;
	}

	public void criarOrdemServico(String produto, String descricao, Cliente cliente) {
		this.produto = produto;
		this.descricao = descricao;
		this.cliente = cliente;
		this.status = StatusOrdemServico.EM_ANALISE;
	}
	
	public void rejeitarOrdemServico() {
		this.status = StatusOrdemServico.RECUSADO;
	}
	
	public void aprovarOrdemServico() {
		this.status = StatusOrdemServico.APROVADO;
	}
	
	public void criarOrcamento(float horasPrevistas, List<Peca> pecasPrevistas, float valorOrcamento) {
		this.pecasPrevistas = pecasPrevistas;
		this.horasPrevistas = horasPrevistas;
		this.status = StatusOrdemServico.EM_ANDAMENTO;
		this.valorOrcamento = valorOrcamento;
	}
	
	public void usarPeca(Peca peca) {
		int index = this.pecasUtilizadas.indexOf(peca);
		
		if (index == -1) {
			peca.setQuantidade(1);
			this.pecasUtilizadas.add(peca);
		} else {
			Peca pecaEncontrada = this.pecasUtilizadas.get(index);
			pecaEncontrada.usarPeca();
			this.pecasPrevistas.set(index, pecaEncontrada);
		}
	}
	
	public void alocarFuncionario(ServicoFuncionario funcionario, int horas) {
		int index = this.funcionariosAlocados.indexOf(funcionario);
		
		if (index == -1) {
			funcionario.alocarHoras(horas);
			this.funcionariosAlocados.add(funcionario);
		} else {
			ServicoFuncionario funcionarioAlocado = this.funcionariosAlocados.get(index);
			funcionarioAlocado.alocarHoras(horas);
			this.funcionariosAlocados.set(index, funcionarioAlocado);
		}
	}
	
	public float calcularValorGasto() {
		float valorPecas = 0;
		float valorMaoDeObra = 0;
		
		for (Peca peca : this.pecasUtilizadas) {
			valorPecas += peca.getPreco() * peca.getQuantidade();
		}
		
		for (ServicoFuncionario funcionario : this.funcionariosAlocados) {
			valorMaoDeObra += funcionario.getHorasAlocadas() * funcionario.getFuncionario().getCustoHora();
		}
		
		return valorPecas + valorMaoDeObra;
	}
	
	public void finalizarComSucesso() {
		this.status = StatusOrdemServico.FINALIZADO_SUCESSO;
	}
	
	public void finalizarComFalha() {
		this.status = StatusOrdemServico.FINALIZADO_FALHA;
	}
	
	public void entregarProduto() {
		this.entregue = true;
	}
}
