package pctExercicio3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
		// TODO Auto-generated method stub
	int n4, n5, n6;

	System.out.println("Informe o primeiro número: ");
	n4 = entrada.nextInt();
	System.out.println("Informe o segundo número: ");
	n5 = entrada.nextInt();
	System.out.println("Informe o terceiro número: ");
	n6 = entrada.nextInt();


	if (n4>n5 && n4>n6)
	    System.out.println(n4+" é o maior número.");
	if(n5>n4 && n5>n6)
	    System.out.println(n5+" é o maior número.");
	if(n6>n4 && n6>n5)
	    System.out.println(n6+" é o maior número.");

	entrada.close();
	}

}
