package javatech;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int valorA, valorB, valorC, soma;
		
		System.out.println("Digite tres Valores: ");
		
		System.out.print("Digite o Valor A: ");
		valorA = sc.nextInt();
		
		System.out.print("Digite o Valor B: ");
		valorB = sc.nextInt();
		
		System.out.print("Digite o Valor C: ");
		valorC = sc.nextInt();
		
		soma = valorA + valorB;
		
		if (soma > valorC) {
			System.out.printf("%d + %d = %d > %d", valorA, valorB, soma, valorC);
			System.out.println("\nA Soma de A + B é maior do que C");
		} else if (soma < valorC) {
			System.out.printf("%d + %d = %d > %d", valorA, valorB, soma, valorC);
			System.out.println("\nA Soma de A + B é menor do que C");
		} else {
			System.out.printf("%d + %d = %d > %d", valorA, valorB, soma, valorC);
			System.out.println("\nA Soma de A + B é igual do que C");
		}
		
		sc.close();
		
		
		
	}

}
