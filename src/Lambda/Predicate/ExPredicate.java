package Lambda.Predicate;
import java.util.function.Predicate;


//Retorno de true ou false (bool)

public class ExPredicate {
    public static void main(String[] args) {

        Predicate<Integer> isPar = numero -> numero % 2 == 0;

        System.out.println(isPar.test(10));
        System.out.println(isPar.test(7));
        System.out.println(isPar.test(9));


    }
}
