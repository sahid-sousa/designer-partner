package exercicio;

public class Telefonista extends Funcionario {
	private int ramal;

	public Telefonista(String nome, double salario, int ramal) {
		super(nome, salario);
		this.ramal = ramal;
	}

	public int getRamal() {
		return this.ramal;
	}

	public void aceita(AtualizadorDeFuncionario atualizador) {
		atualizador.atualiza(this);
	}

}
