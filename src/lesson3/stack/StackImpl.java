package lesson3.stack;

public class StackImpl implements Stack {

    private char[] stack;
    private int size;
    private int top;

    public StackImpl(int size) {
        this.size = size;
        this.stack = new char[size];
        this.top = -1;
    }

    @Override
    public boolean isEmpty() {
        return (top == -1);
    }

    @Override
    public boolean isFull() {
        return (top == size - 1);
    }

    @Override
    public void push(char element) {
        stack[++top] = element;
    }

    @Override
    public char pop() {
        return stack[top--];
    }

    @Override
    public int peek() {
        return stack[top];
    }
}
