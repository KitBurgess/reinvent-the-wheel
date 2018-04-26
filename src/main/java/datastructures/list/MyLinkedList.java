package datastructures.list;

public class MyLinkedList<E> implements MyList<E> {
    // head -> ... -> tail

    private Node head;
    private Node tail;

    public MyLinkedList(E startData) {
        this.head = new Node(startData, null);
        this.tail = head;
    }

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void append(E entry) {
        Node newTail = new Node(entry, null);
        if (tail != null) {
            tail.setNextNode(newTail);
            setTail(newTail);
        } else {
            setTail(newTail);
        }
    }

    private void setTail(Node newTail) {
        this.tail = newTail;
    }

    public void prepend(E entry) {
    }

    public int size() {
        return 10;
    }

    public boolean isempty() {
        return false;
    }

    public E getHead() {
        return head.data;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder(size());
        if (head == null || head.data == null)
            return "[]";

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

    private class Node {
        private E data;
        private Node nextNode;

        private Node(E data, Node nextNode) {
            this.data = data;
            this.nextNode = nextNode;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public void setNextNode(Node node) {
            this.nextNode = node;
        }

        public E getData() {
            return data;
        }

        public void setData(E newData) {
            data = newData;
        }

    }
}

