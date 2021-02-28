import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class EditDistance {
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
    }

    static FastScanner input = new FastScanner();

    /*
     ************************* PUT CODE HERE *************************
     */

    public static void main(String[] args) {
        String a = input.next();
        String b = input.next();
        int n = a.length();
        int m = b.length();

        int[][] dp = new int[n + 1][m + 1];
        for (int[] row : dp) {
            Arrays.fill(row, 5000);
        }
        dp[0][0] = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i > 0) dp[i][j] = Math.min(dp[i][j], dp[i - 1][j] + 1);
                if (j > 0) dp[i][j] = Math.min(dp[i][j], dp[i][j - 1] + 1);
                if (i > 0 && j > 0)
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - 1] + (a.substring(i - 1, i).equals(b.substring(j - 1, j)) ? 0 : 1));
            }
        }
        System.out.println(dp[n][m]);
    }
}