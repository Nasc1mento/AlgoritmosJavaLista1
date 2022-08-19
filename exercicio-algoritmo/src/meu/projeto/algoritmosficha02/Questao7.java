// maior dos cem numeros

package meu.projeto.algoritmosficha02;

public class Questao7 {
	static int[] preencher () {
			
			byte max = 100;
			byte min = 0;
			int [] numeros = new int [100];
			
			for (int i = 0; i < numeros.length; i++) {
				numeros[i] = (int) (Math.random() * (max - min + 1) + min);
			}return numeros;
			
	}
	
	static int maior (int [] numeros) {
		
		int maior = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > maior) {
				maior = numeros[i];
			}
		}return maior;
	}
	
	public static void main(String[] args) {
		System.out.println(maior(preencher()));
	}
}
