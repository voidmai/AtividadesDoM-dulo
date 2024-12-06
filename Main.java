import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
		System.out.println("Digite quantas horas você trabalha: ");
		int hora = scan.nextInt();
        System.out.println("Seu salário é: " + calcSalario(hora));   	
	    scan.close();
	}
    
    static int calcSalario(int hora){
        return hora * 20;
    }
}
