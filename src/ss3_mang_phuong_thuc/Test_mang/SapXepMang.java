package ss3_mang_phuong_thuc.Test_mang;

import java.util.Arrays;

public class SapXepMang {
    public static void main(String[] args) {
        int arr[] = {12,33,44,42,52,75};
        System.out.println("Trước sắp xếp: "+ Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Trước sắp xếp: "+ Arrays.toString(arr));
    }
}
