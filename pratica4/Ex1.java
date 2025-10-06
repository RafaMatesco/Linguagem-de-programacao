import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int[] inteiros = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println();
            inteiros[i] = scanner.nextInt();
        }
        scanner.close();

        for (int i = 0; i < inteiros.length; i++) {
            System.out.print(inteiros[i] + " ");
        }
    }
}
