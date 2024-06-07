package main;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		//imports
        Scanner sc = new Scanner(System.in);

        // Declaração da matriz
        int[][] matriz = new int[3][3];
        int somaPrinc = 0;
        int somaSecun = 0;

        //ENTRADA DE DADOS
        System.out.println("Digite os numeros da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
        	//repetindo linhas
            for (int j = 0; j < 3; j++) {
            	//repetindo colunas
                System.out.print("numeros [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nNumeros da Diagonal Principal:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][i] + " ");
            somaPrinc += matriz[i][i];
        }
        System.out.println("\nSoma dos Numeros da Diagonal Principal: " + somaPrinc);

        System.out.println("\nNumeros da Diagonal Secundária:");
        for (int i = 0; i < 3; i++) {
            System.out.print(matriz[i][2 - i] + " ");
            somaSecun += matriz[i][2 - i];
        }
        System.out.println("\nSoma dos Numeros da Diagonal Secundária: " + somaSecun);

        sc.close();

	}

}
