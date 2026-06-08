package java.dev.marcos.edlist14.exercises;

import java.dev.marcos.edlist14.core.StaticQueue;

public class Exercise2 {

    public static void main(String[] args) {

        StaticQueue<Integer> queue = new StaticQueue<>(5);

        queue.push(10);
        queue.push(20);
        queue.push(30);

        System.out.println(queue.pop());
        System.out.println(queue.pop());
        System.out.println(queue.pop());
    }
}
