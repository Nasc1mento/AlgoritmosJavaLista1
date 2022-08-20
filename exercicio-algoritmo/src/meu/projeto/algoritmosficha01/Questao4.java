//4. Construa um algoritmo que faça a leitura de dois números inteiros e imprima no console qual número
// ́e o maior, ser o primeiro ou o segundo.
 
package meu.projeto.algoritmosficha01;

import java.util.Scanner;

public class Questao4 {
	
	public static void main (String [] args) {
		int numero1;
		int numero2;
		int valorResultado;
		char nomeResultado;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um número:");
		numero1 = sc.nextInt();
		System.out.println("Digite o próximo número:");
		numero2 = sc.nextInt();
		valorResultado = numero1 > numero2 ? numero1 : numero2;
		nomeResultado = valorResultado == numero1 ? '1' : '2';
		
		System.out.printf("O maior é o %s° com o valor de: %d \n",nomeResultado, valorResultado);
		sc.close();
	}
}
