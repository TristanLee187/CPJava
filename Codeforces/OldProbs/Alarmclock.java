import java.io.BufferedInputStream;
import java.util.Scanner;

public class Alarmclock {
    public static void main(String[] args) {
        Scanner input = new Scanner(new BufferedInputStream(System.in));
        int t = input.nextInt();
        int count = 0;
        while (count < t) {
            count++;
            long a = input.nextInt();
            long b = input.nextInt();
            long c = input.nextInt();
            long d = input.nextInt();
            if (b >= a) System.out.println(b);
            else {
                long rest = a - b;
                long each = c - d;
                if (each <= 0) System.out.println(-1);
                else {
                    if (rest % each != 0) System.out.println(b + (rest / each + 1) * c);
                    else System.out.println(b + (rest / each) * c);
                }
            }
        }
    }
}
