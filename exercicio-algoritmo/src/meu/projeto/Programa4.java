package meu.projeto;

import java.util.Scanner;

public class Programa4 {
	public static void main (String [] args) {
		
		System.out.println("Digite um número:");
		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		numero = sc.nextInt();
		
		System.out.println(numero % 2 == 0 ? "par" : "impar");
		
	}
}
