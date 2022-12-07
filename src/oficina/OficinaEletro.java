package oficina;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import oficina.eletro.model.Cliente;
import oficina.eletro.model.Fornecedor;
import oficina.eletro.model.Funcionario;
import oficina.eletro.model.Peca;

public class OficinaEletro {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		Fornecedor[] fornecedores = {
			new Fornecedor(1, "João da Silva", "joaodasilva@email.teste", "+99(99)99999-9999", "11.111.111/0001-11"),
			new Fornecedor(2, "José Carlos", "josecalors@email.teste", "+99(99)99999-9999", "11.111.111/0001-11")
		};
		
		Peca[] pecas = {
			new Peca(1, "Motor de geladeira", 100, 20, 20, 20, 3, fornecedores[1], 0),
			new Peca(2, "Tira de vedação", 10, 100, 4, 1, 20, fornecedores[0], 0),
			new Peca(3, "Fio de cobre", 5, 1000, (float)0.1, (float)0.1, 50, fornecedores[0], 0),
			new Peca(4, "Cano de cobre", 8, 100, 2, 2, 30, fornecedores[1], 0)
		};

		Funcionario[] funcionarios = {
			new Funcionario(1, "Pedro Silva", "pedrosilva@email.teste", "+99(99)99999-9999", 10, new Date()),
			new Funcionario(1, "Lucas Henrique", "lucashenrique@email.teste", "+99(99)99999-9999", 11, new Date()),
		};

		Cliente[] clientes = {
			new Cliente(1, "Lucas Henrique", "lucashenrique@email.teste", "+99(99)99999-9999", "Rua 1 nro 2, bairro 3, cidade 4"),
			new Cliente(2, "Antônio", "antonio@email.teste", "+99(99)99999-9999", "Rua 10 nro 20, bairro 30, cidade 40")
		};
		
		System.out.println("Bem-vindo(a) ao sistema da Oficina Eletro!");
		System.out.println("Para continuar, selecione uma opção abaixo:");
		System.out.println("1: Para abrir uma nova ordem de serviço;\n2: Para acompanhar ordens de serviço existentes;\n3: Para fazer um pedido de novas peças;\n4: Para sair.");
		System.out.flush();
		
		try {
			int acao = Integer.parseInt(reader.readLine());
			
			switch(acao) {
				case 1:
					break;
					
				case 2:
					break;
					
				case 3:
					break;
					
				default:
					break;
			}
		} catch (Exception e) {
			System.err.println("Formato inválido!");
		}
	}

}
