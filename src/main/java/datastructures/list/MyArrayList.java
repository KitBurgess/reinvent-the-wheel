package datastructures.list;

import java.util.Arrays;

public class MyArrayList<E> implements MyList<E> {

    private E[] array;
    private int nextIndex = 0;
    private int DEFAULT_CAPACITY = 5;

    @SuppressWarnings("unchecked")
    public MyArrayList(int size) {
        this.array = (E[]) new Object[size];
    }

    @SuppressWarnings("unchecked")
    public MyArrayList() {
        this.array = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public E getElement(int i) {
        return array[i];
    }

    public void append(E entry) {
        array[nextIndex] = entry;
        nextIndex += 1;
    }

    public void prepend(E entry) {
        for (int i = nextIndex; i > 0 ; i--) {
            array[i] = array[i - 1];
        }
        array[0] = entry;
        nextIndex +=1;
    }

    public int size() {
        return nextIndex;
    }

    public boolean isempty() { return size() == 0;}

    public E getHead() {
        return getElement(0);
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
