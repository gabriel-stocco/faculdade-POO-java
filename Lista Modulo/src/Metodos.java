import java.util.ArrayList;
import java.util.List;

public class Metodos {

    public static void a(String x){
        String[] letras = x.split("");
        for (String letra : letras){
        System.out.println(letra);
        }
    }

    public static void b(int n){

        System.out.println(n);
        if (n > 0 && n < 10){
            for (int i = 0; i <= 10; i++){
                System.out.println(n + " * " + i + " = " + (n * i));
            }
        } else {
            System.out.println("Valor inválido");
        }
    }

    public static void c(){
        for (int i = 1; i <= 5; i++){
            int n = (int) (Math.random() * 101);
            System.out.println(n);
        }

    }

    public static void d(int n){
         String dia = switch (n) {
             case 1 -> "Domingo";
             case 2 -> "Segunda";
             case 3 -> "Terça";
             case 4 -> "Quarta";
             case 5 -> "Quinta";
             case 6 -> "Sexta";
             case 7 -> "Sábado";
             default -> "Inválido";
         };

        System.out.println("O dia da semana referente ao número é: " + dia);
    }

    public static void e(List<String> nomes){
        for (String nome : nomes){
            System.out.println(nome);
        }
    }

    public static int f(List<Integer> numeros){
        int pares = 0;
        for (int numero: numeros) {
            if (numero % 2 == 0){
                pares +=1;
            }
        }
    return pares;
    }

    public static int g(int[] numeros){
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        return soma;
    }

    public static double h(List<Double> notas){
        double soma = 0;
        for (double nota: notas){
            soma += nota ;
        }

        return soma/notas.toArray().length;
    }
    public static List<Integer> i(int n1, int n2){
        List<Integer> lista = new ArrayList<>();
        
        for (int i = 0; i <= n1; i++){
            lista.add((int) (Math.random() * n2 + 1));
        }
        return lista;
    }

    public static String j(String cpf){
        String cpfRegex = "\\d{3}\\.\\d{3}\\.\\d{3}/\\d{2}";

        if(cpf.matches(cpfRegex)){
          return "O CPF: "+ cpf + " É válido";
        }
        else {
            return "O CPF: " + cpf + " NÃO é válido";
        }
    }
}
