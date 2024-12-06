import java.util.Scanner;

public class CarteiraMotorista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Você pode tirar carteira de motorista.");
        } else {
            System.out.println("Você não pode tirar carteira de motorista.");
        }

        scanner.close();
    }
}
