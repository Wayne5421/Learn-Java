package Streams.Streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExStream {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);



        List<Integer> multiplicarPorQuatro = numeros.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 4)
                .collect(Collectors.toList());


        System.out.println(multiplicarPorQuatro);




    }
}
