package lesson3.deque;

public interface Deque {

    boolean isEmpty();

    boolean isFull();

    int size();

    void insertLeft(int i) throws DequeException;

    void insertRight(int i) throws DequeException;

    int removeLeft() throws DequeException;

    int removeRight() throws DequeException;

    int peekLeft() throws DequeException;

    int peekRight() throws DequeException;

}
