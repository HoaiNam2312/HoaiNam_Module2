package ss3_mang_phuong_thuc.Bai_tap;

import java.util.Scanner;

public class tim_pt_lon_nhat_mang_2_chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hàng của mảng 2 chiều: ");
        int hang = sc.nextInt();
        System.out.print("Nhập số cột của mảng 2 chiều: ");
        int cot = sc.nextInt();
        int arr[][] = nhapMang(hang,cot,sc);
        inMang(arr);

    }

    public static int[][] nhapMang(int hang, int cot, Scanner sc) {
        int arr[][]= new int[hang][cot];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("arr["+i+"]["+j+"] = ");
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
    public static void inMang (int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("(");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.print(") ");
        }
        System.out.println();
    }
}
