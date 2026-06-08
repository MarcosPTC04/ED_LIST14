package java.dev.marcos.edlist14.core;

public interface Queue<T> {

    void push(T value);

    T pop();

    T peek();

    T back();

    int size();

    boolean isEmpty();

    void clear();
}