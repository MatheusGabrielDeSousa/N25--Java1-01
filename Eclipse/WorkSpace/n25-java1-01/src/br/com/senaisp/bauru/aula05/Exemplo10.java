package br.com.senaisp.bauru.aula05;

import java.util.Scanner;

public class Exemplo10 {
	//Exemplo de fatoria
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int num = sc.nextInt();
		int res = 1;
		for (int i = num;i > 1; i--) {//forma decrescente 
			res *=i; // res = res * i (seria a mesma operação, a mesma apenas a abrevia
			//break; // Quebra o laço de repetição
		}
		
		System.out.println("O fatorial de" + num + " é " + res);
		sc.close();
	}

}
               // Segundo Exemplo 
       //System.out.println("Digite um número: ");
       //int num = sc.nextInt();
       //long res = 1L;
       //for (int i = num;i > 1; i--) {
       //	res *=i; // res = res * i (seria a mesma operação, a mesma apenas a abrevia
       //}
       //System.out.println("O fatorial de" + num + " é " + res);
       //sc.close();