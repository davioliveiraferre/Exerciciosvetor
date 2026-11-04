
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int TAM = 10;
        int  a[], i, d=0, v;

        a = new int[TAM];

        for(i=0;i<TAM;i++) {

            d=0;

            System.out.println("Digite o número:");
            a[i] = in.nextInt();

            for(v=1;v<=a[i];v++) {
                if(a[i]%v==0) {
                    d++;
                }
            }

            if(a[i] >= 2 && d==2) {
                System.out.println(a[i]+" é primo");
            } else {
                System.out.println(a[i]+" não é primo");
            }
        }

        in.close();
    }
}
