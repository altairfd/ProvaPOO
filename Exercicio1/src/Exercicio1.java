import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leiotr = new Scanner(System.in);
        int matriz[][] = new int[5][5];
        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        int result4 = 0;
        int result5 = 0;
        int line;
        int colu;


        for (int i = 0;i < 5; i ++) {
            for (int j =0; j < 5; j ++) {
                System.out.println("Declare o valor:");
                matriz[i][j] = leiotr.nextInt();
                result1 = result1 + matriz[i][j];

            }
        }
        
        while (line < 5 && colu <5) {
            result2 = result2 + matriz[line][colu];
            line++;
            colu++;
        }
        
        result3 = matriz[4][4]+matriz[3][3]+matriz[2][2]+matriz[1][1]+matriz[0][0];

        result4 = result1 + result2;
        result5 = (result2+result3) - matriz[2][2];

        
        System.out.println("Valor final da diagonal principal: " + result2);
        System.out.println("valor final da diagonal secundaria: " + result3);
        System.out.println("valores das diagonais: "+ result5);
        System.out.println("Soma dos valores restantes: " + result4);
    }
}
