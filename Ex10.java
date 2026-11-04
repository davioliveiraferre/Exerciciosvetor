import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int TAM = 10;
        int a[], b[], c[], i, j, k=0, cont=0;

        a = new int[TAM];
        b = new int[TAM];
        c = new int[TAM];

        for(i=0; i<TAM; i++) {
            System.out.println("Digite os números de A:");
            a[i] = in.nextInt();
        }

        for(j=0; j<TAM; j++) {
            System.out.println("Digite os números de B:");
            b[j] = in.nextInt();
        }

        for(i=0; i<TAM; i++) {

            for(j=0; j<TAM; j++) {
                if(a[i] == b[j]) {
                    cont++;
                }
            }

            if(cont == 0) {
                c[k] = a[i];
                k++;
            }
        }

        for(i=0; i<k; i++) {
            System.out.println("C[" + i + "] = " + c[i]);
        }
    }
}