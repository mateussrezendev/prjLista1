package pctExercicio2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		int n3;

		System.out.println("Qual sua idade?");
		n3 = entrada.nextInt();

		if (n3>=18)
		    System.out.println("Você é maior de idade.");
		else    
		    System.out.println("Você é menor de idade.");

		entrada.close();
	}

}
