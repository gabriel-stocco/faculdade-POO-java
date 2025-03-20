import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Metodos metodos = new Metodos();

        Metodos.a("gabriel");
        Metodos.b(5);
        Metodos.c();
        Metodos.d(2);

        Metodos.e(Arrays.asList("Maria", "Gabriel", "João", "Carlos"));
        System.out.println(metodos.f(Arrays.asList(5,6,9,12,2,5,15,23,65,79,156,56,9,51,65,49,15,56,49,15,56,591,86)));

        int[] numeros = {5,9,3,8,1,6,8};
        System.out.println(Metodos.g(numeros));

        Double[] array = {5.6, 6.8, 6.7, 2.9};

        System.out.printf("%.2f%n", Metodos.h(Arrays.asList(array)));

        System.out.println(Metodos.i(10, 10));

        System.out.println(Metodos.j("452.508.178/31"));
    }

}
