package Lambda.Basic;

public class ExemploSoma {

    public static void main(String[] args) {

        Soma soma = (a, b) -> a + b;

        System.out.println(soma.operacao(3, 8));


    }


}
