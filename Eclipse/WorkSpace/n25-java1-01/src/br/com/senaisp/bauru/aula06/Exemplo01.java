package br.com.senaisp.bauru.aula06;

public class Exemplo01 {

	public static void main(String[] args) {
		//Definindo um vetor de flores 4 posições,vetor é o que esta entre o colchete
		String[] flores = new String[4];
		//Utilizando o vetor e atribuindo o conteudo
		flores[0] = "Rosa";
		flores[1] = "Cravo";
		flores[2] = "Lirio";
		flores[3] = "Margarida";
		// Mostrando os valores com for
		 for (int i=0; i<flores.length;i++ ) {// .length mostra quantos conteudos tem
			 System.out.println(flores[i]);
		 }
		 System.err.println("-" .repeat(20)); // criou uma linha de separação, .repeat repete o caracter escolhido
		 //Utilizando o for em conjunto "foreach)/ mostra todos os conteudos, caso não precise de um indice
		 for(String it: flores) {
			 System.out.println(it);
		 }
	}
	

}
