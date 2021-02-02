import java.io.BufferedInputStream;
import java.util.Scanner;

public class ProblemC {
    public static void main(String[] args) {
        Scanner input = new Scanner(new BufferedInputStream(System.in));
        int n = input.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[input.nextInt() - 1] = i;
        }
        for (int i = 0; i < n; i++) {
            b[input.nextInt() - 1] = i;
        }

        int[] c = new int[n];

        for (int i = 0; i < n; i++) {
            c[i] = a[i] - b[i];
            if (c[i] == n - 1) c[i] = -1;
            else if (c[i] == -(n - 1)) c[i] = 1;
        }

        int[] d = new int[2 * n];
        for (int i : c) {
            if (i >= 0) {
                d[i]++;
            } else {
                d[i + n]++;
            }
        }

        int ans = 0;
        for (int i : d) {
            if (i > ans) ans = i;
        }

        System.out.println(ans);
    }
}



