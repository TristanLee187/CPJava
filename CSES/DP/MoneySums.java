import java.io.*;
import java.util.*;

public class MoneySums {
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
     *************************OUTPUT*************************
     */

    public static void plist(String[] a) {
        for (String i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void plint(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void plong(long[] a) {
        for (long i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void YN(boolean yn) {
        if (yn) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    /*
     ************************* PUT CODE HERE *************************
     */
    public static void main(String[] args) {
        int n = input.nextInt();
        int[] coins = input.rlint(n);
        int x = Arrays.stream(coins).sum();
        boolean[][] dp = new boolean[n+1][x+1];
        dp[0][0]=true;
        for (int i = 1; i < n+1; i++) {
            for (int j = 0; j < x+1; j++) {
                dp[i][j] = dp[i][j] || dp[i-1][j];
                if (j-coins[i-1]>=0) dp[i][j] = dp[i][j] || dp[i-1][j-coins[i-1]];
            }
        }
        int ans =0;
        for (boolean i:dp[n]) {
            if (i) ans++;
        }
        System.out.println(ans-1);
        int[] pans = new int[ans-1];
        int j=0;
        for (int i = 1; i < x+1; i++) {
            if (dp[n][i]) pans[j++]=i;
        }
        plint(pans);
    }
}
