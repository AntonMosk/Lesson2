package lesson2;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

/**
 * Created by User on 11.02.2017.
 */
public class LinkedListTest {

    @Test
    public void addTest() {
        LinkedList list = new LinkedList();

        list.add(11);
        list.add(-1);
        list.add(7);

        System.out.println(list);

        LinkedList.Node first = list.getFirst();
        Assert.assertThat(first.getValue(), is(11));

        LinkedList.Node second = first.getNext();
        Assert.assertThat(second.getValue(), is(-1));

        LinkedList.Node third = second.getNext();
        Assert.assertThat(third.getValue(), is(7));

    }

    @Test
    public void addBeginTest() {
        LinkedList list = new LinkedList();
        list.addBegin(11);
        list.addBegin(-1);
        list.addBegin(7);

        System.out.println(list);

        LinkedList.Node first = list.getFirst();
        Assert.assertThat(first.getValue(), is(7));

        LinkedList.Node second = first.getNext();
        Assert.assertThat(second.getValue(), is(-1));

        LinkedList.Node third = second.getNext();
        Assert.assertThat(third.getValue(), is(11));

    }

    @Test
    public void removeTest() {
        LinkedList list = new LinkedList();
        int n = 21;

        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        System.out.println(list);

        for (int i = 0; i < n; i++) {
            LinkedList.Node node = list.getFirst();
            list.remove(node);
        }

        System.out.println(list);

        Assert.assertNull(list.getFirst());
        Assert.assertNull(list.getTail());
        Assert.assertThat(list.getSize(), is(0));
    }

    @Test
    public void removeEvenTest() {
        LinkedList list = new LinkedList();
        LinkedList.Node node1, node2;

        int n = 21;

        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        System.out.println(list);
        Assert.assertThat(list.getSize(), is(n));

        node1 = list.getFirst();
        n = list.getSize();
        for (int i = 0; i < n; i += 2) {
            if (node1 != null) {
                node2 = node1.getNext();
                list.remove(node1);
                if (node2 != null)
                    node1 = node2.getNext();
            }
        }

        System.out.println(list);
        Assert.assertThat(list.getSize(), is(n / 2));
    }

    @Test
    public void removeOddTest() {
        LinkedList list = new LinkedList();
        LinkedList.Node node1, node2 = null;

        int n = 21;

        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        System.out.println(list);
        Assert.assertThat(list.getSize(), is(n));

        node1 = list.getFirst();
        n = list.getSize();
        for (int i = 0; i < n; i += 2) {
            if (node1 != null)
                node2 = node1.getNext();
            if (node2 != null) {
                node1 = node2.getNext();
                list.remove(node2);
            }
        }

        System.out.println(list);
        Assert.assertThat(list.getSize(), is(n / 2 + n % 2));
    }

    @Test
    public void reverseLinkedListTest() {
        LinkedList list = new LinkedList();
        int n = 21;

        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        System.out.println(list);

        Assert.assertThat(list.getSize(), is(n));

        list.reverseLinkedList();
        System.out.println(list);
    }

    @Test
    public void reverseOddTest() {
        LinkedList list = new LinkedList();
    }
}
