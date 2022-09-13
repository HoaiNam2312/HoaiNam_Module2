package ss6_ke_thua.Thuc_hanh;

public class Main {
    public static void main(String[] args) {
        //kiểm tra class: Shape
//        Shape shape = new Shape();
//        System.out.println(shape.toString());
//
//        shape = new Shape("red", false);
//        System.out.println(shape.toString());

        //Kiểm tra class: Circle
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
    }
}
