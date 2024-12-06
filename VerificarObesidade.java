import java.util.Scanner;

public class VerificarObesidade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso (em kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        if (imc > 30) {
            System.out.println("Você está obeso.");
        } else {
            System.out.println("Seu IMC está dentro do normal.");
        }

        scanner.close();
    }
}


