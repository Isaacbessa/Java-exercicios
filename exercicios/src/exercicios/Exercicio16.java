package exercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
	        int[] valores = new int[3];

	      	System.out.print("Verificador de variáveis\n\n"); //seria melhor fazer com matrizes

			for (int x= 0; x < 3; x++) {
				System.out.print("Digite o valor "+(x+1)+": ");
				valores[x] = entrada.nextInt();
				while(valores[x]<=0){
					System.out.print("Digite um valor válido no valor "+(x+1)+": ");
					valores[x] = entrada.nextInt();
				}
			}
			Arrays.sort(valores);
			System.out.print("Exibe o menor valor lido multiplicado pelo maior: "+(valores[0]*valores[2])+"  E o maior valor dividido pelo menor: "+(valores[2]/valores[0]));

	}

}
