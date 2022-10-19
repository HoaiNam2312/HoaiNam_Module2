package ss14_thuat_toan_sap_xep.bai_tap.cai_dat_thuat_toan_sap_xep_chen;

public class InsertionSort {
    static int list[] = {11, 4, 5, 77, 5, 6, 9, 10, -2, 9};

    static void insertionSort(int arr[]) {
        int val,pos;
        for (int i = 1; i < arr.length; i++) {
            val = arr[i];
            pos = i;
            while (pos>0 && val < arr[pos - 1]) {
                arr[pos] = arr[pos - 1];
                pos--;
            }
            arr[pos] = val;
        }
    }

    public static void main(String[] args) {
        System.out.println("Mảng ban đầu: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        insertionSort(list);
        System.out.println("Mảng sau khi sắp xếp: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }
}
