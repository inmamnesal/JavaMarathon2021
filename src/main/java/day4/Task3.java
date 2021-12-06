package day4;

public class Task3 {
    public static void main(String[] args) {
        int [][] mas = new int[12][8];


        int max = 0;
        int sumLine = 0;
        int maxLineNum = 0;

        for (int m = 0; m < 12; m++){
            for (int n = 0; n < 8; n++){
                mas[m][n] = (int)( Math.random()*51);
                if (mas[m][n]<10) System.out.print(mas[m][n] + "  ");
                else System.out.print(mas[m][n] + " ");
                sumLine += mas[m][n];
            }
            System.out.print("   |  " + sumLine);
            System.out.println();
            if (max <= sumLine) {
                max = sumLine;
                maxLineNum = m;
            }
            sumLine = 0;
        }

        System.out.println("Индекс строки с максимальной суммой: " + maxLineNum);



    }
}
