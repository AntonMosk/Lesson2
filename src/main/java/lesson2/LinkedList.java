package lesson2;

/**
 * Created by User on 11.02.2017.
 */
public class LinkedList {
    private Node first;
    private Node tail;
    private int size = 0;

    public Node getFirst() {
        return first;
    }

    public Node getTail() {
        return tail;
    }

    public int getSize() {
        return size;
    }

    public String toString() {
        String s = "";
        Node node = first;
        while (node != null) {
            s = s + " " + node.getValue();
            node = node.getNext();
        }
        s += " end.";
        return s;
    }

    public void add(int value) {
        Node node = new Node(value);
        node.prev = tail;
        if (size == 0) {
            first = node;
        } else {
            tail.next = node;
        }
        node.next = null;
        tail = node;
        size++;
    }

    public void addBegin(int value) {
        Node node = new Node(value);
        node.next = first;
        if (size == 0) {
            tail = node;
        } else {
            first.prev = node;
        }
        node.prev = null;
        first = node;
        size++;
    }

    public void remove(Node node) {
        if (node != null) {
            if (node == first) {
                first = node.next;
                if (node == tail) {
                    tail = null;
                } else {
                    first.prev = node.prev;
                }
            } else {
                if (node == tail) {
                    tail = node.prev;
                    tail.next = null;
                } else {
                    node.prev.next = node.next;
                    node.next.prev = node.prev;
                }
            }
            size--;
        }
    }

    public void reverseLinkedList() {
        Node node = first;
        Node temp = first;

        while (node != null) {
            temp = node.next;
            node.next = node.prev;
            node.prev = temp;
            node = node.prev;
        }
        node = tail;
        tail = first;
        first = node;
    }

    public class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node getNext() {
            if (this == null) throw new NullPointerException();
             else return next;
        }

        public Node getPrev() {
            if (this == null) throw new NullPointerException();
            else return prev;
        }

        public int getValue() {
            if (this == null) throw new NullPointerException();
            else return value;
        }
    }
}
