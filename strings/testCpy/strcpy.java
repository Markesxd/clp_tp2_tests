import java.util.Scanner;

public class strcpy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1;
        String str2;
        String str3;
        str1 = sc.nextLine();
        str2 = sc.nextLine();
            long t1 = System.currentTimeMillis();
                str3 = str1 + str2;
            long t2 = System.currentTimeMillis();
            long t3 = t2 - t1;
            System.out.println(t3);
        sc.close();
    }
}
