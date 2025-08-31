package exercicio;

import java.util.*;

public class ListaDeComandos {
	private List<Comando> comandos = new ArrayList<Comando>();

	public void adiciona(Comando comando) {
		this.comandos.add(comando);
	}

	public void executa() {
		for (Comando comando : this.comandos) {
			comando.executa();
		}
	}
}
