package exercicios;

import java.util.Scanner;

public class Exercicio43 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int QuantidadeAlunos,NotasBoas=0; //notas boas são consideradas quando a nota é maior que 7.
		boolean SalaFudida = true;//SalaFudida quando ninguém tirou nota maior que 5.
		System.out.print("Digite a quantidade de alunos: ");
		QuantidadeAlunos = entrada.nextInt();

		int[] notas = new int[QuantidadeAlunos];

		for(int x=0;x<QuantidadeAlunos;x++){
			System.out.print("Digite a nota do "+(x+1)+"° Aluno: ");
			notas[x]= entrada.nextInt();

			if(notas[x]>7){
				NotasBoas++;
			}
			if(notas[x]>5){
				SalaFudida = false;
			}
		}

		if(SalaFudida==false){
			System.out.println("Existem "+NotasBoas+" notas maiores que 7.");
		}else{
			System.out.println("Não há n");
		}
	}

}
