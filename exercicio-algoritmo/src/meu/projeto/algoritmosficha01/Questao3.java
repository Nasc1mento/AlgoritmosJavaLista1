// area de um triangulo

package meu.projeto.algoritmosficha01;

import java.util.Scanner;

public class Questao3 {
	public static void main (String [] args) {
		
		float base1 = 0f;
		float base2 = 0f;
		float altura = 0f;
		float area = 0f;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Base1:");
		base1 = sc.nextFloat();
		System.out.println("Base2:");
		base2 = sc.nextFloat();
		System.out.println("Altura:");
		altura = sc.nextFloat();
		
		area = (base1 * base2) / altura;
		
		System.out.printf("A �rea do tri�ngulo � %.2f", area);
		
		
	}
}
