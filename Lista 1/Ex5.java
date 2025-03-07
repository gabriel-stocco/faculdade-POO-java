import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o lado 1 do quadrado: ");
        float l1 = scanner.nextFloat();

        System.out.println("Digite o lado 2 do quadrado: ");
        float l2 = scanner.nextFloat();

        System.out.println("O dobro da área do quadrado é: " + (l1 * l2 * 2));

    }
}
