package exercicio;

public class TesteControleDePonto {
	public static void main(String[] args) throws InterruptedException {
		
		/* Adapter
		 * Objetivo: Permitir que um objeto seja substituído por outro que, apesar de realizar a mesma tarefa, possui uma interface diferente.
		 */
		
		ControleDePonto controleDePonto = new ControleDePonto();
		Funcionario funcionario = new Funcionario("Marcelo Martins");
		controleDePonto.registraEntrada(funcionario);
		Thread.sleep(3000);
		controleDePonto.registraSaida(funcionario);
	}
}
