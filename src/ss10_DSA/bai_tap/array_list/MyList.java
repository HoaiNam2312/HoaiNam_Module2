package ss10_DSA.bai_tap.array_list;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object arrOfficial[];

    public MyList() {
        arrOfficial = new Object[DEFAULT_CAPACITY];
    }

    public void ensureCapacity() {
        if (size >= arrOfficial.length) {
            arrOfficial = Arrays.copyOf(arrOfficial, 10);
        }
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity > arrOfficial.length) {
            arrOfficial = Arrays.copyOf(arrOfficial, minCapacity);
        }
    }

    public void add(int index, E e) {
        if (size == arrOfficial.length) {
            ensureCapacity();
        }
        for (int i = size - 1; i >= index; i--){
            arrOfficial[i + 1] = arrOfficial[i];
        }
        arrOfficial[index] = e;
        size++;
    }

    public E remove(int index) {
        E temp = (E) arrOfficial[index];
        Object arrTemporary[] = new Object[arrOfficial.length-1];
        for (int j = 0; j < arrTemporary.length; j++) {
            if (j < index) {
                arrTemporary[j] = arrOfficial[j];
            } else {
                arrTemporary[j] = arrOfficial[j + 1];
            }
        }
        arrOfficial = arrTemporary.clone();
        size--;
        return temp;
    }

    public int getSize() {
        return size;
    }

    public E getElement(int index) {
        if (index >= 0 && index < size) {
            return (E) arrOfficial[index];
        }
        return null;
    }
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(arrOfficial[i])) {
                return true;
            }
        }
        return false;
    }

    public int indexOf (E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(arrOfficial[i])) {
                return i;
            }
        }
        return -1;
    }

    public void clear() {
        arrOfficial = new Object[DEFAULT_CAPACITY];
        size=0;
    }

    public E set(int index,E e) {
        E tmp = e;
        checkIndex(index);
        arrOfficial[index] = e;
        return tmp;
    }
    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException
                    ("index " + index + " out of bounds");
    }
    public void printArr() {
        for (Object i : arrOfficial) {
            System.out.println(i);
        }
    }
}
