import java.util.Scanner;

public class strlen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1;
        str1 = sc.nextLine();
        long t1 = System.currentTimeMillis();
            System.out.println(str1.length());
        long t2 = System.currentTimeMillis();
        long t3 = t2 - t1;
        System.out.println(t3);
        sc.close();
    }
}
