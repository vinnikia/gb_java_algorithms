package lesson3.stack;

public interface Stack {

    boolean isEmpty();

    boolean isFull();

    void push(char element);

    char pop();

    int peek();

}
