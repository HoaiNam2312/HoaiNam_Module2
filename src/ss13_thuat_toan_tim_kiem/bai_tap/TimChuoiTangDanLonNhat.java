package ss13_thuat_toan_tim_kiem.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class TimChuoiTangDanLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 chuỗi bất kỳ: ");
        String text = sc.nextLine();

        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < text.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(text.charAt(i));
            for (int j = i+1; j < text.length(); j++) {
                if (text.charAt(j) > list.getLast()) {
                    list.add(text.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character element: max) {
            System.out.print(element+" ");
        }
        System.out.println();
    }
}
