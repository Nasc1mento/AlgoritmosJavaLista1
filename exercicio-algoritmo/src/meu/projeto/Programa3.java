package meu.projeto;

import java.util.Scanner;

public class Programa3 {
	
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
	}
}
