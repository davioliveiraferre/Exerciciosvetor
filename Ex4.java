import java.util.Scanner;
public class Ex4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int a[], n,n1,i;
		
		a = new int[TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("Digite o número");
			a[i] = in.nextInt();
			
			for(n1=0;n1<=a[i];n1+=2) {
				System.out.print(n1 + " ");
				
			}
			System.out.println();
		}
		
	}
}
