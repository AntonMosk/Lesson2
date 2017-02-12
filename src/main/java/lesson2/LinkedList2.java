/*
package lesson2;

*/
/**
 * Created by User on 11.02.2017.
 *//*

public class LinkedList {
    private Node first;
    private Node tail;
    private int size = 0;

    public Node getFirst(){
        return first;
    }

    public void add(int i) {
        if (tail == null) {
            first = new Node(i);
            tail = first;
        } else {
            tail.next = new Node(i);
            Node previous = tail;
            tail = tail.next;
            tail.previous = previous;
        }
        first = new Node(i);
    }

    public void remove(Node node) {
        if (node != null) {
            if (node == first) {
                first = first.next;
            } else {
                Node previous = node.previous;
                previous.next = node.next;
            }
        }
    }

    public int size() {
        return size;
    }

    public static class Node {
        private int value;
        private Node next;
        private Node previous;

        public Node getNext() {
            return next;
        }

        public Node getPrevious() {
            return previous;
        }

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}
*/
