package day6;

public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("Петька");
        Teacher teacher = new Teacher("Василий Иванович", "филология");

        teacher.evaluate(student);

    }
}
