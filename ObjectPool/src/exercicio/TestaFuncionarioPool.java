package exercicio;

public class TestaFuncionarioPool {
	public static void main(String[] args) {
		
		/*
		 * Object Pool
		 * Objetivo: Possibilitar o reaproveitamento de objetos.
		 */
		
		Pool<Funcionario> funcionarioPool = new FuncionarioPool();
		Funcionario funcionario = funcionarioPool.acquire();
		while (funcionario != null) {
			System.out.println(funcionario.getNome());
			funcionario = funcionarioPool.acquire();
		}
	}
}
