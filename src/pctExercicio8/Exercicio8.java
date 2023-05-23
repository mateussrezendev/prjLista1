package pctExercicio8;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double altura, sexo, peso;
		
		System.out.println("Qual sua altura? ");
		altura = entrada.nextDouble();
		System.out.println("Qual seu sexo biológico? \n");
		System.out.println("1) Masculino \n");
		System.out.println("2) Feminino \n");
		sexo = entrada.nextDouble();
		
		if(sexo==1) {
			System.out.println("Seu peso ideal será de "+(72.7 * altura - 58)+" quilos.");
		}
		else {
			System.out.println("Seu peso ideal será de "+(62.1 * altura - 44.7)+" quilos.");
		}
		entrada.close();
	}

}
