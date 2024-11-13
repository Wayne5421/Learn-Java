package Lambda.Supplier;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class ListSupplier {
    public static void main(String[] args) {


        List<String> linguagens = List.of("Java", "Python", "C++", "C#");


        Supplier<String> palavraAleatoria = () -> linguagens.get(new Random().nextInt(linguagens.size()));


        System.out.println("Palavra aleatoria: " + palavraAleatoria.get());
        System.out.println("Palavra aleatoria: " + palavraAleatoria.get());
        System.out.println("Palavra aleatoria: " + palavraAleatoria.get());


    }
}
