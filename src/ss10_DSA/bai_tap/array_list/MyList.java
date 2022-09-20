package ss10_DSA.bai_tap.array_list;

import ss3_mang_phuong_thuc.Bai_tap.xoa_phan_tu_khoi_mang;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 8;
    private Object arr[];

    public MyList() {
        arr = new Object[DEFAULT_CAPACITY];
    }

    public void ensureCapacity() {
        int newSize = arr.length * 2;
        arr = Arrays.copyOf(arr, newSize);
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity > arr.length) {
            arr = Arrays.copyOf(arr, minCapacity);
        }
    }

    public void add(int index, E element) {
        if (size == arr.length) {
            ensureCapacity();
        }
        arr[size++] = element;
    }

    public E remove(int index) {
        E temp = (E) arr[index];

        return temp;
    }
}
