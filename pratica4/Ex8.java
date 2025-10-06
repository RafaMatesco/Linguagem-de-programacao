import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        int[] M = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] N = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int P = 0;

        for (int i = 0; i < 10; i++) {
            P += M[i] * N[i];
        }

        System.out.println("Produto escalar: " + P);
    }
}
