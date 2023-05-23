package pctExercicio9;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		double hs,ms;
		System.out.println("Quanto tempo em horas você utilizou o estacionamento? ");
		hs = entrada.nextDouble();
		System.out.println("Quanto tempo em minutos você utilizou o estacionamento? ");
		ms = entrada.nextDouble();
		
		if(hs==0 && ms>=60) {
			System.out.println("O valor que você pagará no estacionamento será de R$4.00");
		}
		else if(hs==1 && ms==0) {
			System.out.println("O valor que você pagará no estacionamento será de R$4.00");
		}
		else if(hs==1 && ms>=1 && ms<61) {
			System.out.println("O valor que você pagará no estacionamento será de R$6.00");
		}
		else if(hs==2 && ms==0) {
			System.out.println("O valor que você pagará no estacionamento será de R$6.00");
		}
		else if(hs==2 && ms>=1 && ms<61) {
			System.out.println("O valor que você pagará no estacionamento será de R$"+(6.00+1));
		}
		else if(hs==3 && ms==0){
			System.out.println("O valor que você pagará no estacionamento será de R$"+(6.00+1));
		}
	
		else if(hs==4 && ms>=1 && ms<61){
			System.out.println("O valor que você pagará no estacionamento será de R$"+(7.00+1));
		}	
		
		else if(hs>=4 && ms==0){
			System.out.println("O valor que você pagará no estacionamento será de R$"+((hs-2)+6.00));
		}	
		else if(hs>=4 && ms>=1){
			System.out.println("O valor que você pagará no estacionamento será de R$"+((hs-2)+7.00));
		}	
		else {
			System.out.println("O valor que você pagará no estacionamento será de R$"+((hs-2)+7.00));
		}
		entrada.close();
	}

}
