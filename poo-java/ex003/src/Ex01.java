import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] A = new int[5];
        int[] B = new int[A.length];

        for(int i = 0; i < A.length; i++) {
            System.out.format("Insira o %d° valor: ", i+1);
            A[i] = input.nextInt();
            B[i] = A[i];
        }

        System.out.println();

        for(int i = 0; i < A.length; i++) {
            System.out.format("A[%d] = %d -- B[%d] = %d\n", i, A[i], i, B[i]);
        }

        input.close();
    }
}