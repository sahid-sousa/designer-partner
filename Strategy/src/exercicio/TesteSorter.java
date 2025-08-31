package exercicio;

import java.util.*;

public class TesteSorter {
	public static void main(String[] args) {
		
		/*
		 * Strategy
		 * Objetivo: Permitir de maneira simples a variação dos algoritmos utilizados na resolução de um determinado problema.
		 */
		
		Sorter sorter = new InsertionSorter();
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(3);
		list.add(2);
		list.add(14);
		List<Integer> list2 = sorter.sort(list);
		for (Integer integer : list2) {
			System.out.println(integer);
		}
		Sorter sorter2 = new SelectionSorter();
		List<Integer> list3 = sorter2.sort(list);
		for (Integer integer : list3) {
			System.out.println(integer);
		}
	}
}
