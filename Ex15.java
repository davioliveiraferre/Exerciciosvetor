import java.util.Scanner;

public class Ex15 {
    
    public static void main(String[]args) {
        Scanner leia = new Scanner(System.in);
        final int TAM = 3;
        int i, a[], b[], c[];
        a = new int[TAM];
        b = new int[TAM];
        c = new int[TAM];
        
        for(i=0; i<TAM; i++) {
            System.out.println("Digite o "+(i+1)+"o valor para o vetor A:");
            a[i] = leia.nextInt();
        }
        
        for(i=0; i<TAM; i++) {
            System.out.println("Digite o "+(i+1)+"o valor para o vetor B:");
            b[i] = leia.nextInt();
        }
        
        for(i=0; i<TAM; i++) {
            if(a[i]>b[i]) {
                c[i] = 1;
            }else if(a[i] == b[i]){
                c[i] = 0;
            }else {
                c[i] = -1;
            }
        }
        
        System.out.println("Vetor B:");
        for(i=0; i<TAM; i++) {
            System.out.println(c[i]);
        }
        
        leia.close();
    }
}
