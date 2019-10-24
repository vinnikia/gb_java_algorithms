package lesson4;

public class DoubleLinkedListImpl extends LinkedList {

    public Link last;

    public DoubleLinkedListImpl() {
        this.first = null;
        this.last = null;
    }

    @Override
    public void insertFirst(String name, int age) {
        Link newLink = new Link(name, age);
        if (this.isEmpty()) {
            last = newLink;
        }
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(String name, int age) {
        Link newLink = new Link(name, age);
        if (this.isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
        }
        last = newLink;
    }

    @Override
    public Link delete() {
        Link temp = first;
        if (first.next == null) {
            last = null;
        }
        first = first.next;
        return temp;
    }

    public boolean isFind(String name) {
        boolean result = false;
        Link current = first;
        while (current.name != null) {
            if (current.name == name) {
                result = true;
                break;
            } else if (current.next != null) {
                current = current.next;
            } else {
                break;
            }
        }
        return result;
    }
}