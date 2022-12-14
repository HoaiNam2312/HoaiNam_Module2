package ss6_ke_thua.Bai_tap.Circle_Cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {

    }
    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume() {
        return getArea()*this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
