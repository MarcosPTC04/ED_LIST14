package java.dev.marcos.edlist14.exercises;

import java.dev.marcos.edlist14.core.StaticQueue;

public class Exercise1 {

    public static void main(String[] args) {

        StaticQueue<Integer> queue = new StaticQueue<>(5);

        queue.push(10);

        System.out.println("Primeiro elemento: " + queue.peek());
        System.out.println("Tamanho: " + queue.size());
    }
}
