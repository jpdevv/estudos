import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] A = new int[15];
        double[] B = new double[A.length];

        for(int i = 0; i < A.length; i++) {
            System.out.format("Insira o %d° valor: ", i+1);
            A[i] = input.nextInt();
            B[i] = Math.sqrt(A[i]);
        }

        System.out.println();

        for(int i = 0; i < A.length; i++) {
            System.out.format("A[%d] = %d -- B[%d] = %f\n", i, A[i], i, B[i]);
        }

        input.close();
    }
}