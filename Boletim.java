import java.util.Scanner;

public class Boletim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 6.0){
            System.out.println("aprovado muleke " + media);
            
        }
        else{
            System.out.println("reprovado amigao " + media);

        }

        scanner.close();

    }
}
