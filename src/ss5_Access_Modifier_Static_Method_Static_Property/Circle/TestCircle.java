package ss5_Access_Modifier_Static_Method_Static_Property.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle hinhTron1 = new Circle(5.0);

        hinhTron1.getColor();
        hinhTron1.getRadius();

        //Khi 1 trong 2 phương thức getColor hoặc getRadius có access modifier là private thì sẽ có lỗi vì không cho truy cập ở lớp khác
        //Khi 2 phương thức getColor và getRadius có access modifier là public thì sẽ truy cập được
        //Khi 2 phương thức getColor và getRadius có access modifier là protected thì sẽ truy cập được vì 2 class cùng 1 package
        //Khi 2 phương thức getColor và getRadius có access modifier là default thì sẽ truy cập được vì 2 class cùng 1 package
    }
}
