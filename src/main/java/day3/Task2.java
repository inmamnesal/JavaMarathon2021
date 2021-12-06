package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
/*        Scanner keyboard = new Scanner(System.in);
        double a;
        double b=1;
        while (b!=0){
            a = keyboard.nextDouble();
            b = keyboard.nextDouble();
            System.out.println(a/b);
        }*/

        Scanner keyboard = new Scanner(System.in);
        while (true){
            double a = keyboard.nextDouble();
            double b = keyboard.nextDouble();
            if (b == 0) break;
            System.out.println(a/b);
        }
    }
}