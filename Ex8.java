 import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int TAM = 10;
        int a[], b[], i, j;

        a = new int[TAM];
        b = new int[TAM];

        for(i=0; i<TAM; i++) {
            System.out.println("Digite um número:");
            a[i] = in.nextInt();
        }

        for(i=0; i<TAM; i++) {
            b[i] = 0;

            for(j=i; j<TAM; j++) {
                b[i] = b[i] + a[j];
            }
        }

        for(i=0; i<TAM; i++) {
            System.out.println("B[" + i + "] = " + b[i]);
        }
    }
}