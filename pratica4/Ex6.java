import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int[] vetor = { 2, 5, 4, 54, 43, 22, 5, 9, 30, 15 };
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor X para buscar: ");
        int x = scanner.nextInt();

        boolean encontrado = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == x) {
                System.out.println("Valor encontrado na posição: " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Valor não encontrado no vetor.");
        }
    }
}
