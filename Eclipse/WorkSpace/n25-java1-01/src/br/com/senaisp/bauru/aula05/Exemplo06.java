package br.com.senaisp.bauru.aula05;

import java.util.Scanner;

public class Exemplo06 {
	 //Alt segurado para multipla edição
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Digite um valor entre 1 e 5:");
		int vlr = sc.nextInt();
		switch(vlr) {
		case  1 -> System.out.println(" Você ganhou um caneta!");
		case  2 -> System.out.println(" Você ganhou um lapis!");
		case  3 -> System.out.println(" Você ganhou um borracha!");
		case  4 -> System.out.println(" Você ganhou um bombom!");
		case  5 -> System.out.println(" Você ganhou um bala!");
		default -> System.out.println(" Opção inválida!");
		}
		sc.close();
	}

}
