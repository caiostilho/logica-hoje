import javax.swing.JOptionPane;

public class Teste2 {
    public static void main(String[] args) {
        //ler as duas notas utilizando a classe JOptionPane
        double nota1 = lerDouble("digite a primeira nota:");
        double nota2 = lerDouble("digite a segunda nota:");
        //calculo da media
        double media = (nota1 + nota2) / 2;

        //saida com tres opções

        if (media >= 6.0){
            JOptionPane.showMessageDialog(null, "aprovado com " + media);

        } else if(media >= 4.0){
            JOptionPane.showMessageDialog(null, "voce tem media " + media + ", melhor fazer uma atividade extra");


        } else {
            JOptionPane.showMessageDialog(null, "nos vemos ano que vem de novo rss", "Resultado", JOptionPane.ERROR_MESSAGE);
        }

        
    }

    static double lerDouble(String a) {
       return Double.parseDouble(
            JOptionPane.showInputDialog(a)
        );
    }
}
