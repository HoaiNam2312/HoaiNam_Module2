package ss3_mang_phuong_thuc.Bai_tap;

import java.util.Scanner;

public class tim_pt_nho_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng của mảng: ");
        int l = sc.nextInt();
        int arr[] = new int[l];
        System.out.println("Vui lòng nhập các phần tử của mảng: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr["+i+"] = ");
            arr[i] = sc.nextInt();
        }
        System.out.print("\nGiá trị nhỏ nhất của mảng là: ");
        int min = arr[0];
        for (int j = 1; j < arr.length; j++) {
            if (min > arr[j]) {
                min = arr[j];
            }
        }
        System.out.print(min);
    }
}
