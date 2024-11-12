package ArrayCollections;

public class Matriz {

    public static void main(String[] args) {


        int[][] matriz;

        matriz = new int[3][3];

        int [][] otherMatriz = {
                {1, 2, 3},
                {4, 5 ,6},
                {7, 8, 9}
        };

        System.out.println(otherMatriz[1][2]);

        //Mostrar valores da matriz

        for (int i = 0; i < otherMatriz.length; i++){
            for(int j = 0; j < otherMatriz.length; j++){
                System.out.println(otherMatriz[i][j] + "");
            }
        }




    }


}
