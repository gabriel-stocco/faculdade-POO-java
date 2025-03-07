import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a altura em metros:");
        float h = scanner.nextFloat();

        double peso = 72.7 * h - 58;

        System.out.println("O peso ideal de alguém com " + h + " metros de altura é " + String.format("%.2f", peso));
    }
}
