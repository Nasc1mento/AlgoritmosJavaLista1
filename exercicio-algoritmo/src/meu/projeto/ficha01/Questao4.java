// maior numero
package meu.projeto.ficha01;

import java.util.Scanner;

public class Questao4 {
	
	public static void main (String [] args) {
		int numero1;
		int numero2;
		int resultado;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite um n�mero:");
		numero1 = sc.nextInt();
		System.out.println("Digite o pr�ximo n�mero:");
		numero2 = sc.nextInt();
		resultado = numero1 > numero2 ? numero1 : numero2;
		
		System.out.print(resultado);
	}
}
