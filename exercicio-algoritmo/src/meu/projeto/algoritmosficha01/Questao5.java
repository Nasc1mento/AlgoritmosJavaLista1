// par ou impar?

package meu.projeto.algoritmosficha01;

import java.util.Scanner;

public class Questao5 {
	public static void main (String [] args) {
		
		System.out.println("Digite um n�mero:");
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		numero = sc.nextInt();
		
		System.out.println(numero % 2 == 0 ? "par" : "impar");
		
	}
}
