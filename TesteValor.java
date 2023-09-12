import javax.swing.JOptionPane;

public class TesteValor {
    public static void main(String[] args) {
        double n = Double.parseDouble(
            JOptionPane.showInputDialog("digite um valor")
        );


        if (n >= 100) {
            JOptionPane.showMessageDialog(null, n + " maior ou igual a 100");
        }
        else {
            JOptionPane.showMessageDialog(null, n + " menor que 100");

        }



    }
}
