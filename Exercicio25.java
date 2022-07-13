import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("O primerio cateto: ");
		double x = entrada.nextDouble();
		
		System.out.print("O segundo cateto: ");
		double y = entrada.nextDouble();
		
		double m = Math.pow(x,2) + Math.pow(y, 2);
		double medida = Math.sqrt(m);
		
		double area = (x*y)/2;
		
		System.out.print("Hipotenusa do triângulo retângulo e : "+medida);
		System.out.print("A area do triângulo retângulo e : " +area);
	}

}
