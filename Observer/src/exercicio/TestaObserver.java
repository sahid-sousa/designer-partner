package exercicio;

public class TestaObserver {
	public static void main(String[] args) {
		
		/*
		 * Observer
		 * Objetivo: Definir um mecanismo eficiente para reagir às alterações realizadas em determinados objetos.
		 */
		
		Acao acao = new Acao(" VALE3 ", 45.27);
		Corretora corretora1 = new Corretora("Corretora1");
		Corretora corretora2 = new Corretora("Corretora2");
		acao.registraInteressado(corretora1);
		acao.registraInteressado(corretora2);
		acao.setValor(50);
	}
}
