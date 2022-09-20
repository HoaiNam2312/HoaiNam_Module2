package ss3_mang_phuong_thuc.Test_mang;

import java.util.Arrays;

public class XoaPhanTu {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {99, 98, 97, 96};
        int arr3[] = arr2.clone();
        arr1 = arr2.clone();
        for (int element : arr1) {
            System.out.println(element);
        }
    }
}
