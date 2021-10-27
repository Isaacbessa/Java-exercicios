package exercicios;

import java.util.Scanner;

public class Exercicio31 {

		private static double primeiro, segundo;

		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			int opcao;
			String charOpcao;
			boolean encerrar=false;

			while(encerrar==false){

				System.out.println("Digite uma das opções para as operações:\n1 – Adição\n2 – Subtração\n3 – Multiplicação\n4 – Divisão\nopção: ");
				opcao = entrada.nextInt();

				switch(opcao){
					case 1:
						pegar_numeros();
						System.out.println("Resultado de "+primeiro+"+"+segundo+"="+(primeiro+segundo));
						break;
					case 2:
						pegar_numeros();
						System.out.println("Resultado de "+primeiro+"-"+segundo+"="+(primeiro-segundo));
						break;
					case 3:
						pegar_numeros();
						System.out.println("Resultado de "+primeiro+"*"+segundo+"="+(primeiro*segundo));
						break;
					case 4:
						pegar_numeros();
						System.out.println("Resultado de "+primeiro+"/"+segundo+"="+(primeiro/segundo));
						break;
					default:
						System.out.println("Opção inválida, digite novamente a opção: ");
						opcao = entrada.nextInt();
				}
				System.out.println("Deseja continuar?(s/n)");
				charOpcao = entrada.next();
				if(charOpcao=="N"||charOpcao=="n"){
					encerrar = true;
				}
			}



		}

		public static void pegar_numeros(){
			Scanner entrada = new Scanner(System.in);
			System.out.println("Digite o primeiro número: ");
			primeiro = entrada.nextDouble();

			System.out.println("Digite o segundo número: ");
			segundo = entrada.nextDouble();
	}

}
