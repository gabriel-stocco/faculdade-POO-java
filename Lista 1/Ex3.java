import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de metros para converter em Cm: ");
        float n1 = scanner.nextFloat();

        System.out.println("O valor da conversão é: " + (n1 * 100) + "Cm");
    }
}
