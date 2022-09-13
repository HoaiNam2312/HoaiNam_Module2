package ss6_ke_thua.Bai_tap.Point_MovablePoint;

public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(1.5f, 1.5f, 2.5f, 2.5f);
        point.setSpeed(1.5f,1.5f);
        System.out.println(point);
        point.move();
        System.out.println(point);
    }
}
