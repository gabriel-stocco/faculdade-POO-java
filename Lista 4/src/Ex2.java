import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o login: ");
            String login = scanner.next();

            System.out.println("Digite a senha: ");
            String senha = scanner.next();


            if (!login.equals(senha)) {

                break;
            }

            System.out.println("O login e a senha não podem ser iguas, tente denovo!");
        }
        System.out.println("Cadastro efeituado");



    }
}
