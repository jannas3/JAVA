import java.util.Scanner;

public class Ex62 {

	public static void main(String[] args) {
		int[] vetor1 = new int[10];
		int i=0;
		Scanner e = new Scanner(System.in);		
		
		System.out.println("Digite 10 valores inteiros: ");	
		 for (i=0; i<vetor1.length; i++)
		      vetor1[i] = e.nextInt();
		 
		 for(i=0;i<vetor1.length;i++){
				if(vetor1[i]%2==0){
					System.out.printf("M�ltiplos de 2 �: %d\n", vetor1[i]);
				}
			}
			
			for(i=0;i<vetor1.length;i++){
				if(vetor1[i]%3==0){
					System.out.printf("M�ltiplos de 3 �: %d\n", vetor1[i]);
				}
			}
			
			for(i=0;i<vetor1.length;i++){
				if(vetor1[i]%5==0){
					System.out.printf("M�ltiplos de 5 �: %d\n", vetor1[i]);
				}		
		
			}

	}

}