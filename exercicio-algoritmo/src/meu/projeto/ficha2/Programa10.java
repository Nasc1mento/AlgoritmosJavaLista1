
// media de 100 numeros

package meu.projeto;

public class Programa10 {
	static int[] preencher () {
		
		byte max = 100;
		byte min = 0;
		int [] numeros = new int [100];
		
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int) (Math.random() * (max - min + 1) + min);
		}return numeros;
		
	}
	
	static int calcmedia (int [] numeros) {
		
		int soma = 0;
		int media = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
		}		
		media = soma / numeros.length;
		return media;
	}
	
	
	public static void main(String[] args) {
		System.out.println(calcmedia(preencher()));
	}
}
