package day7;

public class Player {
    private int stamina;
    final static int MAX_STAMINA = 100;
    final static int MIN_STAMINA = 0;
    public static int countPlayers= 0;

    public Player() {
        this.stamina = (int)(Math.random() * 11 + 90);
        if (countPlayers < 6)
            countPlayers ++;
    }

    public void run(){
        if (stamina == 0) //если у игрока уже нет выносливости то он не бежит и стамина не расходуется
            return;

        stamina--;

        if (stamina == 0)
            countPlayers--;
    }

    public static void info(){
        if (countPlayers < 6) {
            System.out.println("Команды не полные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }

    }

    public int getStamina() {
        return stamina;
    }
}
