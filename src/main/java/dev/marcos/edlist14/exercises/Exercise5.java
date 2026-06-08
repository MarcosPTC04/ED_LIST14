package java.dev.marcos.edlist14.exercises;

import java.dev.marcos.edlist14.core.LinkedQueue;

public class Exercise5 {

    public static void main(String[] args) {

        LinkedQueue<Integer> queue = new LinkedQueue<>();

        queue.push(10);
        queue.push(20);
        queue.push(30);

        System.out.println("Frente: " + queue.peek());
        System.out.println("Final: " + queue.back());

        queue.clear();

        System.out.println("Vazia? " + queue.isEmpty());
    }
}
