package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setColor("Yellow");
        car1.setModel("Mustang");
        car1.setYear(1986);

        System.out.println(car1.getColor());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());
    }
}

