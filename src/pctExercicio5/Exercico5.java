package pctExercicio5;
import java.util.Scanner;

public class Exercico5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner entrada = new Scanner(System.in);
	System.out.print("Digite o valor do empréstimo: R$");
	double valorEmprestimo = entrada.nextDouble();

	System.out.print("Digite o número de parcelas: ");
	int numParcelas = entrada.nextInt();

	System.out.print("Digite o salário do solicitante: R$");
	double salario = entrada.nextDouble();

	double valorParcelas = valorEmprestimo / numParcelas;
	double percentualSalario = (valorParcelas / salario) * 100;

	if (percentualSalario <= 30) {
	    System.out.println("Empréstimo aprovado!");
	} else {
	    System.out.println("Empréstimo não aprovado. O valor das parcelas representa mais de 30% do salário do solicitante.");
	}

	entrada.close();
	}

}
