package br.com.senaisp.bauru.aula05;

import java.util.Scanner;

public class Exemplo08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Utilizando uma estrutura while
		//Nesta situação você cria um laço, forçando o usuario a digitar corretamente
		
		String res = "";//valor invalido para forçar o laço de repetição do while(repetição)
		while (!res.equals("S") && !res.equals("N")) {// while sem ponto e virgula ";"
			System.out.println(" Digite S ou N:");
			res = sc.nextLine();
		}
		System.out.println("Saiu");
		sc.close();
		
	}

}
