import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
	Scanner e= new Scanner(System.in);
	System.out.print("Digite sua idade :");
	int idade= e.nextInt ();
	
	
	if (idade>=5 && idade<=10){
		
		System.out.print("Infantil");
	
	}
	else if(idade>=11 && idade<=17){
		
		System.out.print("juvenil");
	}
	if(idade>=18 && idade<=30){
		
		System.out.print("Profissional ");

}
	else if (idade>=30){
		
			
			System.out.print("Sênior");
	}
		
	}
}
