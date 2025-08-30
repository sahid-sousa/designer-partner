package execicio;

public class EmissorJMS implements Emissor {

	@Override
	public void envia(String mensagem) {
		System.out.println("Enviando por JMS a Mensagem");
		System.out.println(mensagem);
	}

}
