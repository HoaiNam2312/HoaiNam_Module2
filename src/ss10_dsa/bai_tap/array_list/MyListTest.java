package ss10_dsa.bai_tap.array_list;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer>();
        myList.add(0, 0);
        myList.add(1, 87);
        myList.add(2, 6);
        myList.add(3, 343);
        myList.add(4, 34);
        myList.add(5, 32);
        myList.add(6, 22);
        myList.add(7, 11);
        myList.printArr();
        System.out.println("-------");
        System.out.println(myList.remove(6));
        System.out.println("-------");
        myList.printArr();

    }
}
