package exercicio;

public class TestaGeradorDeBoleto {
	public static void main(String[] args) {
		
		/* Builder
		 * Objetivo: Separar o processo de construção de um objeto de sua representação e permitir a sua
		 * criação passo-a-passo. Diferentes tipos de objetos podem ser criados com implementações distintas de
		 * cada passo. 
		 * */
		
		BoletoBuilder boletoBuilder = new BBBoletoBuilder();
		GeradorDeBoleto geradorDeBoleto = new GeradorDeBoleto(boletoBuilder);
		Boleto boleto = geradorDeBoleto.geraBoleto();
		System.out.println(boleto);
		
	}

}
