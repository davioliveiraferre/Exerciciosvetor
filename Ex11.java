import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int TAM = 10;
        int a[], i, x, cont=0;

        a = new int[TAM];

        for(i=0; i<TAM; i++) {
            System.out.println("Digite os números:");
            a[i] = in.nextInt();
        }

        System.out.println("Qual número você quer procurar?");
        x = in.nextInt();

        for(i=0; i<TAM; i++) {
            if(x == a[i]) {
                cont++;
            }
        }

        if(cont > 0) {
            System.out.println("Tem o número " + x);
        } else {
            System.out.println("Não tem o respectivo número.");
        }
    }
}
