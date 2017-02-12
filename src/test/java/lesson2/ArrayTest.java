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

        System.out.println(a);

        Assert.assertThat(a.size(), is(2));
    }

    @Test
    public void dynamicSizing() {
        final int n = 100;

        Array a = new Array();
        for (int i=0; i<n; i++) {
            a.add(i);
        }

        System.out.println(a);

        Assert.assertThat(a.size(), is(100));
    }

    @Test
    public void shrinkTest() {
        final int n = 10000;

        Array a = new Array();
        for (int i=0; i<n; i++) {
            a.add(i);
        }

        System.out.println(a);

        for (int i=0; i<n; i++) {
            a.remove(0);
        }

        System.out.println(a);

        Assert.assertThat(a.size(), is(0));
        Assert.assertThat(a.capacity(), is(2));

//        c.remove(10);
    }

    @Test
    public void getTest() {
        Array a = new Array();
        a.add(11);
        a.add(-5);
        a.add(3);

        System.out.println(a);

        Assert.assertThat(a.get(0), is(11));
        Assert.assertThat(a.get(1), is(-5));
        Assert.assertThat(a.get(2), is(3));
    }

}
