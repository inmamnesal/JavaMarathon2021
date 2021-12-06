package day4;

import java.util.Arrays;
import java.util.Random;

//Заполнение массива случайными числами
public class Task0 {
    public static void main(String[] args) {

        int[] mas = new int[5];

        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            //int a = (int) (Math.random()*3);
            int a = (int) (Math.random()*101);
            //int a = random.nextInt();
            mas [i] = a;
        }
        System.out.println(Arrays.toString(mas));
    }
}
