import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int index;
        int[] vetor = new int[10];
        int ax = 0;
        int ax1 = 0;
        Scanner leitor = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("informe o valor de: " +(i+1) +" valor");
            vetor[i] = leitor.nextInt();    
        }

        for (int i = 0; i < 10; i++ ) {
            ax = vetor[1];
            index = i;
            for (int j = 0; j < 10; j++){
                if (vetor[j] == ax1 && index != j) {
                    ax = (ax+ax1);
                }
            }

        }

        System.out.println(ax);
    }
}
