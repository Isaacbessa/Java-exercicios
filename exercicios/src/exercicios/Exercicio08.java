package exercicios;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
        int Numero,ModuloNumero;

      	System.out.print("Módulo de Número\n\n"); //Finalmente...


      	System.out.print("Digite um número inteiro:  ");
      	Numero = entrada.nextInt();


      	ModuloNumero = (Numero < 0)? ModuloNumero = Numero*(-1):Numero;

        System.out.print("O módulo do número é "+ModuloNumero+"\n");

	}

}
