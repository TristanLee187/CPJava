import java.io.*;
import java.util.StringTokenizer;

public class Exponentiation {
    /*
     *************************INPUT*************************
     */
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

    static FastScanner input = new FastScanner();

    /*
     ************************* PUT CODE HERE *************************
     */
    public static void main(String[] args) {
        int m = (int) Math.pow(10, 9) + 7;
        int t = input.nextInt();
        for (int z = 0; z < t; z++) {
            long a = input.nextLong();
            int b = input.nextInt();
            long ans = 1;
            if (a == 0) {
                if (b == 0) ans = 1;
                else ans = 0;
            }
            while (b > 0) {
                if ((b & 1) == 1) {
                    ans *= a;
                    ans %= m;
                }
                b = b >> 1;
                a *= a;
                a %= m;
            }
            System.out.println(ans);

        }
    }
}
