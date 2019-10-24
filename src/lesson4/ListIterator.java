package lesson4;

public interface ListIterator {

    void reset();

    void nextLink();

    boolean atEnd();

    Link getCurrent();

    void insertAfter(String name, int age);

    void insertBefore(String name, int age);

    boolean hasPrev();

    boolean hasNext();

    Link deleteCurrent();
}
