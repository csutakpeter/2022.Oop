package lab9_1;

public class CircularQueue implements IQueue {
    private int CAPACITY;
    private Object[] items;
    private int front = -1;
    private int rear = -1;

    //constructor
    public CircularQueue(int CAPACITY) {
        this.CAPACITY = CAPACITY;
        items = new Object[CAPACITY];
    }

    //methods
    @Override
    public boolean isFull() {
        if (front == 0 && rear == CAPACITY - 1) {
            return true;
        }
        if (front == rear + 1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        if (front == -1)
            return true;
        else
            return false;
    }

    @Override
    public void enQueue(Object newobj) {
        if(isFull()){
            System.out.println("Queue is full");
        }
        else{
            if (front == -1)
                front = 0;
            rear = (rear + 1) % CAPACITY;
            items[rear] = newobj;
            System.out.println("Inserted " + newobj);
        }
    }

    @Override
    public Object deQueue(){
        Object element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        } else {
            element = items[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } /* Q has only one element, so we reset the queue after deleting it. */
            else {
                front = (front + 1) % CAPACITY;
            }
            return (element);
        }
    }

    @Override
    public void printQueue(){
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("Front -> " + front);
            System.out.print("Items -> ");
            for (i = front; i != rear; i = (i + 1) % CAPACITY)
                System.out.print(items[i] + " ");
            System.out.println(items[i]);
            System.out.println("Rear -> " + rear);
        }
    }

    @Override
    public boolean equals(Object compObj) {
        if (this == compObj) return true;
        if (getClass() != compObj.getClass()) return false;
        CircularQueue that = (CircularQueue) compObj;
        if(this.items.length!=that.items.length) return false;
        for(int i=this.rear, j=that.rear;
            i<this.front && j< that.front;
            i++,j++){
            if(!this.items[i%this.CAPACITY].equals(that.items[j% that.CAPACITY]))return false;
        }
        return true;
    }
}
