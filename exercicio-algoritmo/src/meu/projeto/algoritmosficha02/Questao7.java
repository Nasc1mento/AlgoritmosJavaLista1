//7. Crie um algoritmo que preencha um Array com 100 números inteiros aleatoriamente e imprima o maior
//e menor elemento.

package meu.projeto.algoritmosficha02;

public class Questao7 {
	static int[] preencher() {

		int max = 10000;
		int min = 0;
		int[] numeros = new int[100];

		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * (max - min + 1) + min);
		}
		return numeros;

	}

	static int maior(int[] numeros) {

		int maiorNumero = Integer.MIN_VALUE;

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > maiorNumero) {
				maiorNumero = numeros[i];
			}
		}
		return maiorNumero;
	}

	static int menor(int[] numeros) {

		int menorNumero = Integer.MAX_VALUE;

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < menorNumero) {
				menorNumero = numeros[i];
			}
		}
		return menorNumero;
	}

	public static void main(String[] args) {

		int[] numeros = preencher();
		System.out.printf("Maior número: %d \n", maior(numeros));
		System.out.printf("Menor número: %d \n", menor(numeros));
	}
}
