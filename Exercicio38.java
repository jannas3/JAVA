import java.util.Scanner;

public class Exercicio38 {

	public static void main(String[] args) {
		Scanner e= new Scanner(System.in);
		
		System.out.print("Digite o salario bruto: ");
		float salbruto= e.nextFloat();
	
		if(salbruto<=500){
			salbruto=(float) (salbruto*1.10);

	}
		System.out.println( "o valor do salario é " + salbruto );

}
}
