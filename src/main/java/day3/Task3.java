package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
/*        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            double a = keyboard.nextDouble();
            double b = keyboard.nextDouble();
            if (b == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(a/b);
        }*/

        Scanner keyboard = new Scanner(System.in);
        int counter = 0;
        while (counter < 5){
            double a = keyboard.nextDouble();
            double b = keyboard.nextDouble();
            counter ++;

            if (b == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(a/b);
        }


    }
}
