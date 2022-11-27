import java.util.Locale;
import java.util.Scanner;

public class testSum {
    public static void main(String[] args) {
        if(args.length < 1){
            System.out.println("Você esqueceu o parâmetro");
            return;
        }
        Locale.setDefault(Locale.US);
        int n = Integer.parseInt(args[0]);
        Scanner sc = new Scanner(System.in);
        Float[] floats = new Float[n];
        for(int i = 0; i < n; i++){
            floats[i] = Float.parseFloat(sc.nextLine());
        }
        sc.close();
        long t1 = System.nanoTime();
        float buffer;
        for(int i = 0; i < n; i += 2){
            buffer = floats[i] + floats[i + 1];
        }
        long t2 = System.nanoTime();
        float t3 = (t2 - t1) / 1000000000f;
        System.out.printf("%f\n", t3);
    }
}
