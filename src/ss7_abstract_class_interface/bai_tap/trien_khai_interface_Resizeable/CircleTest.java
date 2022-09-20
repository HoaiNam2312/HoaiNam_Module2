package ss7_abstract_class_interface.bai_tap.trien_khai_interface_Resizeable;

public class CircleTest {
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
    }
}
