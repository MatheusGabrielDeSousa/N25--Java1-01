package br.com.senaisp.bauru.aula05;

import java.util.Scanner;

public class Exemplo02 {
	//Qualquer next que não seja nextLine antes, é preciso adicionar mais um nextLine, como na linha 15
	public static void main(String[] args) {
		//Primeiro nome
		Scanner sc = new Scanner(System.in);
		System.out.println(" Digite seu nome?: ");
		String nome = sc.next(); //Utiliza o delimitador padrão
		System.out.println(" Seu nome é " + nome);
		// Nome completo
		System.out.println(" Digite seu nome completo: ");
		sc.nextLine(); // Captura o Enter no comando anterior, e evita que o proximo seja ignorado
		String nomeCompleto = sc.nextLine(); // Usa o delimitador \n
		System.out.println(" Nome completo: " + nomeCompleto);
		
		sc.close();
		
		
		
		
		
		
	}
	

}
