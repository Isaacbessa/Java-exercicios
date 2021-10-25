package exercicios;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
	        int Numero;

	      	System.out.print("Verificador de número\n\n");


	        System.out.print("Digite o primeiro número:  ");
	        Numero = entrada.nextInt();



	        if(Numero >= 0 && Numero <= 9){
	          System.out.println("Valor válido.");
	        }else{
	          System.out.println("Valor inválido.");
	        }

	}

}
