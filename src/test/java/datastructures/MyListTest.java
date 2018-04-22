package datastructures;

import org.testng.Assert;
import org.testng.annotations.Test;


@Test
public class MyListTest {

    @Test
    void testDefaultListIsEmpty() {
        MyList list = new MyList();
        Assert.assertTrue(list.isempty());
    }

    @Test
    void testAddEntry() {
        MyList<String> list = new MyList<>();
        list.append("BMW");
        Assert.assertEquals(list.getElement(0), "BMW");
    }

}