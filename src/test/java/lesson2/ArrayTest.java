package lesson2;


import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

/**
 * Unit test for simple App.
 */
public class ArrayTest {

    @Test
    public void testSize() {
        Array a = new Array();
        a.add(2);
        a.add(3);
        Assert.assertThat(a.size(), is(2));
    }

    @Test
    public void dynamicSizing() {
        Array b = new Array();
        for (int i=0; i<100; i++) {
            b.add(i);
        }
        Assert.assertThat(b.size(), is(100));
    }

    @Test
    public void shrinkTest() {
        Array c = new Array();
        for (int i=0; i<10000; i++) {
            c.add(i);
        }

        for (int i=0; i<10000; i++) {
            c.remove(0);
        }
        Assert.assertThat(c.size(), is(0));
        Assert.assertThat(c.capacity(), is(2));

//        c.remove(10);
    }

    @Test
    public void getTest() {
        Array c = new Array();
        c.add(11);
        c.add(-5);
        c.add(3);

        Assert.assertThat(c.get(0), is(11));
        Assert.assertThat(c.get(1), is(-5));
        Assert.assertThat(c.get(2), is(3));
    }

    public static void main(String[] args) {

    }
}
