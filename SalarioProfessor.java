import java.util.Scanner;

public class SalarioProfessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da hora aula: ");
        double valorHora = scanner.nextDouble();

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.print("Digite o percentual de desconto do INSS: ");
        double descontoINSS = scanner.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;
        double salarioLiquido = salarioBruto * (1 - descontoINSS / 100);

        System.out.printf("O salário líquido é: R$ %.2f%n", salarioLiquido);

        scanner.close();
    }
}


