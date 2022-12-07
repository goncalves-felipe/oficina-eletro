package oficina.eletro.model;

import oficina.eletro.constantes.StatusOrdemServico;

public class Cliente extends Pessoa {
	private String endereco;
	
	public Cliente() {
		super();
		this.endereco = "";
	}

	public Cliente(int id, String nome, String email, String nroTelefone, String endereco) {
		super(id, nome, email, nroTelefone);
		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	

	public OrdemServico solicitarOrcamento(String produto, String descricao) {
		OrdemServico ordemServico = new OrdemServico();
		ordemServico.setProduto(produto);
		ordemServico.setDescricao(descricao);
		ordemServico.setCliente(this);
		ordemServico.setStatus(StatusOrdemServico.CRIADO);
		
		return ordemServico;
	}
}
