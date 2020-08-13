package me.isortegah.labs;

import org.junit.Test;

public class FooTest {

    @Test
    public void testFoo(){
        new Foo().foo();
    }

    @Test
    public void testBar(){
        new Foo().bar();
    }

    @Test
    public void testDao(){
        new Foo().dao();
    }
}
