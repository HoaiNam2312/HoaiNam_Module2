package ss10_dsa.thuc_hanh.trien_khai_list_co_ban;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer>();
        myList.add(0);
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(88);

        System.out.println("element 4: " +myList.getElement(4));
        //System.out.println("element 4: " +myList.getElement(6));
    }
}
