package lesson3.deque;

public class DequeImpl implements Deque {

    private int front;
    private int rear;

    private int[] deque;
    private int items;
    private int maxSize;

    public DequeImpl(int size) {
        this.deque = new int[size];
        this.front = -1;
        this.rear = -1;
        this.items = 0;
        this.maxSize = size;
    }

    public int[] getDequeArray() {
        return deque;
    }

    @Override
    public boolean isEmpty() {
        return (items == 0);
    }

    @Override
    public boolean isFull() {
        return (items == maxSize);
    }

    @Override
    public int size() {
        return items;
    }

    @Override
    public void insertLeft(int i) throws DequeException {
        if (isFull()) {
            throw new DequeException("Очередь заполнена");
        }
        if (front <= 0) {
            front = maxSize;
        }
        deque[--front] = i;
        items++;
    }

    @Override
    public void insertRight(int i) throws DequeException {
        if (isFull()) {
            throw new DequeException("Очередь заполнена");
        }
        deque[++rear] = i;
        if (rear == maxSize) {
            rear = 0;
        }
        items++;
    }


    @Override
    public int removeRight() throws DequeException {
        if (isEmpty()) {
            throw new DequeException("Очередь пуста");
        }

        if (rear == -1) { // initial value
            rear = maxSize - 1;
        }
        int i = deque[rear--];
        items--;
        return i;
    }

    @Override
    public int removeLeft() throws DequeException {
        if (isEmpty()) {
            throw new DequeException("Очередь пуста");
        }
        int i = deque[front++];
        if (front == maxSize) {
            front = 0;
        }
        items--;
        return i;
    }

    @Override
    public int peekLeft() throws DequeException {
        if (isEmpty()) {
            throw new DequeException("Очередь пуста");
        }
        return deque[front];
    }

    @Override
    public int peekRight() throws DequeException {
        if (isEmpty()) {
            throw new DequeException("Очередь пуста");
        }
        if (rear == -1) {
            rear = maxSize - 1;
        }
        return deque[rear];
    }
}
