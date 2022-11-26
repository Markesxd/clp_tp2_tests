import java.util.Scanner;

public class strcmp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1;
        String str2;
        str1 = sc.nextLine();
        str2 = sc.nextLine();
        long t1 = System.currentTimeMillis();
            str1.equals(str2);
        long t2 = System.currentTimeMillis();
        long t3 = t2 - t1;
        System.out.println(t3);
        sc.close();
    }} /*
    Scanner sc = new Scanner(System.in);
    String str1;
    String str2; 
    {
    str1 = sc.nextLine();
    str2 = sc.nextLine();
    for (int i = 0; i < str1.length(); i++) {
        if (str1.charAt(i) == str2.charAt(i)) {
            System.out.println("As strinsgs são iguais");
        } else {
            System.out.println("As strings são diferentes");
            break;
        }
    }
    sc.close();
}
} */
