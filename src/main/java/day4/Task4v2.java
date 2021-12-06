package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4v2 {
    public static void main(String[] args) {
        int[] mas = new int[10];
        Random random = new Random();
        for (int i=0; i<mas.length; i++){
            mas[i] = random.nextInt(10000);
        }

        int maxSum = 0;
        int indexMaxSum = 0;

        for (int i=0; i < mas.length-2; i++){
            int sum = 0;
            for (int j=i; j<i+3; j++){
                sum += mas[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                indexMaxSum = i;
            }
        }

        System.out.println(Arrays.toString(mas));
        System.out.println(maxSum);
        System.out.println(indexMaxSum);

    }
}
