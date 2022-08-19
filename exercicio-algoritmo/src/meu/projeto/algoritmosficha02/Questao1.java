// media das notas

package meu.projeto.algoritmosficha02;

import java.util.Scanner;

public class Questao1 {
	public static void main (String[] args) {
		
		float total = 0f;
		float media = 0f;
		float[] notas = new float[5];
		
		Scanner sc = new Scanner(System.in);
		
		for (byte i = 0; i < notas.length; i++) {
			
			System.out.printf("Nota %o \n", i+1);
			
			notas[i] = sc.nextFloat();
			total += notas[i];
		}
		
		media = total / notas.length;
		System.out.printf("Sua media é: %.2f", media);
		
		sc.close();
		
	}
}

