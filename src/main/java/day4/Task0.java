package day4;

import java.util.Arrays;
//Заполнение массива случайными числами
public class Task0 {
    public static void main(String[] args) {

        int[] mas = new int[5];

        for (int i = 0; i < 5; i++) {
            //int a = (int) (Math.random()*3);
            int a = (int) (Math.random()*101);
            mas [i] = a;
        }
        System.out.println(Arrays.toString(mas));
    }
}
