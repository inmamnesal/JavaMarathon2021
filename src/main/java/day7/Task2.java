package day7;

public class Task2 {
    public static void main(String[] args) {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        Player p4 = new Player();
        Player p5 = new Player();
        Player p6 = new Player();
        Player.info();
        p1.run();
        p1.run();
        System.out.println(p1.getStamina());
        p1.run();
        System.out.println(p1.getStamina());

    }
}
