import java.util.Locale;
import java.util.Scanner;

public class testCmp {
    public static void main(String[] args) {
        if(args.length < 1){
            System.out.println("Você esqueceu o parâmetro");
            return;
        }
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Integer n = Integer.parseInt(args[0]);
        String[] strings = new String[n];
        int i = 0;
        while(sc.hasNextLine() && i < n){
            strings[i++] = sc.nextLine();
        }
        sc.close();
        long t1 = System.nanoTime();
        for(i = 0; i < n; i += 2){
            strings[i].equals(strings[i + 1]);
        }
        long t2 = System.nanoTime();
        double t3 = (t2 - t1) / 1000000000d;
        System.out.printf("%f\n", t3);
    }
}