import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        float n1 = scanner.nextFloat();

        System.out.println("Digite o segundo número: ");
        float n2 = scanner.nextFloat();

        System.out.println("A soma é = " + (n1 + n2));

        System.out.println("A subtração é = " + (n1 - n2));

        System.out.println("A multiplicação é = " + (n1 * n2));

        System.out.println("A divisão é = " + (n1 / n2));
    }
}
