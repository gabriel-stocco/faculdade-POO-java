import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o raio do círculo: ");
        float r = scanner.nextFloat();

        System.out.println("A área do circulo de raio " + r + "cm é: " + String.format("%.3f",3.14 * r * r) + "cm");
    }
}
