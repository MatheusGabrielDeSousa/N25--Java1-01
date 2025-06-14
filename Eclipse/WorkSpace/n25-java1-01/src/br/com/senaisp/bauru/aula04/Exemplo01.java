package br.com.senaisp.bauru.aula04;

public class Exemplo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vlr01 + 10;
		int vlr02 = vlr01;
		System.out.println("vlr01:"+vlr01);
		System.out.println("vlr02:"+vlr02);
		//Strings
		String str01 = "Abelha";
		String str02 = str01;
		System.out.println("str01:"+ str01);
		System.out.println("str02:"+ str02);
		// Nesta comparação é feita de endereço de memória
		// Não de conteudo
		System.out.println(str01==str01);
		//Para conteudo usamos equals ou compare
		System.out.println(str01.equals(str02));
	}

}
