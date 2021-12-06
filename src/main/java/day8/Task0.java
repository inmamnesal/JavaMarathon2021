package day8;

public class Task0 {
    public static void main(String[] args) {
        Human h1 = new Human("Tom", 44);

        System.out.println(h1);
    }
}

class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return name + ", " + age;
    }
}
