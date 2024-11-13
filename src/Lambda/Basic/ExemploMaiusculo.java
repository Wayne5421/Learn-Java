package Lambda.Basic;

public class ExemploMaiusculo {
    public static void main(String[] args) {

        Upper upper = (String a) -> a.toUpperCase();
        System.out.println(upper.Maiusculo("Caio"));


    }
}
