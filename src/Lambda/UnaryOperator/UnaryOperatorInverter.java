package Lambda.UnaryOperator;

import java.util.function.UnaryOperator;

public class UnaryOperatorInverter {

    public static void main(String[] args) {

        UnaryOperator<String> inverter = frase -> new StringBuilder(frase).reverse().toString();

        String resultado = inverter.apply("Frase Invertida");
        System.out.println(resultado);
    }



}
