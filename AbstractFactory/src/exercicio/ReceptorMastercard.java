package exercicio;

public class ReceptorMastercard implements Receptor {
	public String recebe() {
		System.out.println("Recebendo Mensagem da Mastercard");
		String mensagem = "Mensagem da Mastercard";
		return mensagem;
	}
}
