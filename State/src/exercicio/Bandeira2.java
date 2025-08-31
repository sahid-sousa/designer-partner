package exercicio;

public class Bandeira2 implements Bandeira {

	public double calculaValorDaCorrida(double tempo, double distancia) {
		return 10.0 + tempo * 1.5 + distancia * 1.7;
	}

}
