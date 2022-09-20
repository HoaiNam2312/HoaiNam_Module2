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
        int value = sc.nextInt();
        arr = xoaPhanTu(arr,value);
        System.out.print("Mảng sau khi xóa có giá trị: ");
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+"  ");
        }
    }

    public static int[] xoaPhanTu(int arr[],int value) {
        int result[] = new int[arr.length-1];
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]) {
                index = i;
                break;
            }
        }
        for (int j = 0; j < result.length; j++) {
            if (j < index) {
                result[j] = arr[j];
            } else {
                result[j]=arr[j+1];
            }
        }
        return result;
    }
    public static int[] xoaPhanTu(int arr[],int index) {
        int result[] = new int[arr.length-1];
        int index=0;
        for (int i = 0; i < index; i++) {
            if (value == arr[i]) {
                index = i;
                break;
            }
        }
        for (int j = 0; j < result.length; j++) {
            if (j < index) {
                result[j] = arr[j];
            } else {
                result[j]=arr[j+1];
            }
        }
        return result;
    }
}
