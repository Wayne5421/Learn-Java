package Generics;

import java.util.Arrays;
import java.util.List;

public class ListGenericsTeste {
    public static void main(String[] args) {


        List<String> langs = Arrays.asList("Java", "JS", "Python", "C#");

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7);


        String ultimaString = ListaGenerics.getUltimo(langs);
        Integer ultimoNumero = ListaGenerics.getUltimo(numeros);

        System.out.println("Ultima string da lista: " + ultimaString);
        System.out.println("Ultimo numero da lista: " + ultimoNumero);
    }

}
