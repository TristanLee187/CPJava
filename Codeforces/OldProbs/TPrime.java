import java.io.BufferedInputStream;
import java.util.Scanner;

public class TPrime {
    public static boolean isPrime(int x) {
        if (x == 1) return false;
        for (int i = 2; i <= Math.pow(x, 0.5); i++) {
            if (x % i == 0) return false;
        }
        return true;
    }

    public static void solve() {
        Scanner input = new Scanner(new BufferedInputStream(System.in));
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            long thing = input.nextLong();
            double root = Math.pow(thing, 0.5);
            if (root == (int) root && isPrime((int) root)) System.out.println("YES");
            else System.out.println("NO");

        }

    }

    public static void main(String[] args) {
        solve();
    }
}
