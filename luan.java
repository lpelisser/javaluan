import javax.swing.JOptionPane;

public class luan {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Escreva seu nome:");

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Escreva sua idade:"));

        String objetivo = JOptionPane.showInputDialog("Quais seus objetivos de vida:");

        System.out.printf("Nome: %s%nIdade: %d%nObjetivo: %s%n", nome, idade, objetivo);

        JOptionPane.showMessageDialog(null,
                "Nome:" + nome + "\nIdade:" + idade + "\nObjetivos:" + objetivo,
                "informação", JOptionPane.INFORMATION_MESSAGE);
    }
}
