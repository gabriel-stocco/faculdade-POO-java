import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor em Celsius:");
        float c = scanner.nextFloat();

        float f = (c * 9 / 5 + 32);

        System.out.println("O valor em Fahrenheit é : " + String.format("%.2f", f) + " Fº");

    }
}
