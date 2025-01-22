package Streams.Streams;

import java.util.Arrays;
import java.util.List;

// Soma todos os pares


public class ParallelStream {
    public static void main(String[] args) {


        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        long soma = numeros.parallelStream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n)
                .sum();

        System.out.println(soma);



    }
}
