import java.util.Scanner;

/*Fa�a um programa que leia um n�mero dado como
entrada e apresente a mensagem �O n�mero est� na
faixa de 20 a 90� se o valor fornecido estiver entre
20 e 90.*/


public class Ex37 {
	public static void main(String[]args) {
		Scanner e= new Scanner(System.in);
		System.out.print("digite  numero entre  20 a  90:");
		int num= e.nextInt();
		
		if(num>19 && num <91){ 
			System.out.println("O seguint numero ta na faixa de 20 a 90:" + num);
		}
	}
	
}