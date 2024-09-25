import java.util.Scanner;
public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] A = new int[10];

        for(int i = 0; i < A.length; i++) {
            System.out.format("Insira o %d° valor: ", i+1);
            A[i] = input.nextInt();
        }

        System.out.println();

        for(int i = 0; i < A.length; i++) {
            if(A[i] % 2 == 0) {
                System.out.format("Números pares de A[%d] = %d\n", i, A[i]);
            }
        }

        input.close();
    }
}