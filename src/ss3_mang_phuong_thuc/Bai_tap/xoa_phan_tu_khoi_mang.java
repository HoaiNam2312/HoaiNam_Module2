package ss3_mang_phuong_thuc.Bai_tap;

import java.util.Scanner;

public class xoa_phan_tu_khoi_mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mảng ban đầu có giá trị: ");
        int arr[] = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
        System.out.print("\nNhập giá trị mà bạn muốn xóa: ");
        int num = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                for (int j = i; j < arr.length-1; j++) {
                    arr[j] = arr[j+1];
                }
                break;
            }
        }
        System.out.print("Mảng sau khi xóa có giá trị: ");
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+"  ");
        }
    }
}
