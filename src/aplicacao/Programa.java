package aplicacao;

import entidades.Funcionario;
import entidades.Gerente;

public class Programa {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		Gerente gerente = new Gerente();	
		funcionario.setNome("Pedro");
		funcionario.setCpf("18744402801");
		funcionario.setSalario(1200.0);
		
		System.out.println(funcionario.getBonificacaoMensal());
		System.out.println(funcionario.totalMensal());
		System.out.println(funcionario.getBonificacaoAnual());
		
		gerente.setNome("Douglas");
		gerente.setCpf("12245678912");
		gerente.setSalario(2500.0);
		gerente.setSenha(1523);
		gerente.setNumeroDeFuncionariosGerenciados(5);
		
		System.out.println(gerente.getBonificacaoMensal());
		System.out.println(gerente.totalMensal());
		System.out.println(gerente.getBonificacaoAnual());
		
		
		//USANDO CONCEITOS DE POLIMORFISMO
	}

}
