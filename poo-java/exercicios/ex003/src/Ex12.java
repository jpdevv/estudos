import java.util.Scanner;
public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] A = new int[10];

        for(int i = 0; i < A.length; i++) {
            System.out.format("Insira o %d° valor: ", i+1);
            A[i] = input.nextInt();
        }

        System.out.println();

        int x = 0;
        for(int i = 0; i < A.length; i++) {
            x += A[i];
        }
        
        System.out.format("A soma de todos os números de A[i] é %d\n", x);
        
        input.close();
    }
}