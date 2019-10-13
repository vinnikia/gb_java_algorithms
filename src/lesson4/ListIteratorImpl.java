package lesson4;


public class ListIteratorImpl implements ListIterator {

    private Link current;

    private Link prev;
    private LinkedListImpl list;

    public ListIteratorImpl(LinkedListImpl list) {
        this.list = list;
        reset();
    }

    @Override
    public void reset() {
        current = list.getFirst();
        prev = null;
    }

    @Override
    public void nextLink() {
        prev = current;
        current = current.next;
    }

    @Override
    public boolean atEnd() {
        return (current.next == null);
    }

    @Override
    public Link getCurrent() {
        return current;
    }

    @Override
    public void insertAfter(String name, int age) {
        Link link = new Link(name, age);
        if (list.isEmpty()) {
            list.setFirst(link);
            current = link;
        } else {
            link.next = current.next;
            current.next = link;
            nextLink();
        }
    }

    @Override
    public void insertBefore(String name, int age) {
        Link link = new Link(name, age);
        if (!hasPrev()) {
            link.next = list.getFirst();
            list.setFirst(link);
            reset();
        } else {
            link.next = prev.next;
            prev.next = current = link;
        }
    }


    @Override
    public boolean hasPrev() {
        return prev != null;
    }

    @Override
    public boolean hasNext() {
        return current.next != null;
    }

    @Override
    public Link deleteCurrent() {
        Link deleted = current;
        if(hasNext()) {
            current = current.next;
            if(hasPrev()) {
                prev.next = current;
            } else {
                list.setFirst(current);
            }
        } else {
            if(hasPrev()) {
                prev.next = null;
            } else {
                list.setFirst(null);
            }
            reset();
        }
        return deleted;
    }
}
