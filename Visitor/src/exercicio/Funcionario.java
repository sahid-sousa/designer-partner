package exercicio;

public abstract class Funcionario  implements Atualizavel {
	private String nome;
	private Double salario;

	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return this.nome;
	}

	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

}
