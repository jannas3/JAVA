import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {
	int num ;
	Scanner e= new Scanner(System.in);
	System.out.print("Digite um numero:");
	int num1= e.nextInt ();
	
	
	if (num1 % 2 == 0){
		System.out.print("numero é par\n");

	}
	else if(num1 % 2 == 1){
		System.out.print("numero é impar\n");
}
	if(num1>0){
		System.out.print("numero é positivo");
	}
	else{
		System.out.print("numero é negativo");
	}
}
}
