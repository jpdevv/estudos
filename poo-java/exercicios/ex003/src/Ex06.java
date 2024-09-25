import java.util.Scanner;
public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[A.length];
        int[] C = new int[A.length];

        for(int i = 0; i < A.length; i++) {
            System.out.format("Insira o %d° valor: ", i+1);
            A[i] = input.nextInt();
            B[i] = A[i];
            C[i] = A[i] + B[i];
        }

        System.out.println();

        for(int i = 0; i < A.length; i++) {
            System.out.format("A[%d] = %d -- B[%d] = %d -- C[%d] = %d\n", i, A[i], i, B[i], i, C[i]);
        }

        input.close();
    }
}