package br.com.senaisp.bauru.aula05;

import java.util.Scanner;

public class Exemplo09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Utilizando uma estrutura while
		//Nesta situação você cria um laço, forçando o usuario a digitar corretamente
		
		String res;//Do força a entrada, sem precisar de um valor do="faça"
		do {
			System.out.println(" Digite S ou N:");
			res = sc.nextLine();
		
		}	while (!res.equals("S") && !res.equals("N")); {//Aqui tem ";"devido i resultado ser no final

		System.out.println("Saiu");
		sc.close();
		
	}

   }
}
