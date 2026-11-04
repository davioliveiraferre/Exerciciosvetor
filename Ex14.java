import java.util.Scanner;

public class Ex14 {
    
    public static void main(String[]args) {
        Scanner leia = new Scanner(System.in);
        final int TAM = 10;
        int i, a[], b[];
        a = new int[TAM];
        b = new int[TAM];
        
        for(i=0; i<TAM; i++) {
            System.out.println("Digite o "+(i+1)+"o valor para o vetor A:");
            a[i] = leia.nextInt();
        }
        
        for(i=0; i<TAM; i++) {
            if(a[i] % 2 == 0) {
                b[i] = 1;
            } else {
                b[i] = 0;
            }
        }
        
        System.out.println("Vetor B:");
        for(i=0; i<TAM; i++) {
            System.out.println(b[i]);
        }
        
        
        
        leia.close();
    }
}
