package ss7_abstract_class_interface.bai_tap.trien_khai_interface_Resizeable;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape shapes[] = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(5, 7);
        shapes[2] = new Square(5);
        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                ((Circle) shape).resize(30);
            } else if (shape instanceof Square) {
                ((Square) shape).resize(45);
            } else if (shape instanceof Rectangle) {
                ((Rectangle) shape).resize(30);
            }
        }
    }
}
