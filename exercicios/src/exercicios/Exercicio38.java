package exercicios;

import java.util.Scanner;

public class Exercicio38 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int quantidade;
		
		System.out.print("Digite a quantidade de números: ");
		quantidade = entrada.nextInt();
		
		int[] vetorX = new int[quantidade];
		int[] vetorY = new int[quantidade];
		
		for(int x=0;x<quantidade;x++){
			System.out.print("Digite o "+(x+1)+"° Número do vetor X: ");
			vetorX[x]= entrada.nextInt();
		}
		for(int y=0;y<quantidade;y++){
			System.out.print("Digite o "+(y+1)+"° Número do vetor Y: ");
			vetorY[y]= entrada.nextInt();
		}
		
		System.out.print("A multiplicação dos vetores é:\n");
		for(int w=0;w<quantidade;w++){
			System.out.println(vetorX[w]+" * "+vetorY[w]+" = "+(vetorY[w]*vetorX[w]));
		}

	}

}
