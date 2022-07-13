import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("O primerio numero real");
		float numero1 = entrada.nextFloat();
		
		System.out.print("O segundo numero real");
		float numero2= entrada.nextFloat();
		
		float  soma = (numero1+numero2);
		float  media = (numero1+numero2/2);
		
		System.out.println("A soma dos numeros e: "+soma);
		System.out.println("A media das somas  e: "+media);
	}

}
