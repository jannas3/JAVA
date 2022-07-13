import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
		Scanner e= new Scanner(System.in);
		System.out.print("Digite salario bruto:");
		double sal= e.nextDouble ();
		double  inss;
		double ir;
		double liquido ;
		if (sal<=1500){
			inss=sal*0.08;
			ir=0;
		}
		else{
			inss=sal*0.11;
			ir=sal*0.05;
		}
		liquido=sal-inss-ir;
		System.out.println( "o valor do salario é " + liquido );
			
		
		
		
	}
	

}
