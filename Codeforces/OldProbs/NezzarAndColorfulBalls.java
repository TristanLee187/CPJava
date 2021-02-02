import java.io.*;
import java.util.*;

public class NezzarAndColorfulBalls {
    public static void main(String[] args) {
        FastScanner input = new FastScanner();
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            int[] l = input.rlint(n);
            testCase(n, l);
        }
    }

    public static void testCase(int n, int[] l) {
        int[] a = new int[n + 1];
        for (int i = 0; i < n; i++) {
            a[l[i]] += 1;
        }
        int ans = 0;
        for (int i = 0; i < n + 1; i++) {
            ans = Math.max(ans, a[i]);
        }
        System.out.println(ans);
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int[] rlint(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }

        long[] rllong(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }
    }
}
