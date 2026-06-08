package java.dev.marcos.edlist14.core;

public class StaticQueue<T> implements Queue<T> {

    private T[] elements;
    private int head;
    private int tail;
    private int size;

    @SuppressWarnings("unchecked")
    public StaticQueue(int capacity) {
        this.elements = (T[]) new Object[capacity];
        this.head = 0;
        this.tail = 0;
        this.size = 0;
    }

    @Override
    public void push(T value) {

    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public T back() {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {

    }
}