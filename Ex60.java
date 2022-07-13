import java.util.Scanner;

public class Ex60 {

	public static void main(String[] args) {
		
		Scanner e = new Scanner(System.in);
		
		
		int[] vetA={1,2,3,4,5};
		int[] vetB={1,2,3,4,5};
		int[] resp = new int[5];
		int i;
		
			System.out.println("A soma dos vetores são:");
		for(i=0;i<resp.length;i++){
			resp[i] = vetA[i]+vetB[i];
			
			System.out.println("Vetor["+i+"]=" + resp[i]);
		}
		
	}

}
