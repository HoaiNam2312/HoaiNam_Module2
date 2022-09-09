package ss4_lop_va_doi_tuong.Bai_tap.Thuc_hanh;

public class Rectangle {
    private double width, height;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width+this.height)*2;
    }

    public String display() {
        return "Chiều rộng = "+this.width+", chiều dài = "+this.height;
    }
}
