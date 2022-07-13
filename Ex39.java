/*Como complemento ao exercício 35, o programa
deverá exibir também a mensagem “Aluno reprovado”,
quando a nota final do aluno for menor que 60.*/
import java.util.Scanner;

public class Ex39 {
	public static void  main(String[]args) {
	Scanner e= new Scanner(System.in);
	
	System.out.print("Digite numero matricula: ");
	int matricula = e.nextInt();
			
	System.out.print("Digite nota final aluno:");
	float notafinal= e.nextFloat();
			
			
	if(nf>=60)
		System.out.println("Aluno Aprovado!");
			
	else
		System.out.println("Aluno Reprovado :(");
					
	}
}
	
