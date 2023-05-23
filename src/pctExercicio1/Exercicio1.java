package pctExercicio1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		int n1, n2, soma1, div1;

		System.out.println("Primeira nota: ");
		n1 = entrada.nextInt();

		System.out.println("Segunda nota: ");
		n2 = entrada.nextInt();

		soma1 = n1 + n2;
		div1 = soma1 /2;

		System.out.println("A sua média final da disciplina de Programação é "+div1+".");
		if (div1>=7)
		    System.out.println("Você foi aprovado.");
		else    
		    System.out.println("Você foi reprovado.");


		entrada.close();
}
}
