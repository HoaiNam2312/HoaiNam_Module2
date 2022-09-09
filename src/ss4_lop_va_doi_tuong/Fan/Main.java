package ss4_lop_va_doi_tuong.Fan;

public class Main {
    public static void main(String[] args) {
        final int SLOW = 1;
        final int MEDIUM = 2;
        final int FAST = 3;

        Fan quatSo1 = new Fan();
        Fan quatSo2 = new Fan();

        quatSo1.setSpeed(quatSo1.getSLOW());
        quatSo1.setRadius(10);
        quatSo1.setColor("Yellow");
        quatSo1.setOn(true);

        quatSo2.setSpeed(quatSo2.getMEDIUM());
        quatSo2.setRadius(5);
        quatSo2.setColor("Blue");
        quatSo2.setOn(false);

        System.out.println("Quạt số 1 có: "+quatSo1.toString());
        System.out.println("Quạt số 2 có: "+quatSo2.toString());
    }
}
