package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();

        while (a <= b){
            if(a % 5 == 0 && a % 10 != 0){
                System.out.print(a + " ");
            }
            a++;
        }
    }
}
