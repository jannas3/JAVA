import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		Scanner e= new Scanner(System.in);
		System.out.print("Digite valor dos 3 lados:");
		double lado1= e.nextDouble ();
		double lado2= e.nextDouble ();
		double lado3= e.nextDouble ();
		
		if(lado1+lado2<lado3 && lado2+lado3<lado1 && lado1+lado3<lado2){
			System.out.println("podemos construir triangulo com estas dimensões");

	}
		else {
			System.out.println(" não construir triangulo com estas dimensões");
		}
			
}
}
