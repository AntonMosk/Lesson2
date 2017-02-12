package lesson2;

/**
 * Created by User on 11.02.2017.
 */
public class Array {
    private int values[] = new int[10];
    private int count = 0;


    public void add(int value) {
        if (count==values.length) {
            int new_values[] = new int[count*2];
            System.arraycopy(values, 0, new_values, 0, count);
            values = new_values;
        }
        values[count++]=value;
    }

    public int size() {
        return count;
    }

    public void remove(int i) {
       if (i < count) {
            if (count * 4 <= values.length) {
                int new_values[] = new int[values.length / 2];
                System.arraycopy(values, 0, new_values, 0, count);
                values = new_values;
            }
            System.arraycopy(values, i + 1, values, i, count - i - 1);
            count--;
        }  else throw new IndexOutOfBoundsException();
}

    public int capacity() {
        return values.length;
    }

    public int get(int i) {
        if (i<count)
            return values[i];
        else throw new IndexOutOfBoundsException();
    }
}
