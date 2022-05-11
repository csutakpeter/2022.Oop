package lab9_1;

public interface IQueue{
    void enQueue(Object newobj);
    Object deQueue();
    boolean isFull();
    boolean isEmpty();
    void printQueue();
}
