package lesson4;

abstract public class LinkedList {

    protected Link first;

    abstract public void insertFirst(String name, int age);

    abstract public Link delete();

    public Link getFirst() {
        return first;
    }
    public void setFirst(Link first) {
        this.first = first;
    }

    public Link delete(String name) {
        Link current = first;
        Link prev = first;
        while (current.name != name) {
            if (current.name == null) {
                return null;
            } else {
                prev = current;
                current = current.next;
            }
        }
        if(current == first)
            first = first.next;
        else
            prev.next = current.next;
        return current;
    }

    public Link find(String name) {
        Link current = first;
        while (current.name != name) {
            if (current.name == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void display() {
        Link current = first;
        while (current != null) {
            current.print();
            current = current.next;
        }
    }
}
