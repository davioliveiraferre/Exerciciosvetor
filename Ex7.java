import java.util.*;
public class Ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int TAM = 15;
        int i, a[], n, b[], nn;

        a = new int[TAM];
        b = new int[TAM];

        for(i=0; i<TAM; i++) {
            System.out.println("Digite o número:");
            a[i] = in.nextInt();
        }
        for(i=0; i<TAM; i++) {
            n = 1;

            for(nn=1; nn<=a[i]; nn++) {
                n = nn*n;
            }
            b[i] = n;
        }
        for(i=0; i<TAM; i++) {
            System.out.println("Fatorial de " + a[i] + " = " + b[i]);
        }
    }
}
