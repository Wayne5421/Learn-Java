package Streams.Streams;

import java.util.Arrays;
import java.util.List;

public class ContarNumerosList {

    public static void main(String[] args) {


        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        long quantidadeNumeros = numeros.stream()
                .filter(num -> num > 5)
                .count();

        System.out.println(quantidadeNumeros + " Numeros são maiores que 5");

    }



}
