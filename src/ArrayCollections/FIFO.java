package ArrayCollections;

//Para o FIFO utiliza-se QUEUE (fila)

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class FIFO {
    public static void main(String[] args) {


        Queue<Integer> fila = new LinkedList<>();

        fila.add(1);
        fila.add(2);
        fila.add(3);

        System.out.println("Primeiro elemento (peek): " + fila.peek());
        System.out.println("Elemento removido (poll): " + fila.poll());
        System.out.println("Novo primeiro elemento: " + fila.peek());
        System.out.println("Fila: " + fila);




        //Remover em ordem crescente
        //é possível com o PriorityQueue que usa uma base de prioridade
        //ao invés de FIFO

        Queue<Integer> filaPrioridade = new PriorityQueue<>();

        filaPrioridade.add(45);
        filaPrioridade.add(30);
        filaPrioridade.add(1);
        filaPrioridade.add(100);
        filaPrioridade.add(90);

        while ( !filaPrioridade.isEmpty() ){

            System.out.println("Elemento removido: " + filaPrioridade.poll());


        };















    }




















}
