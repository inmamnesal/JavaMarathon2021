package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int size = keyboard.nextInt();

        int mor8 = 0;
        int eq1 = 0;
        int even = 0;
        int odd = 0;
        int sum = 0;

        int[] mas = new int[size];
        for(int i = 0; i < size; i++){
            mas[i] = (int)(Math.random()*10 + 1);
            if (mas[i] > 8) mor8++;
            if (mas[i] == 1) eq1++;
            if (mas[i] % 2 == 0) even++;
            if (mas[i] % 2 != 0) odd++;
            sum += mas[i];
        }
        System.out.println(Arrays.toString(mas));
        System.out.println("Длина массива: " + size);
        System.out.println("Количество чисел больше 8: " + mor8);
        System.out.println("Количество числе равных 1: " + eq1);
        System.out.println("Количество четных чисел: " + even);
        System.out.println("Количество нечетных чисел: " + odd);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
