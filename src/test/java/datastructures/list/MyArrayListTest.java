package datastructures.list;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

@Test
public class MyArrayListTest {
    private MyArrayList<String> emptyList;
    private MyArrayList<String> populatedList;

    @BeforeMethod
    void beforeMethod() {
        emptyList = new MyArrayList<>();

        populatedList = new MyArrayList<>();
        populatedList.append("BMW");
        populatedList.append("Audi");
        populatedList.append("Landrover");
    }

    @Test
    void testDefaultListIsEmpty() {
        assertTrue(emptyList.isempty());
    }

    @Test
    void testNonEmptyList() {
        assertFalse(populatedList.isempty());
    }

    @Test
    void testAddEntry() {
        assertEquals(populatedList.getHead(), "BMW");
    }

    @Test
    void testGetElement() {
        assertEquals(populatedList.getElement(1), "Audi");
    }

    @Test
    void testSize() {
        assertEquals(populatedList.size(), 3);
    }

    @Test
    void testPrepend() {
        populatedList.prepend("Ford");
        assertEquals(populatedList.toString(),
                "[Ford, BMW, Audi, Landrover, null]");
    }

}