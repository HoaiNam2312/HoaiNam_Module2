package ss10_dsa.bai_tap.LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList<>();
        //Test 1
//        myLinkedList.addFirst("Nam");
//        myLinkedList.addFirst("NamAnh");
//        myLinkedList.addFirst("Trung");
//        System.out.println("Thằng bị xóa: "+ myLinkedList.remove("Nam"));
//        System.out.println("Thằng đứng đầu: "+myLinkedList.getFirst());
//        System.out.println("Thằng đứng nhì: "+myLinkedList.get(1));
//        System.out.println("Thằng đứng ba: "+myLinkedList.get(2));
//        System.out.println();
//
//        System.out.println("/----------------/");
//        System.out.println();

        //Test 2
        myLinkedList.addFirst("Nam");   //2
        myLinkedList.addFirst("Huy");   //1
        myLinkedList.addFirst("Trung"); //0
        myLinkedList.addLast("Quân");   //3
        myLinkedList.addLast("Thảo Đào");   //4
        myLinkedList.add(1,"Thiện"); // thêm vô index thứ 1
        //Kết quả đúng sẽ là : Trung -Thiện - Huy - Nam - Quân
        System.out.println("Test 2: ");
        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.get(3));
        System.out.println(myLinkedList.get(4));
        System.out.println(myLinkedList.get(5));
    }
}
