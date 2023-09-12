import java.util.Scanner;
import javax.swing.JOptionPane;


public class Teste {
    
    public static void main(String[] args) {
        //declaração de variaveis
        //sistema de tipos estatico(compilador)
        Scanner teste = new Scanner(JOptionPane.showInputDialog("Bota a nota ae"));
        Scanner leitor = new Scanner(System.in);
        double nota1, nota2, nota3;

        //entrada
        //System.out.println("Digite a pirmeira nota");
        //nota1 = leitor.nextDouble();
        nota1 = teste.nextDouble();

        System.out.println("Digite a segunda nota");
        nota2 = leitor.nextDouble();

        System.out.println("Digite a terceira nota");
        nota3 = leitor.nextDouble();

        if ( (nota1 + nota2 + nota3) >= 70) {
            System.out.println("passou");
        } else {
            System.out.println("sifudeukkkkkkkk");
        }
        /* 
        System.out.println("Digite o segundo operando");
        segundoOperando = leitor.nextDouble();
        */

        //processamento
       //double resultado = primeiroOperando + segundoOperando;

       //saida
       //System.out.println(resultado);
    }
}