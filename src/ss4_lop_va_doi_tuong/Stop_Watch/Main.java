package ss4_lop_va_doi_tuong.Stop_Watch;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalTime start = LocalTime.now();
        int arr[] = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(Math.random()*100);
        }
        for (int i = arr.length-1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[j] = arr[i];
                    arr[j] = temp;
                }
            }
        }
        LocalTime end = LocalTime.now();
        StopWatch dongHo1 = new StopWatch(start, end);
        System.out.print("Thời gian chạy được là: "+dongHo1.getElapsedTime());
        System.out.println("Mảng sau sắp xếp: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
