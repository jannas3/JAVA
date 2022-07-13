import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		System.out.print("Digite um Numero: ");
		int numero1 = entrada.nextInt();
		
		
		 int ant =  (numero1-1);
		 int suc =  (numero1+1);
		
		System.out.println("Antecessor de: "+ant);
		System.out.println("Sucessor de: "+suc);
	}

}
