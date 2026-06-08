package java.dev.marcos.edlist14.core;

public class QueueNode<T> {

    private T value;
    private QueueNode<T> next;

    public QueueNode(T value) {
        this.value = value;
        this.next = null;
    }

    public T getValue() {
        return value;
    }

    public QueueNode<T> getNext() {
        return next;
    }

    public void setNext(QueueNode<T> next) {
        this.next = next;
    }
}
