import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantide de números a serem digitados: ");
        int qntNumeros = scanner.nextInt();
        int[] numeros = new int[qntNumeros];
        for (int i = 0; i < qntNumeros; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.println("Sequência na ordem inversa: ");
        for (int i = numeros.length; i > 0; i--) {
            System.out.print(numeros[i-1] + " ");
        }
    }
}
