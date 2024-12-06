import java.util.Scanner;

public class Viagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância que será percorrida em km: ");
        double distancia = scanner.nextDouble();

        System.out.print("Digite o preço do litro da gasolina: ");
        double precoGasolina = scanner.nextDouble();

        double consumo = distancia / 12;
        double custo = consumo * precoGasolina;

        System.out.printf("Você precisará de %.2f litros de gasolina.\n", consumo);
        System.out.printf("O custo será R$ %.2f.", custo);

        scanner.close();
    }
}
