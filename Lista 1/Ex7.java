import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit:");
        float f = scanner.nextFloat();

        float c = (5 * ( f - 32 ) / 9);

        System.out.println("A temperatura em Celsius é: " + String.format("%.2f", c) + "Cº");
    }
}
