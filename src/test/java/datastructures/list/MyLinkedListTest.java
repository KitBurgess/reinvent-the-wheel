package datastructures.list;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class MyLinkedListTest {
    @Test
    public void testAppend() {
        MyLinkedList<String> list = new MyLinkedList<>("hello");
        list.append("world");
        list.append("mate");
        assertEquals(list.toString(), "[hello, world, mate]");
    }

    @Test
    public void testAppendEmptyConstructor() {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.append("hello");
        list.append("world");
        assertEquals(list.toString(), "[hello, world]");
    }

    @Test
    public void testPrepend() {
    }

    @Test
    public void testSize() {
    }

    @Test
    public void testIsempty() {
    }

    @Test
    public void testGetHead() {
    }

    @Test
    public void testGetElement() {
    }

    @Test
    public void testToString() {

    }
}