package execicio;

public class TestaEmissores {
	public static void main(String[] args) {
		
		/*
		 * Factory Method 
		 * Objetivo: Encapsular a escolha da classe concreta a ser utilizada na criação de objetos de um determinado tipo.
		 * */
		
		Emissor emissor1 = new EmissorSMS();
		emissor1.envia("Enviando menssagem por SMS");
		
		Emissor emissor2 = new EmissorEmail();
	    emissor2.envia("Enviando menssagem por Email");
	    
	    Emissor emissor3 = new EmissorJMS();
	    emissor3.envia("Enviando menssagem por JMS");
	}
}
