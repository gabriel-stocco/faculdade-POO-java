import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o valor do seu salário por hora?");
        float sal = scanner.nextFloat();

        System.out.println("Quantas horas foram trabalhadas no mês?");
        float horas = scanner.nextFloat();

        System.out.println("O salário final no mês é de R$" + (sal * horas));
    }
}
