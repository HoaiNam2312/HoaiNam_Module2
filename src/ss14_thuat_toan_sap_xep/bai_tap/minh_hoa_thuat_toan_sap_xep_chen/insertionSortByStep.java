package ss14_thuat_toan_sap_xep.bai_tap.minh_hoa_thuat_toan_sap_xep_chen;

import java.util.Scanner;

public class insertionSortByStep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Nhập độ dài mảng");
        size = sc.nextInt();
        int list[] = new int[size];
        System.out.println("Nhập " + size + " cho mảng: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print("arr["+i+"] = ");
            list[i] = sc.nextInt();
            System.out.println();
        }
        System.out.println("Mảng ban đầu: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        insertionSort(list);
        System.out.println("Mảng sau sắp xếp: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
    }

    public static void insertionSort(int arr[]) {
        int val, pos;
        for (int i = 1; i < arr.length; i++) {
            val = arr[i];
            pos = i;
            while (pos > 0 && val < arr[pos - 1]) {
                arr[pos] = arr[pos - 1];
                pos--;
            }
            arr[pos]=val;
        }
    }
}
