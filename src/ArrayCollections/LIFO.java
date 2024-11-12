package ArrayCollections;

import java.util.Stack;

public class LIFO {
    public static void main(String[] args) {


        Stack<Integer> pilha = new Stack<>();

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);

        while ( !pilha.isEmpty() ){
            System.out.println("Removendo de maneira descrescente: " + pilha.pop());
        }





    }
}
