package Lesson4;

public class LinkIterator {
    public Link current;
    public Link prev;
    public LinkedList list;

    public LinkIterator(LinkedList list) {
        this.list = list;
        reset();
    }

    private void reset() {
        current = list.getFirst();
        prev = null;
    }

    public void nextLink() {
        prev = current;
        current = current.next;
    }

    /**
     * @return - true, если дошел до конца
     */
    public boolean atEnd() {
        return (current.next == null);
    }

    public void display() {
        Link current = list.getFirst();
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
    }

    public void insertBefore (String name, int age) {
        Link newLink = new Link(name, age);
        if (current == list.getFirst()) {
            newLink.next = list.first;
            list.first = newLink;
        }
        else {
            newLink.next = current;
            prev.next = newLink;
    // час возился пока не додумался что при вставке надо обновить связи не только со следующими элементами, но и добавить у текущего элемента связь с новым предыдущим -_-
            prev = newLink;
        }
    }

    public void insertAfter (String name, int age) {
        Link newLink = new Link(name, age);
        newLink.next = current.next;
        current.next = newLink;
    }


    public Link deleteCurrent() {
        Link temp = prev;
        if (current == list.getFirst())
            list.first = list.first.next;
        else {
            prev.next = current.next;
            current = current.next;
        }
        return temp;
    }

    public Link getCurrent() {
        return current;
    }

    public Link getPrev() {
        if (current == list.getFirst())
            return null;
        else
        return prev;
    }


}
