package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane plane = new Airplane("Airbus", 1998, 150, 25000);
        plane.info();
        plane.setYear(2002);
        plane.setLength(148);
        plane.info();
        plane.fillUp(10);
        plane.fillUp(25);
        plane.info();
    }
}
