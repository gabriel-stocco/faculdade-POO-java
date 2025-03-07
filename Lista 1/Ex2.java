import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        float n1 = scanner.nextFloat();

        System.out.println("Digite a nota 2: ");
        float n2 = scanner.nextFloat();

        System.out.println("Digite a nota 3");
        float n3 = scanner.nextFloat();

        System.out.println("A média das 3 notas é: " + ((n1 + n2 + n3)/3));
    }
}
