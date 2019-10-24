package lesson4;

public class LinkedListImpl extends LinkedList {


    public LinkedListImpl() {
        this.first = null;
    }

    @Override
    public void insertFirst(String name, int age) {
        Link newLink = new Link(name, age);
        newLink.next = first;
        first = newLink;
    }

    @Override
    public Link delete() {
        Link temp = first;
        first = first.next;
        return temp;
    }
}
