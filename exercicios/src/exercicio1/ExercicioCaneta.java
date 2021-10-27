package exercicio1;

import java.util.Scanner;


public class ExercicioCaneta {
	 public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
		 Caneta bic = new Caneta();
	        bic.setMarca("bic");
	        bic.setCor("azul");
	        bic.setTamanho("10cm");
	        
	        System.out.println("Tamanho: "+bic.getTamanho());
	        System.out.println("Cor: "+bic.getCor());
	        System.out.println("Marca: "+bic.getMarca());
	        
	        sc.close();
	 }
}
