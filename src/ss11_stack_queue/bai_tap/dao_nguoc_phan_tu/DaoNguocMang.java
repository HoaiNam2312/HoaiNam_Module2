package ss11_stack_queue.bai_tap.dao_nguoc_phan_tu;

import java.util.Locale;
import java.util.Scanner;
import java.util.Stack;

public class DaoNguocMang<I extends String> {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7};
        System.out.print("Mảng số nguyên ban đầu: ");
        for (int e : arr1) {
            System.out.print(e+" ");
        }
        System.out.println();

        Stack<Integer> arr2 = new Stack<Integer>();
        for (int e : arr1) {
            arr2.push(e);
        }
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr2.pop();
        }
        System.out.print("Mảng số nguyên sau khi đảo ngược phần tử: ");
        for (int e : arr1) {
            System.out.print(e+" ");
        }
        System.out.println();
        System.out.println("/-----------/");

        //Chuỗi
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một tên bất kì: ");
        String text = sc.nextLine();
        System.out.println("Chuỗi ban đầu: "+text);
        Stack<String> textStack =  new Stack<>();
        for (int i = 0; i < text.length(); i++) {
            textStack.push(text.charAt(i)+"");
        }
        System.out.print("Chuỗi sau khi sắp xếp: ");
        while (textStack.size() > 0) {
            System.out.print(textStack.pop());
        }
        System.out.println();
        String alo = "kemetao okchua";
        System.out.println(alo.toUpperCase());
        String arr[] = new String[2];
        arr = alo.split(" ");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
