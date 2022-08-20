//2. Dada a entrada de 10 inteiros em seqência, realize a impressão da entrada inicial de forma inversa.

package meu.projeto.algoritmosficha02;

import java.util.Scanner;

public class Questao2 {
	static int[] preencher (int numeros[]) {

		Scanner sc = new Scanner (System.in);
		
		for (int i = 0; i < numeros.length; i ++) {
			System.out.printf("Digite o %d° número: \n",(i+1));
			numeros[i] = sc.nextInt();
		}
		sc.close();
		return numeros;
	}
	
	static void reverter (int[] numeros, int tamanho) {
		
		if (tamanho >= 0) {
			System.out.println(numeros[tamanho]);
			reverter (numeros, tamanho - 1);
		}
	}
	
	public static void main(String[] args) {
		
		int [] array = new int [10];
		int [] numeros = preencher (array);
		reverter (numeros, numeros.length-1);
	}
}
