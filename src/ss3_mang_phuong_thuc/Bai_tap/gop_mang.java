package ss3_mang_phuong_thuc.Bai_tap;

import java.util.Scanner;

public class gop_mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài mảng 1: ");
        int l1 = sc.nextInt();
        int arr1[] = nhapMang(l1,sc);
        System.out.print("Mảng số 1: ");
        hienThiMang(arr1);
        System.out.print("Nhập độ dài mảng 2: ");
        int l2 = sc.nextInt();
        int arr2[] = nhapMang(l2,sc);
        System.out.print("Mảng gộp của 2 mảng trên là: ");
        int arr3[] = congMang(arr1,arr2);
        hienThiMang(arr3);
    }
    public static int[] nhapMang(int dai, Scanner sc){
        int arr[] = new int[dai];
        for (int i = 0; i < dai; i++) {
            System.out.print("arr["+i+"] = ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void hienThiMang(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }

    public static int[] congMang(int arr1[], int arr2[]) {
        int arr3[] = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i]=arr1[i];
        }
        for (int j = arr1.length; j < arr3.length; j++) {
            arr3[j] = arr2[j- arr1.length];
        }
        return arr3;
    }
}
