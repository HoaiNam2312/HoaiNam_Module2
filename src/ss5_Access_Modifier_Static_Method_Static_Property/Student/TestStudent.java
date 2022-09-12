package ss5_Access_Modifier_Static_Method_Static_Property.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student hocSinh1 = new Student();

        hocSinh1.setClasses("A0622I1");
        hocSinh1.setName("Nam");

        //Khi 1 trong 2 phương thức setClasses hoặc setName có access modifier là private thì sẽ có lỗi vì không cho truy cập ở lớp khác
        //Khi 2 phương thức setClasses và setName có access modifier là public thì sẽ truy cập được
        //Khi 2 phương thức setClasses và setName có access modifier là protected thì sẽ truy cập được vì 2 class cùng 1 package
        //Khi 2 phương thức setClasses và setName có access modifier là default thì sẽ truy cập được vì 2 class cùng 1 package
    }
}
