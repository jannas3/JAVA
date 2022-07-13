import java.util.Scanner;

/*Faça um programa que leia um número dado como
entrada e apresente a mensagem “O número está na
faixa de 20 a 90” se o valor fornecido estiver entre
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