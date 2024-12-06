import java.util.Scanner;

public class SomaMaior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double soma = num1 + num2;

        if (soma > 10) {
            System.out.println("A soma é: " + soma);
        }

        scanner.close();
    }
}


