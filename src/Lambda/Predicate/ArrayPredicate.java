package Lambda.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ArrayPredicate {

    public static void main(String[] args) {


        List<Integer> numeros = Arrays.asList(
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        );


        Predicate<Integer> isPar = numero -> numero % 2 == 0;

        for (int n = 0; n < numeros.size(); n++){
            if (isPar.test(numeros.get(n))){
                System.out.println("Numeros pares: " + numeros.get(n));
            } else{
                System.out.println("Numeros impares: " + numeros.get(n));
            }
        }


    }

}
