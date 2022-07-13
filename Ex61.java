import java.util.Scanner;

public class Ex61 {

	public static void main(String[] args) {

		Scanner e = new Scanner(System.in);

		int[] num = new int[19];
		int i;
		int x = 0;
		
		
		for(i=0;i<num.length;i++){
		System.out.print("Digite um numero:");
		num[i] = e.nextInt();
		}
	while(true){
		System.out.println("Digite o indice:");
		x = e.nextInt();
		
		if(x>0 && x<num.length)
			System.out.println("Vetor["+i+"]=" + num[x]);
		else
		break;

		
		
	
		}
		
	}

}
