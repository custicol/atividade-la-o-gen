package javatech;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		float saldo = 1000.0f;
		
		System.out.print("operação (1 - saldo, 2 - saque, 3 - deposito): ");
		int operação = input.nextInt();
		
		switch (operação) {
			case 1:
			System.out.println("operação - saldo");
			System.out.printf("saldo: R$ %.2f", saldo);
			break;
			
			case 2:
			System.out.println("operação - saque");
			System.out.print("valor: R$ ");
			float saque = input.nextFloat();
			if (saque <= saldo) {
				saldo -= saque;
				System.out.printf("novo saldo: R$ %.2f", saldo);
			} else {
				System.out.println("saldo insuficiente");
			}
			break;
			
			case 3:
				System.out.println("operação - deposito");
				System.out.print("valor: R$ ");
				float deposito = input.nextFloat();
				saldo += deposito;
				System.out.printf("novo saldo: R$ %.2f", saldo);
				break;
					default:
						System.out.println("operação invalida");
	
						input.close();
		}
		
	}

}
