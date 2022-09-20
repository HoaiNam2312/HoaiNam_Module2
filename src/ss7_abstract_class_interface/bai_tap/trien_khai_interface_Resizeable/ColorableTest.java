package ss7_abstract_class_interface.bai_tap.trien_khai_interface_Resizeable;

public class ColorableTest {
    public static void main(String[] args) {
        Rectangle rectangles[] = new Rectangle[3];
        rectangles[0] = new Square(5);
        rectangles[1] = new Square(10);
        rectangles[2] = new Rectangle(3, 4);
        System.out.println("Diện tích của hình chữ nhật có chiều dài 3 và chiều rộng 4 là: "+ rectangles[2].getArea());
        System.out.println("Diện tích của hình chữ vuông có cạnh bằng 5 là: "+ rectangles[0].getArea());
        System.out.println("Diện tích của hình chữ vuông có cạnh bằng 10 là: "+ rectangles[1].getArea());

        //rectangles[0].howToColor(); bị lỗi vì lớp Rectangle không phải là implements của interface Colorable
        // ta chỉ gọi được PT howToColor() khi tạo 1 đối tượng từ lớp Square

        if (rectangles[0] instanceof Shape) {
            Colorable colorable = (Square) rectangles[0];
            colorable.howToColor();
        }
    }
}
