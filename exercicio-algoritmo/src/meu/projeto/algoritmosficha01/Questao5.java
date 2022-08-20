// 5. Elabore um algoritmo em Java para identificar se um número  ́e par ou  ́ımpar.

package meu.projeto.algoritmosficha01;

import java.util.Scanner;

public class Questao5 {
	public static void main(String[] args) {

		String resultado;

		System.out.println("Digite um número:");
		int numero;

		Scanner sc = new Scanner(System.in);

		numero = sc.nextInt();
		resultado = numero % 2 == 0 ? "par" : "impar";

		System.out.printf("O numero é %s", resultado);

		sc.close();
	}
}
