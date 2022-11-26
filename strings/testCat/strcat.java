import java.util.Scanner;

public class strcat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1;
        String str2;
        str1 = sc.nextLine();
        str2 = sc.nextLine();
            long t1 = System.currentTimeMillis();
                str2 = str1 + str2;
                System.out.println(str2);
            long t2 = System.currentTimeMillis();
            long t3 = t2 - t1;
            System.out.println(t3);
        sc.close();
    }
}