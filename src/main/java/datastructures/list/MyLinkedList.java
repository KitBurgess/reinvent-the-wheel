package datastructures.list;

public class MyLinkedList<E> implements MyList<E> {
    // head -> ... -> tail

    private Node head;
    private Node tail;

    private class Node {
        private E data;
        private Node nextNode;

        private Node(E data, Node nextNode) {
            this.data = data;
            this.nextNode = nextNode;
        }
    }

    public MyLinkedList(E startData) {
        this.head = new Node(startData, null);
        this.tail = head;
    }

    public MyLinkedList() {
        this.head = new Node(null, null);
        this.tail = head;
    }

    public void append(E entry) {
        Node newTail = new Node(entry, null);
        tail.nextNode = newTail;
        tail = newTail;
    }

    public void prepend(E entry) {
    }

    public int size() {
        return 10;
    }

    public boolean isempty() { return false;
    }

    public E getHead() {
        return head.data;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder(size());
        output.append("[" + head.data);

        Node localNode = head;
        while (localNode.nextNode != null) {
            output.append(", ");
            localNode = localNode.nextNode;
            output.append(localNode.data);
        }

        output.append("]");

        return output.toString();
    }

    public E getTail() {
        return null;
    }

    public E getElement(int index) {
        return null;
    }
}
