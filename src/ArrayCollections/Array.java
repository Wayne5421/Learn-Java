package ArrayCollections;

public class Array {

    public static void main(String[] args) {

        int [] numeros = {10, 20, 30, 40, 50};

        System.out.println(numeros[1]);

        System.out.println();


        int [] valores = new int[5]; // array com tamanho 5

        valores[0] = 10;
        valores[1] = 20;
        valores[2] = 30;
        valores[3] = 50;
        valores[4] = 70;


        for (int i = 0; i < valores.length; i++){
            System.out.println(i);
        }




    }
}
