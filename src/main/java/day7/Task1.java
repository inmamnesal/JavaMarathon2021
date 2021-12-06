package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Airbus", 1996, 150,25000 );
        Airplane airplane2 = new Airplane("ТУ", 1989, 180,30000 );
        Airplane.compareAirplanes(airplane1, airplane2);
    }
}