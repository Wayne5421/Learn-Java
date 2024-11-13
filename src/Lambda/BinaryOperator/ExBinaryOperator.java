package Lambda.BinaryOperator;
import java.util.function.BinaryOperator;

//Recebe 2 valores iguais e retorna os mesmos valores ou
// 2 valores do mesmo tipo
public class ExBinaryOperator {

    public static void main(String[] args) {

        BinaryOperator<Integer> somar = (a, b) -> a + b;

        int result = somar.apply(10, 15);

        System.out.println(result);



    }

}
