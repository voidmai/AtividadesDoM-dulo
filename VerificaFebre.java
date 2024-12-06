import java.util.Scanner;

public class VerificaFebre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura marcada pelo termômetro: ");
        double temperatura = scanner.nextDouble();

        if (temperatura > 37) {
            System.out.println("Você está com febre.");
        } else {
            System.out.println("Sua temperatura está normal.");
        }

        scanner.close();
    }
}

