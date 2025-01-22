package Streams.Streams;

import java.util.Arrays;
import java.util.List;

public class SomaLista {
    public static void main(String[] args) {


        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        int soma = numeros.stream()
                .reduce(0, Integer::sum); //inicia em 0 e seleciona soma

        System.out.println(soma);



    }
}
