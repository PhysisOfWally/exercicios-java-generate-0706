package main;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		//imports
		Scanner sc = new Scanner(System.in);
		
		// declarando as variaveis
		int[] vetor = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int numero, posicao = -1;
		
		//entrada de dados
		System.out.print("Digite um número para pesquisar no vetor: ");
        numero = sc.nextInt();
		
        //parte logica do codigo
		for(int i = 0; i < vetor.length; i++) {
			if(vetor[i] == numero) {
				posicao = i;
			}
		}
		
		//mostrando o resultado
		if (posicao == -1) {
            System.out.println("Não foi encontrado!");
        } else {
            System.out.println("O número " + numero + " está na posição " + posicao);
        }
		
		sc.close();
	}

}
