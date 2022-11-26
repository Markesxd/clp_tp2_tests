import java.util.Locale;
import java.util.Scanner;

public class testCat {
    public static void main(String[] args) {
        if(args.length < 1){
            System.out.println("Você esqueceu o parâmetro");
            return;
        }
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(args[0]);
        String[] strings = new String[n];
        int i = 0;
        while(sc.hasNextLine() && i < n){
            strings[i]= sc.nextLine();
            i++;
        }
        sc.close();
        long t1 = System.nanoTime();
        String buffer;
        for(i = 0; i < n; i += 2){
           buffer = strings[i] + strings[i + 1];
        }
        long t2 = System.nanoTime();
        float time = (t2 - t1) / 1000000000.0F;
        System.out.printf("%f\n", time);
    }
}