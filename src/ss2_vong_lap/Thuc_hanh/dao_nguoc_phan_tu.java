package ss2_vong_lap.Thuc_hanh;

import java.util.Scanner;

public class dao_nguoc_phan_tu {
    public static void main(String[] args) {
        int arr[];
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int size = sc.nextInt();
        while (size < 1 || size > 20) {
            System.out.println("Chú Ý! Mảng có số lượng từ: 1 đến 20 phần tử");
            System.out.print("Nhập số lượng phần tử của mảng: ");
            size = sc.nextInt();
        }
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhập phần tử thứ "+i+" : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Trước khi biến đổi: ");
        hienThi(arr);
        int first = 0, last = arr.length-1,temp;
        while (first < last) {
            temp = arr[first];
            arr[first] = arr[last];
            arr[last] =  temp;
            first++;
            last--;
        }
        System.out.println("\nSau khi biến đổi: ");
        hienThi(arr);
    }
    public static void hienThi(int arr[]) {
        for (int h = 0; h < arr.length; h++) {
            System.out.print(arr[h]+"\t");
        }
    }
}
