/*Como complemento ao exerc�cio 37, o programa
dever� exibir tamb�m a mensagem � O n�mero est�
fora da faixa de 20 a 90�, caso o valor fornecido n�o
esteja entre 20 e 90.*/
import java.util.Scanner;

public class Ex41 {
	public static void main(String[]args) {
		Scanner e= new Scanner(System.in);
		System.out.print("digite  numero entre  20 a  90:");
		int num= e.nextInt();
		
		if(num>19 && num <91){ 
			System.out.println("O seguint numero ta na faixa de 20 a 90:" + num);
		}else if (num>90){
                    System.out.println("O numero esta fora da faixa de 20 a 90: "+num);
                    
                }
	}
	
}