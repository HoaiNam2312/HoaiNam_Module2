package ss10_dsa.thuc_hanh.trien_khai_list_co_ban;

import java.util.Arrays;

public class MyList<E> {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private Object arr[];

    public MyList() {
        arr = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = DEFAULT_CAPACITY * 2;
        arr = Arrays.copyOf(arr, newSize);
    }

    public void add(E e) {
        if (size == arr.length) {
            ensureCapa();
        }
        arr[size++] = e;
    }

    public E getElement(int index) {
        if (index>= size || index <0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index );
        }
        return (E) arr[index];
    }
}
