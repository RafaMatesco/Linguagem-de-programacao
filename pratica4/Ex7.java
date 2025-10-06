import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        int[] A = { 1, 2, 4, 6, 21 };
        int[] B = { 2, 3, 6, 7, 9, 11, 15, 20 };

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    System.out.print(A[i] + " ");
                    break;
                }
            }
        }
        System.out.println();
    }
}
