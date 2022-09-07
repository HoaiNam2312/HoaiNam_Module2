package ss3_mang_phuong_thuc.Bai_tap;

import java.util.Scanner;

public class them_phan_tu_vao_mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài của mảng: ");
        int l = sc.nextInt();
        int arr[] = new int[l+1];
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print("Nhập phần tử thứ "+i+" : ");
            arr[i] = sc.nextInt();
        }
        //hiển thị
        System.out.println("Mảng ban đầu: ");
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i]+"  ");
        }
        System.out.print("\nNhập giá trị muốn thêm: ");
        int giaTri = sc.nextInt();
        System.out.print("\nNhập vị trí muốn thêm: ");
        int viTri = sc.nextInt();
        for (int j = arr.length-1; j >viTri ; j--) {
          arr[j] = arr[j-1];
        }
        arr[viTri] = giaTri;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }

    }
}
