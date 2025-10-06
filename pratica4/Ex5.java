import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int[] vetor = new int[8];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 8 números:");
        for (int i = 0; i < 8; i++) {
            vetor[i] = scanner.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[i + 4];
            vetor[i + 4] = temp;
        }

        for (int i = 0; i < 8; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
