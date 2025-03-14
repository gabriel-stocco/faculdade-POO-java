import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome, sexo;
        int idade;
        double salario;

        while (true){

            System.out.println("Digite um nome com mais de 5 caracteres:");
            nome = scanner.next();
            if (nome.length() > 5){
                break;
            }else {
                System.out.println("Nome inválido");
            }
        }

        while (true){
            System.out.println("Digite a idade (Entre 0 e 150): ");
            idade = scanner.nextInt();

            if (idade > 0 && idade < 150) {
                break;
            } else {
                System.out.println("Idade inválida");
            }
        }

        while (true){
            System.out.println("Digite o salário (maior que 0):");
            salario = scanner.nextFloat();


            if (salario > 0){
                break;
            } else {
                System.out.println("Salário inválido");
            }
        }

        while (true) {
            System.out.println("Digite o sexo (Masculino ou feminino)");
            sexo = scanner.next();

            if (sexo.equals("Masculino") || sexo.equals("Feminino")){
                break;
            }

            System.out.println("Sexo inválido");
        }

        System.out.println("Os valores fornecidos foram os seguintes:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: R$" + salario);
        System.out.println("Sexo: " + sexo);
    }
}
