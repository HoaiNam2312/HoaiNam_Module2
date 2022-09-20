package ss7_abstract_class_interface.Tu_hoc_TITV.Interface;

public class Main {
    public static void main(String[] args) {
        System.out.println("Test câu b: ");
        SapXepChen sapXepChen = new SapXepChen();

        double arr[] = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        sapXepChen.sapXepTang(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sapXepChen.sapXepGiam(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Test class kế thừa 2 interface: ");
        PhanMenMayTinh pmmt = new PhanMenMayTinh();
        double arr1[] = {3, 83, 66, 64, 50, 44, 3, 2, 12, 10};
        pmmt.sapXepGiam(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.println("3+4= "+pmmt.cong(3,4));

    }
}
