package pctExercicio7;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int total, comissao, salario, saltotal;
		
		System.out.println("Quanto foi seu total vendido no mês de abril em reais? ");
		total = entrada.nextInt();
		
		salario = 1200;
		comissao = total / 10;
		saltotal = (total / 10) + salario;
		
		if(saltotal>=2000){
			System.out.println("Sua comissão será de: R$"+comissao+" e o valor total que você vai receber será de R$"+saltotal+".");
			}
		else{
			System.out.println("Seu salário total será de R$1200.");
		}
		entrada.close();
}

}
