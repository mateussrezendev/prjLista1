package pctExercicio10;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		double gasolina, alcool;
		int tanque, escolhaa;
		
		System.out.println("Qual a capacidade do seu tanque em litros? ");
		tanque = entrada.nextInt();
		
		System.out.println("Escolha a opção: \n");
		System.out.println("1) Gasolina \n");
		System.out.println("2) Álcool \n");
		escolhaa = entrada.nextInt();
		     
	     switch(escolhaa) {

         case 1:

             System.out.println("Para encher seu tanque você irá gastar: R$"+(1.80*tanque));

             break;

         case 2:

             System.out.println("Para encher seu tanque você irá gastar: R$"+(1*tanque));

             break;


         default:

             System.out.println("Opção inválida");

             break;
	
	}

			entrada.close();
}
}
