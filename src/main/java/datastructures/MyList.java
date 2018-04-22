package datastructures;

public class MyList<E> implements MylistImpl<E> {

    private int DEFAULT_LIST_SIZE = 100;
    private E[] array;


    @SuppressWarnings("unchecked")
    public MyList(int size) {
        array = (E[]) new Object[size];
    }

    public MyList() {
        new MyList<>(DEFAULT_LIST_SIZE);
    }

    E get(int i) {
        return array[i];
    }

    @Override
    public void append(E entry) {

    }

    @Override
    public void prepend(E entry) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isempty() {
        return false;
    }

    @Override
    public E getHead() {
        return array[0];
    }

    @Override
    public E getElement(int index) {
        return null;
    }


}
