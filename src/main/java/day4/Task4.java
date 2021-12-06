package day4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] mas = new int[100];
        int maxsum = 0;
        int maxindex = 0;
        int sum = 0;


        for (int i = 0; i < 100; i++){
            mas[i] = (int)(Math.random() * 10001);
            if (i > 1) sum = mas[i] + mas[i-1] + mas[i-2];
            if (maxsum < sum) {
                maxsum = sum;
                maxindex = i - 2;
            }
        }
        System.out.println(Arrays.toString(mas));
        System.out.println(maxsum);
        System.out.println(maxindex);



    }
}
