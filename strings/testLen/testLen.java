import java.util.Locale;
import java.util.Scanner;

public class testLen {
    public static void main(String[] args) {
        if(args.length < 1){
            System.out.println("Você esqueceu o parâmetro");
            return;
        }
        Locale.setDefault(Locale.US);
        int n = Integer.parseInt(args[0]);
        Scanner sc = new Scanner(System.in);
        String[] strings = new String[n];
        for(int i = 0; i < n; i++){
            strings[i] = sc.nextLine();
        }
        sc.close();
        long t1 = System.nanoTime();
        for(int i = 0; i < n; i++){
            strings[i].length();
        }
        long t2 = System.nanoTime();
        float t3 = (t2 - t1) / 1000000000f;
        System.out.printf("%f\n", t3);
    }
}
