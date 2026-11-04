import java.util.*;

public class Ex1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 20;
		int a[], b[], i, valor, p=0 , imp=0;
		
		a = new int [TAM];
		b = new int [TAM];

		
		
		for(i=0; i<TAM; i++){
			System.out.println("Digite os valores");
			valor = in.nextInt();
			if(valor%2 ==0) {
				a[p] = valor;
				p++;
		    
			}else {
				b[imp] = valor;
				imp++;
			}
		}
		
		for(i=0; i<p; i++) {
			System.out.println("pares"+  a[i]);
		}
		
		for(i=0; i<imp; i++) {
			System.out.println("impares"+ b[i]);
		}
	}

}
