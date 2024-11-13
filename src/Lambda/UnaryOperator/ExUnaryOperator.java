package Lambda.UnaryOperator;
import java.util.function.UnaryOperator;


//Recebe um valor e retorna um valor igual ou do mesmo tipo
public class ExUnaryOperator {

    public static void main(String[] args) {


        UnaryOperator<Integer> duplicar = x -> x *2;


        int resultado = duplicar.apply(4);
        System.out.println(resultado);


    }
}
