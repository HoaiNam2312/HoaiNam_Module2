package ss10_DSA.test;

import java.util.ArrayList;
import java.util.List;

public class TestDuyetArrayList{
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        //Thêm 1 phần tử vào ArrayList ta sử dụng pt add()
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        //Cách duyệt (in) 1 arrayList
//        for (int i = 0; i < cars.size(); i++) {
//            System.out.println(cars.get(i));
//        }

        //Tách 1 mảng(ArrayList) từ 1 mảng(ArrayList) có sẵn
        List<String> cars2 = cars.subList(1,4);
        for (int i = 0; i < cars2.size(); i++) {
            System.out.println(cars2.get(i));
        }
    }
}
