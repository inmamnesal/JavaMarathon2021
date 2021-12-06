package day8;

public class Task1 {
    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        String result = "";
        for (int i = 0; i <= 20000; i++){
            result += i;
        }
        System.out.println(result);
        long t2 = System.currentTimeMillis();
        System.out.println(t2 - t1);



        long t3 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 20000; i++){
            sb.append(i);//.append(" ");
        }
        System.out.println(sb.toString());
        long t4 = System.currentTimeMillis();
        System.out.println(t4 - t3);

    }
}
