import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int[] inteiros = new int[10];
        Scanner scanner = new Scanner(System.in);

        int i = 0, indexPares = 0, maiorValor = 0, soma = 0;
        while (i < 10) {
            int aux = scanner.nextInt();
            if (aux % 2 == 0) {
                inteiros[indexPares] = aux;
                indexPares++;
                soma += aux;

                if (aux > maiorValor) {
                    maiorValor = aux;
                }
            }
            i++;
        }
        scanner.close();
        
        float media = (float)soma / indexPares;
        System.out.printf("Quantidade de valores adicionados: %d. O maior valor encontrado: %d. Média: %.1f", indexPares, maiorValor, media);
    }
}
