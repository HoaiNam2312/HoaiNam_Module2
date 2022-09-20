package ss7_abstract_class_interface.bai_tap.trien_khai_interface_Resizeable;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangles[] = new Rectangle[3];
        rectangles[0] = new Rectangle(5, 10);
        rectangles[1] = new Rectangle(6, 12);
        rectangles[2] = new Rectangle(7, 8);

        System.out.println("Diện tích hình chữ nhật thứ 1 = " + rectangles[0].getArea());
        System.out.println("Sau khi tăng");
        rectangles[0].resize(50);
        System.out.println();
        System.out.println("Diện tích hình chữ nhật thứ 2 = " + rectangles[1].getArea());
        System.out.println("Sau khi tăng");
        rectangles[1].resize(30);
        System.out.println();
        System.out.println("Diện tích hình chữ nhật thứ 3 = " + rectangles[2].getArea());
        System.out.println("Sau khi tăng");
        rectangles[2].resize(20);
    }
}
