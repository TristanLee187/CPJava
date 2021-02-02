import java.io.BufferedInputStream;
import java.util.Scanner;

public class OracAndFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(new BufferedInputStream(System.in));
        int count = 0;
        int t = input.nextInt();
        while (count < t) {
            count++;
            int n = input.nextInt();
            int k = input.nextInt();
            if (n % 2 == 0) {
                System.out.println(n + 2 * k);
            } else {
                int ans = 2;
                while (n % ans != 0) {
                    ans++;
                }
                System.out.println(n + ans + 2 * (k - 1));
            }
        }
    }
}
