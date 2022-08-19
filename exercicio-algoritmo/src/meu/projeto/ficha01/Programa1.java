// IMC

package meu.projeto.ficha01;

import java.util.Scanner;

public class Programa1 {
	public static void main(String[] args) {
		
		float peso = 0f;
		float altura = 0f;
		float imc = 0f;
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Peso:");
		peso = sc.nextFloat();
		System.out.print("Altura:");
		altura = sc.nextFloat();
		
		
		imc =  peso / (altura * altura);
		
		
		
		System.out.printf("Seu IMC � %.2f", imc);
	}
}









		
		
		


