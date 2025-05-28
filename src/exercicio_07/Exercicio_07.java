package exercicio_07;

import javax.swing.JOptionPane;

/**
 *
 * @author Lorenzo
 */
public class Exercicio_07 {

    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome:");
        JOptionPane.showMessageDialog(null, "Seu nome foi armazenado com sucesso!");
        JOptionPane.showMessageDialog(null, "Seu nome é: " + nome);
    }
}
