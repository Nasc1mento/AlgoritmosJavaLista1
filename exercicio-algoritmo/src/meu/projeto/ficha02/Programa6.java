// imprimir scanner array inversamente

package meu.projeto.ficha02;

import java.util.Scanner;

public class Programa6 {
	static int[] preencher (int numeros[]) {

		Scanner sc = new Scanner (System.in);
		
		for (int i = 0; i < numeros.length; i ++) {
			System.out.println("Digite o numero");
			numeros[i] = sc.nextInt();
		}return numeros;
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
