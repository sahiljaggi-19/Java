import java.util.*;

public class fibonaaci {
    public static void main(String[] args) {
        Scanner snr = new Scanner(System.in);
        int n = snr.nextInt();
        int a = 0;
        int b = 1;
        int counter = 0;
        System.out.println(a);

        for (int i = 2; i < n; i++) {
            if (counter % 2 == 0)
                System.out.println(a + b);
            int c = a;
            a = b;
            b = c + b;
            counter++;
        }
    }
}
