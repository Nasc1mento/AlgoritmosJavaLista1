// 5. Elabore um algoritmo em Java para identificar se um n ́umero  ́e par ou  ́ımpar.

package meu.projeto.algoritmosficha01;

import java.util.Scanner;

public class Questao5 {
	public static void main (String [] args) {
		
		System.out.println("Digite um número:");
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		numero = sc.nextInt();
		
		System.out.println(numero % 2 == 0 ? "par" : "impar");
		
		sc.close();
	}
}
