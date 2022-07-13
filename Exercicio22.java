import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Salario");
		double salario = entrada.nextDouble();

		double novosalario = (double) (salario*1.08);
		
		System.out.print("O Valor do Novo Salario é: "+novosalario);
	}

}
