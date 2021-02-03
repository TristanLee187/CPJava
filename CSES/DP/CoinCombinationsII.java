import java.io.*;
import java.util.*;

public class CoinCombinationsII {
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

        int[] rlint(int n) {
            int[] a = new int[n];
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

    static int mod = (int) Math.pow(10, 9) + 7;

    public static void main(String[] args) {
        int n = input.nextInt();
        int x = input.nextInt();
        int[] coins = input.rlint(n);
        long[] dp = new long[x + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int j = 0; j < x + 1; j++) {
                if (j - coin >= 0) {
                    dp[j] += dp[j - coin];
                    if (dp[j] >= mod) dp[j] -= mod;
                }
            }
        }
        System.out.println(dp[x]);
    }
}
