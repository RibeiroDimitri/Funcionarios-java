package entidades;

public class Gerente extends Funcionario {

	private int senha;
	private int numeroDeFuncionariosGerenciados;

	public Gerente() {
	}

	public Gerente(String nome, String cpf, double salario, int senha, int numeroDeFuncionariosGerenciados) {
		super(nome, cpf, salario);
		this.senha = senha;
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getNumeroDeFuncionariosGerenciados() {
		return numeroDeFuncionariosGerenciados;
	}

	public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
		this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}
	@Override
	public double getBonificacaoMensal() {
		return salario * 0.15;
	}
	@Override
	public double getBonificacaoAnual() {
		return super.getBonificacaoAnual() + 1000;
	}
}
