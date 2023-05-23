package pctExercicio4;
import java.util.Scanner;
	
public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner entrada = new Scanner(System.in);
	int sal, sal2, sal3, sal4, sal5, tempo;

	System.out.println("Qual o seu salário? ");
	sal = entrada.nextInt();

	sal2 = (int) (sal * 0.2);
	sal3 = sal + sal2;
	sal4 = (int) (sal * 0.1);
	sal5 = sal + sal4;

	System.out.println("Quantos anos trabalha na empresa? ");
	tempo = entrada.nextInt();

	if (tempo>=5)
	    System.out.println("Seu bônus será de 20%, você vai receber no total: "+sal3);
	else    
	    System.out.println("Seu bônus será de 10%, você vai receber no total: "+sal5);
	entrada.close();
	}

}
