package exercicio;

public class TesteVisaComunicadorFactory {
	public static void main(String[] args) {
		
		/*
		 * Abstract Factory:
		 * Objetivo: Encapsular a escolha das classes concretas a serem utilizadas na criação dos objetos de diversas famílias.
		 * */
		
		ComunicadorFactory comunicadorFactory = new VisaComunicadorFactory();
		String transacao = "Valor=500;Senha:123";
		Emissor emissor = comunicadorFactory.createEmissor();
		emissor.envia(transacao);
		
		Receptor receptor = comunicadorFactory.createReceptor();
		String mensagem = receptor.recebe();
		System.out.println(mensagem);
	}
}
