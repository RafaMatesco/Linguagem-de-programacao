import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int[] inteiros = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            inteiros[i] = scanner.nextInt();
        }
        scanner.close();

        for (int i = 0; i < inteiros.length; i++) {
            if(inteiros[i] >= 20) System.out.print(inteiros[i] + " ");
        }
    }
}
