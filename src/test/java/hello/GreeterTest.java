package hello;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GreeterTest {

    private Greeter greeter = new Greeter();

    @Test
    public void greeterSaysHello() {
        Assert.assertEquals(greeter.sayHello(), "Hello world!");
    }

}