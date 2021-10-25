package exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double Celsius, Fahrenheit; //Consegui colocar o nome de variável mais difícil do mundo

		System.out.print("Conversor de temperatura: Graus Fahrenheit -> Graus Celsius\n\n"); //é basicamente uma cópia do exercício anterior
		
		
		System.out.print("Digite a temperatura em Fahrenheit: ");
		Fahrenheit = entrada.nextDouble();
		
		Celsius = (Fahrenheit - 32 ) * 5 / 9;

		System.out.print("\n A medida convertida é " + Celsius + "ºC\n");

	}

}
