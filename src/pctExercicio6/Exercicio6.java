package pctExercicio6;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int n;
		System.out.println("Digite um número inteiro");
		n = entrada.nextInt();
		
		if(n%2==0) {
			System.out.println("O número é par");
		}
		else {
			System.out.println("O número é impar");
		}
		entrada.close();
	}

}
