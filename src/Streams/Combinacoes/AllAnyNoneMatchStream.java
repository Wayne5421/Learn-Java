package Streams.Combinacoes;

import java.util.Arrays;
import java.util.List;

public class AllAnyNoneMatchStream {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("Conferindo se os numeros da lista são pares:");
        boolean saoPares = numeros.stream().allMatch(num -> num % 2 == 0);
        System.out.println(saoPares);
        System.out.println();


        System.out.println("Conferindo se algum numero é maior que 5:");
        boolean algumMaiorQueCinco = numeros.stream().anyMatch(num -> num > 5);
        System.out.println(algumMaiorQueCinco);
        System.out.println();


        System.out.println("Vendo se nenhum numero é impar:");
        boolean algumNumeroImpar = numeros.stream().noneMatch(num -> num % 2 != 0);
        System.out.println(algumNumeroImpar);





    }
}
