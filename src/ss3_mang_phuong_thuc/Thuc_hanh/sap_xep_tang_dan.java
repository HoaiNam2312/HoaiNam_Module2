package ss3_mang_phuong_thuc.Thuc_hanh;

import java.util.Scanner;

public class sap_xep_tang_dan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {5,4,2,7,8,9,1,0};
        //Hiển thị
        System.out.println("Mảng ban đầu: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
        //sắp xếp tăng dần
        for (int i = arr.length-1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //Hiển thị
        System.out.println("Mảng sau khi sắp xếp: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
        //Sắp xếp giảm dần
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length-1; j >=i; j--) {
                if (arr[i]<arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        //Hiển thị
        System.out.println("Mảng sau khi sắp xếp giảm dần: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
    }
}
