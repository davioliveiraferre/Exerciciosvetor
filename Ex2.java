import java.util.*;

public class Ex2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 5;
		int a[], i, m;
		
		a = new int  [TAM];
		
		for(i=0; i<TAM;i++) {
			System.out.println("digite o número para realizar a tabuada");
			a[i] = in.nextInt();
			
			m = a[i]*1;
			System.out.println(m);
			m = a[i]*2;
			System.out.println(m);
			m = a[i]*3;
			System.out.println(m);
			m = a[i]*4;
			System.out.println(m);
			m = a[i]*5;
			System.out.println(m);
			m = a[i]*6;
			System.out.println(m);
			m = a[i]*7;
			System.out.println(m);
			m = a[i]*8;
			System.out.println(m);
			m = a[i]*9;
			System.out.println(m);
			
		}
	}

}
