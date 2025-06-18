package br.com.senaisp.bauru.aula05;

import java.util.Scanner;

public class Exemplo07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Digite S ou N: ");
		// Usando operador ternário
		//testeLógico ? valor_se_verdade : valor_se_falso
		String res = sc.nextLine();
		System.out.println(" Você digitou " + ( res.charAt(0)=='S' ? "Sim" : "Não" ));
		sc.close();
		
		
		
		//Teste logico if (se o valor x for menor ou maior que y será; z){} else if(se não será ?)
		// if (i1<=c2 && i1<=c2);{}
		//float res=0f;
		// res = d2;
		//} else if (i1<=c3){}
		//}// if (i1<=c3);{}
		// res = d3;
		
		
		
	}

}
