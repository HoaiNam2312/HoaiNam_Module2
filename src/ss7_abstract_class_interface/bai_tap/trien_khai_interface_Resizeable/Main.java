package ss7_abstract_class_interface.bai_tap.trien_khai_interface_Resizeable;

public class Main {
    public static void main(String[] args) {
        Circle circles[] = new Circle[3];
        circles[0] = new Circle(5);
        circles[1] = new Circle(10);
        circles[2] = new Circle(20,"Blue",true);
        System.out.println("Diện tích hình tròn bánh kình 5 = "+circles[0].getArea());
        circles[0].resize(30);

        System.out.println("Diện tích hình tròn bánh kình 10 = "+circles[1].getArea());
        circles[1].resize(30);

        System.out.println("Diện tích hình tròn bánh kình 20 = "+circles[2].getArea());
        circles[2].resize(30);


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
