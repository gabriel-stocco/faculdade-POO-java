import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do IPTU");
        float n = scanner.nextFloat();

        double desconto = n * 0.05;

        System.out.println("O valor original do IPTU é R$" + n + " o valor do desconto de 5% é de R$"
        + String.format("%.2f", desconto) + " e o valor final é de R$" + String.format("%.2f",n - desconto));
    }
}
