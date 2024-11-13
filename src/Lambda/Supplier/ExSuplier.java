package Lambda.Supplier;

//Supplier é uma interface funcional que não recebe entrada
//Mas retorna ou gera algum valor

import java.util.Random;
import java.util.function.Supplier;

public class ExSuplier {
    public static void main(String[] args) {

        Supplier<Integer> numAleatorio = () -> new Random().nextInt(1000);

        System.out.println("Numero aleatorio: " + numAleatorio.get());
        System.out.println("Numero aleatorio: " + numAleatorio.get());
        System.out.println("Numero aleatorio: " + numAleatorio.get());



    }
}
