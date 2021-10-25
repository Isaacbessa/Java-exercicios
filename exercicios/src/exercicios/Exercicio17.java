package exercicios;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
        int numero;

      	System.out.print("Verificador de numeros positivos ou negativos\n\n");

    		do {
          System.out.print("Digite um número, digite 0 para sair: ");
          numero = entrada.nextInt();
          if(numero>0){
            System.out.print("O número é positivo\n");
          }else if(numero < 0){
            System.out.print("O número é negativo\n");
          }
        }while(numero != 0);

	}

}
