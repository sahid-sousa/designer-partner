package exercicio;

public class TestaContas {
	public static void main(String[] args) {
		
		/*
		 * TemplateMethod
		 * Objetivo: Definir a ordem na qual determinados passos devem ser realizados na resolução de um problema e permitir que esses passos possam ser realizados de formas diferentes de acordo com a situação.
		 */
		
		Conta contaCorrente = new ContaCorrente();
		Conta contaPoupanca = new ContaPoupanca();
		contaCorrente.deposita(100);
		contaCorrente.saca(10);
		contaPoupanca.deposita(100);
		contaPoupanca.saca(10);
		System.out.println(" Saldo da Conta Corrente : " + contaCorrente.getSaldo());
		System.out.println(" Saldo da Conta Poupança : " + contaPoupanca.getSaldo());
	}

}
