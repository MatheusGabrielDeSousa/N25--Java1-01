package br.com.senaisp.bauru.aula04;

public class Exemplo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str01 = "Roberto da Silva Sauro";
		//Verificar se há dino no texto
		System.out.println(str01.contains("da"));
		//Obter a posição no texto de um subtexto
		System.out.println(str01.indexOf("Silva"));
		//Obter o carácter na posição desejada
		System.out.println(str01.charAt(3));
		//Obtendo substring(pedaço) de uma string sem limitar final 
		System.out.println(str01.substring(8));
		//Obtendo substring(pedaço) de uma string limitando o final 
		System.out.println(str01.substring(8,16));//limitador sempre um caracter antes ex 8,15)
		//Usando o compareTO, os 14 caracteres são a diferença de letras, do 'a' ao 'o'
		System.out.println(str01.compareTo("Roberta"));
		
		
		
		
	}

}
