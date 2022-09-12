package ss5_Access_Modifier_Static_Method_Static_Property.Circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

     double getRadius() {
        return radius;
    }

     String getColor() {
        return color;
    }
}
