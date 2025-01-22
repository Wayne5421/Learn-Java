package Streams.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OrdenarElementosLista {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        List<Integer> numerosOrdenados = numeros.stream()
                .sorted((a, b) -> a - b)
                .collect(Collectors.toList());


        System.out.println(numerosOrdenados);

    }



}
