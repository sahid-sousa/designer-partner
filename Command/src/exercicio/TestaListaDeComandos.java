package exercicio;

public class TestaListaDeComandos {
	public static void main(String[] args) {
		
		/*
		 * Command
		 * Objetivo: Controlar as chamadas a um determinado componente, modelando cada requisição como um objeto. Permitir que as operações possam ser desfeitas, enfileiradas ou registradas.
		 */
		
		Player player = new Player();
		ListaDeComandos listaDeComandos = new ListaDeComandos();
		listaDeComandos.adiciona(new TocaMusicaComando(player, "musica1 . mp3"));
		listaDeComandos.adiciona(new AumentaVolumeComando(player, 3));
		listaDeComandos.adiciona(new TocaMusicaComando(player, "musica2 . mp3 "));
		listaDeComandos.adiciona(new DiminuiVolumeComando(player, 3));
		listaDeComandos.adiciona(new TocaMusicaComando(player, "musica3 . mp3 "));
		
		listaDeComandos.executa();
	}
}
