package br.com.senaisp.bauru.aula04;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome completo");
		//Captura o texto completo
		String nome = sc.nextLine();
		//Exemplo Roberto da Silva Sauro
		//Obter o primeiro nome e o último nome que foi digitado
		String priNome = nome.substring(0,nome.indexOf(" ")); //Roberto
		String ultNome = nome.substring(nome.lastIndexOf(" ")+1);	
		System.out.println(priNome);
		System.out.println(ultNome);
		sc.close();
		
		
		
		
	}

}
