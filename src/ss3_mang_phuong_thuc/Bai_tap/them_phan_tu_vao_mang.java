package ss3_mang_phuong_thuc.Bai_tap;

import java.util.Scanner;

public class them_phan_tu_vao_mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài của mảng: ");
        int l = sc.nextInt();
        int arr[] = new int[l];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử thứ "+i+" : ");
            arr[i] = sc.nextInt();
        }
        //hiển thị
        System.out.print("Mảng ban đầu: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
        System.out.print("\nNhập giá trị muốn thêm: ");
        int value = sc.nextInt();
        System.out.print("\nNhập vị trí muốn thêm: ");
        int viTri = sc.nextInt();
        arr = themPhanTu(arr, viTri, value);
        //Hiển thị
        System.out.print("\nMảng sau khi thêm phần tử: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }

    }

    public static int[] themPhanTu(int arr[], int viTri,int value) {
        int arr2[] = new int[arr.length+1];
        for (int i = 0; i < arr2.length; i++) {
            if (i < viTri) {
                arr2[i] = arr[i];
            } else if (i == viTri) {
                arr2[i] = value;
            } else {
                arr2[i]=arr[i-1];
            }
        }
        return arr2;
    }
}
