//1. Faça um algoritmo em Java para ler, usando o teclado, um número do tipo inteiro, um do tipo long
//e outro do tipo float. Realize a leitura dos números obedecendo a ordem descrita e exiba-os no con-
//sole utilizando o printf (System.out.printf()) na mesma ordem. Formato da sa ́ıda (”O número inteiro
//digitado foi NUMERO  ́INTEIRO, o número long digitado foi NUMERO LONG e o número float foi
//NUMERO  ́FLOAT.”)

package meu.projeto.algoritmosficha01;

import java.util.Scanner;

public class Questao1 {

	static void mostraTipo(int inteiro, long longo, float flutuante) {

		System.out.printf("O numero inteiro digitado foi %d, " + "o numero long digitado foi %d,"
				+ "o numero float digitado foi %f", inteiro, longo, flutuante);
	}

	public static void main(String[] args) {

		int inteiro;
		long longo;
		float flutuante;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número inteiro:");
		inteiro = sc.nextInt();
		System.out.println("Digite o número long:");
		longo = sc.nextLong();
		System.out.println("Digite o número float:");
		flutuante = sc.nextFloat();
		
		sc.close();

		mostraTipo(inteiro, longo, flutuante);
	}
}
