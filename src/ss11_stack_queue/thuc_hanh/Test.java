package ss11_stack_queue.thuc_hanh;

import java.util.Arrays;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        TreeMap<String, String> danhSach = new TreeMap<>();
        danhSach.put("one", "một");
        danhSach.put("two", "hai");
        System.out.println(Arrays.toString(danhSach.keySet().toArray()));
    }
}
