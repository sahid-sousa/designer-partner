package exercicio;

import java.util.*;

public class TestaIterator {
	public static void main(String[] args) {
		
		/*
		 * Iterator
		 * Objetivo: Fornecer um modo eficiente para percorrer sequencialmente os elementos de uma coleção, sem que a estrutura interna da coleção seja exposta.
		 */
		
		String[] nomes = new String[4];
		nomes[0] = "Rafael Cosentino ";
		nomes[1] = "Marcelo Martins ";
		nomes[2] = "Jonas Hirata ";
		nomes[3] = "Solange Domingues ";
		ListaDeNomes listaDeNomes = new ListaDeNomes(nomes);
		Iterator<String> iterator = listaDeNomes.iterator();
		iterator.hasNext();
		iterator.remove();
		while (iterator.hasNext()) {
			String nome = iterator.next();
			System.out.println(nome);
		}
		System.out.println("-------------");
		System.out.println("Testando o foreach ");
		for (String nome : listaDeNomes) {
			System.out.println(nome);
		}
	}
}
