//3. Escreva um algoritmo em Java para realizar o c ́alculo de  ́area de um trap ́ezio retˆangulo. Todas as
//entradas do usu ́ario devem estar em cm. A sa ́ıda do algoritmo deve ser a  ́area do trap ́ezio em cm2 no
//console (e.g. ”A  ́area do trap ́ezio em cm2  ́e ”). A f ́ormula  ́e
//
//area  ́ =
//(Basemaior + Basemenor) ∗ altura
//
//2

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
		
		System.out.printf("A área do triângulo é %.2f", area);
		
		sc.close();
		
		
	}
}
