// primo, impar , par dos 100 numeros inteiros

package meu.projeto.ficha02;

public class Programa8 {
	static int[] preencher () {
		
		byte max = 100;
		byte min = 0;
		int [] numeros = new int [100];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * (max - min + 1) + min);
		}return numeros;
		
	}
	
	static void primo (int [] numeros) {
		System.out.println("Primos:");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 != 0 && numeros[i] % 3 != 0) {
				System.out.println(numeros[i]);
			}
		}
	}
	
	static void impar (int [] numeros) {
		System.out.println("Impares:");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 != 0) {
				System.out.println(numeros[i]);
			}
		}
	}
	
	static void par (int [] numeros) {
		System.out.println("Pares:");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.println(numeros[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		primo(preencher());
		impar(preencher());
		par(preencher());
	}
}
