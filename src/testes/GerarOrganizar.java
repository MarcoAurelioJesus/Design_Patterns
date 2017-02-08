package testes;

import java.util.Arrays;
import java.util.Random;

public class GerarOrganizar {

	/*
	 * public static void main(String[] args) { int[] array = new int[10];
	 * Random gerador=new Random(); for(int i=0;i<10;i++){
	 * array[i]=gerador.nextInt(25); } //Imprime o Array original
	 * System.out.println("Antes"); for(int i: array){ System.out.println(i); }
	 * // Faz todo o trabalho para você // e de forma mais eficiente do que a
	 * que estava tentando Arrays.sort(array); //Imprime o Array
	 * System.out.println("Depois"); for(int i: array) System.out.println(i); }
	 */

	////////////////////////////////////////////////////
	
	/*public static void main(String[] args) {   
		int[] vetor = {2,5,52,456,1,0,-50,356}; //vetor não está ordenado  
	       Arrays.sort(vetor);//pronto, vetor está ordenado, não precisa "retornar"  
	       //agora você pode usar ele pra imprimir, e vai estar em ordem  
	         
	       for(int i: vetor){  
	           System.out.println(i + " ");  
	       }  
	       System.out.println();  
}*/
	
	public static void main(String[] args) {
		int[] num =  {2, 3, 1, 7, 9, 4, 8, 10, 6, 5};
		System.out.println("Atual:");
		for (int aux : num) {
			System.out.print(aux + " ");
		}
		Arrays.sort(num);
		System.out.println("\nOrdenado:");
		for (int aux : num) {
			System.out.print(aux + " ");
		}
	}
}
