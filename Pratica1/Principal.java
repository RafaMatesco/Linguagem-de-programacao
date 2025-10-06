
/*
 * 
 * Autores:
 * Rafael Giordano Matesco
 * Gustavo Monteiro Greco
 * 
 */

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Numero: ");
        int num = Integer.parseInt(input);

        String texto = num % 2 == 0 ? "Par" : "Impar";
        JOptionPane.showMessageDialog(null, texto, "Nome digitado", 1);
    }
}