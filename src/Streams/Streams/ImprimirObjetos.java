package Streams.Streams;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimirObjetos {
    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList(
                "Caio", "Gabriel", "Maria", "Rafael", "Julia"
        );

        System.out.println("Usando for each:");

        for (String nome : aprovados) {
            System.out.println(nome);

        }



        System.out.println("\nUsando o iterator:");
        Iterator<String> iterator = aprovados.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }





        System.out.println("\nUtilizando Stream:");

        Stream<String> stream = aprovados.stream();

        stream.forEach(System.out::println); //Laço interno


    }
}
