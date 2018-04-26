package datastructures.list;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class MyLinkedListTest {

    private MyLinkedList<String> newPopulatedList;
    private MyLinkedList<String> newEmptyList;

    @BeforeMethod
    private void createLists() {
        newPopulatedList = new MyLinkedList<>("foo");
        newEmptyList = new MyLinkedList<>();
    }

    @Test
    public void testAppend() {
        newPopulatedList.append("hello");
        newPopulatedList.append("world");
        assertEquals(newPopulatedList.toString(), "[foo, hello, world]");
    }

    @Test
    public void testAppendEmptyConstructor() {
        newEmptyList.append("hello");
        newEmptyList.append("world");
        assertEquals(newEmptyList.toString(), "[hello, world]");
    }

    @Test
    public void testPrepend() {
        newEmptyList.append("world");
        newEmptyList.prepend("hello");
        assertEquals(newEmptyList.toString(), "[hello, world]");
    }
//
//    @Test
//    public void testSize() {
//        assertEquals(newPopulatedList.size(), 1);
//    }

    @Test
    public void testIsNotempty() {
        assertFalse(newPopulatedList.isempty());
    }

    @Test
    public void testIsempty() {
        assertTrue(newEmptyList.isempty());
    }
//    @Test
//    public void testGetHead() {
//    }
//
//    @Test
//    public void testGetElement() {
//    }
//
//    @Test
//    public void testToString() {
//
//    }
}