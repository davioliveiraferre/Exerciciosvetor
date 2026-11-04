
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int TAM=10;
        int a[],i,d;

        a = new int[TAM];

        for(i=0;i<TAM;i++) {
            System.out.println("Digite o número:");
            a[i]=in.nextInt();
        }

        for(i=0;i<TAM;i++) {

            System.out.println(a[i]+" - Divisores:");

            for(d=1;d<=a[i];d++) {
                if(a[i]%d==0) {
                    System.out.print(d+" ");
                }
            }

            System.out.println();
        }

        in.close();
    }
}

