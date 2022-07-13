import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner e =new Scanner (System.in);
		System.out.print("informe seu nome: ");
		String nome  = e.next();
		System.out.print("Quantos anos você tem: ");
		int idade = e.nextInt();
		System.out.println("Seu nome é " +  nome + " e você tem " + idade + " anos.");

	}

}
