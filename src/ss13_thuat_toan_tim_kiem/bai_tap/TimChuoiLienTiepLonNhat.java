package ss13_thuat_toan_tim_kiem.bai_tap;

import java.util.LinkedList;
import java.util.Scanner;

public class TimChuoiLienTiepLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 1 chuỗi bất kỳ: ");
        String text = sc.nextLine();

        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < text.length()-1; i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(text.charAt(i));
            int j=i;
            while (text.charAt(j) < text.charAt(j + 1)) {
                list.add(text.charAt(j+1));
                j++;
                if (j == text.length()-1) { // điều khiện dừng
                    break;
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
                i=j;
            }
            list.clear();
        }
        for (Character element: max) {
            System.out.print(element+"");
        }
        System.out.println();
    }
}
