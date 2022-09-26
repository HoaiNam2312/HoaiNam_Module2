package ss11_stack_queue.thuc_hanh;

import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        TreeMap<Integer, String> danhSach = new TreeMap<>();
        danhSach.put(1, "một");
        danhSach.put(2, "hai");
        System.out.println(danhSach.size());
        System.out.println(danhSach.get(2));
    }
}
