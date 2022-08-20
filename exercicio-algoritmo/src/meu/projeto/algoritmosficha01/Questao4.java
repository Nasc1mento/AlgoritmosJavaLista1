//4. Construa um algoritmo que fa ̧ca a leitura de dois n ́umeros inteiros e imprima no console qual n ́umero
// ́e o maior, se o primeiro ou o segundo.
 
package meu.projeto.algoritmosficha01;

import java.util.Scanner;

public class Questao4 {
	
	public static void main (String [] args) {
		int numero1;
		int numero2;
		int resultado;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um número:");
		numero1 = sc.nextInt();
		System.out.println("Digite o próximo número:");
		numero2 = sc.nextInt();
		resultado = numero1 > numero2 ? numero1 : numero2;
		
		System.out.print(resultado);
		
		sc.close();
	}
}
