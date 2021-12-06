package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //System.out.println("Количество этажей:");
        int floors = keyboard.nextInt();

        if(floors>=1 && floors<=4){
            System.out.println("Малоэтажный дом");
        }else if(floors>4 && floors<9){
            System.out.println("Среднеэтажный дом");
        }else if(floors>=9){
            System.out.println("Многоэтажный дом");
        }else if(floors<=0){
            System.out.println("Ошибка ввода");
        }
    }
}
