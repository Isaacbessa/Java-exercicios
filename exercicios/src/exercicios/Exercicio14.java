package exercicios;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
	        int CODIGO;

	      	System.out.print("Verificador de Código\n\n");


	        System.out.print("Digite o Código:  ");
	        CODIGO = entrada.nextInt();



	        switch(CODIGO){
				case 1:
					System.out.println("um");
					break;
				case 2:
					System.out.println("dois");
					break;
				case 3:
					System.out.println("três");
					break;
				default:
					System.out.println("Código inválido");
			}

	}

}
