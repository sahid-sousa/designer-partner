package exercicio;

public class TestaSingleton {
	public static void main ( String [] args ) {
		
		/*
		 * Singleton:
		 * Objetivo: Permitir a criação de uma única instância de uma classe e fornecer um modo para recuperá-la.
		 * 
		 */
		
		Configuracao configuracao = Configuracao.getInstance() ;
		System.out.println(configuracao.getPropriedade("time-zone")) ;
		System.out.println(configuracao.getPropriedade("currency-code")) ;
	}
}
