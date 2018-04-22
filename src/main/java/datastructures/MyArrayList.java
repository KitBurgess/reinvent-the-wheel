package datastructures;

import java.util.Arrays;

public class MyArrayList<E> implements MylistImpl<E> {

    private E[] array;
    private int currentIndex = 0;
    private int DEFAULT_LIST_SIZE = 5;



//    @SuppressWarnings("unchecked")
//    public MyArrayList(int size) {
//
//    }

    public MyArrayList() {
        // FIXME: currently only works with string
        array = (E[]) new String[DEFAULT_LIST_SIZE];
    }

    public E getElement(int i) {
        return array[i];
    }

    public void append(E entry) {
        array[currentIndex] = entry;
        currentIndex += 1;
    }

    public void prepend(E entry) {

    }

    public int size() {
        return currentIndex;
    }

    public boolean isempty() {
        if (array == null)
            return true;

        for (E element : array) {
            if (element != null)
                return false;
        }
        return true;
    }

    public E getHead() {
        return array[0];
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
