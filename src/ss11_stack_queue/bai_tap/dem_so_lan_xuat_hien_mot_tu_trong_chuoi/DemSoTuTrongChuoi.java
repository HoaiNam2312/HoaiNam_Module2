package ss11_stack_queue.bai_tap.dem_so_lan_xuat_hien_mot_tu_trong_chuoi;

import java.util.TreeMap;

public class DemSoTuTrongChuoi {
    public static void main(String[] args) {
        String text = "một hai hai ba hai không không một";
        String textArr[] = new String[100];
        textArr = text.split(" ");
        System.out.print("Mảng chứa các từ: ");
        for (int i = 0; i < textArr.length; i++) {
            System.out.print(textArr[i]+" ");
        }
        System.out.println();

        TreeMap<String, Integer> textTreeMap =new TreeMap<>();
        for (String element: textArr) {
            if (textTreeMap.containsKey(element)) {
                textTreeMap.put(element, textTreeMap.get(element)+1);
            }else {
                textTreeMap.put(element, 1);
            }
        }
        System.out.println("không : "+textTreeMap.get("không"));
        System.out.println("một : "+textTreeMap.get("một"));
        System.out.println("hai : "+textTreeMap.get("hai"));
        System.out.println("ba : "+textTreeMap.get("ba"));
    }
}
