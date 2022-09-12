package ss4_lop_va_doi_tuong.Test;

public class Main {
    public static void main(String[] args) {
        System.out.println(Car.numberOfCars);
        Car car1 = new Car("Mazda 3","Skyactiv 3");

        System.out.println(car1.numberOfCars);

        Car car2 = new Car("Mazda 6","Skyactiv 6");

        System.out.println(car2.numberOfCars);
    }
}
