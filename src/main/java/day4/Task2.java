package day4;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] mas = new int[100];
        for (int i=0; i < 100; i++)
            mas[i] = (int)(Math.random()*10000 + 1);


        int min = 10000;
        int max = 0;
        int end0 = 0;
        int sumEnd0 = 0;

        for (int a : mas){
            if (min > a) min = a;
            if (max < a) max = a;
            if (a % 10 == 0){
                end0++;
                sumEnd0 += a;
            }
        }

        //System.out.println(Arrays.toString(mas));
        System.out.println("наибольший элемент массива: " + max);
        System.out.println("наименьший элемент массива: " + min);
        System.out.println("количество элементов массива, оканчивающихся на 0: " + end0);
        System.out.println("сумма элементов массива, оканчивающихся на 0: " + sumEnd0);

    }
}
