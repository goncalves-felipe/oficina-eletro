package oficina.eletro.model;

import java.util.ArrayList;
import java.util.List;

public class Fornecedor extends Pessoa {
	private String cnpj;
	private List<Peca> pedidos;
	
	public Fornecedor() {
		super();
		this.cnpj = "";
		this.pedidos = new ArrayList<>();
	}

	public Fornecedor(int id, String nome, String email, String nroTelefone, String cnpj) {
		super(id, nome, email, nroTelefone);
		this.cnpj = cnpj;
		this.pedidos = new ArrayList<>();
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Peca> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Peca> pedidos) {
		this.pedidos = pedidos;
	}
	
	public void fazerPedido(Peca pedido) {
		pedidos.add(pedido);
	}
}
