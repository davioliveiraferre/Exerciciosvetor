import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int TAM = 10;
        int a[], i, cont=0;

        a = new int[TAM];

        for(i=0; i<TAM; i++) {
            System.out.println("Digite um número:");
            a[i] = in.nextInt();
        }

        for(i=0; i<TAM/2; i++) {
            if(a[i] == a[TAM-1-i]) {
                cont++;
            }
        }

        if(cont == TAM/2) {
            System.out.println("É um palíndromo!");
        }else {
            System.out.println("Não é um palíndromo!");
        }
    }
}
