import java.io.*;
import java.util.*;

public class GridPaths {
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

    public static void plint(long[] a) {
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
    static int mod = (int) Math.pow(10, 9) + 7;

    public static void main(String[] args) {
        int n = input.nextInt();
        String[][] grid = new String[n][n];
        for (int i = 0; i < n; i++) {
            String s = input.next();
            for (int j = 0; j < n; j++) {
                grid[i][j] = s.substring(j, j + 1);
            }
        }
        long[][] dp = new long[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                dp[i][j] = -1;
        if (grid[0][0].equals("*")) dp[0][0] = 0;
        else dp[0][0] = 1;
        solve(n - 1, n - 1, grid, dp);
        System.out.println((int) (dp[n - 1][n - 1] % mod));
    }

    public static int solve(int row, int col, String[][] grid, long[][] dp) {
        if (dp[row][col] != -1) return 0;
        if (grid[row][col].equals("*"))
            dp[row][col] = 0;
        else if (row == 0 && col > 0) {
            solve(row, col - 1, grid, dp);
            dp[row][col] = dp[row][col - 1];
            dp[row][col] %= mod;
        } else if (col == 0 && row > 0) {
            solve(row - 1, col, grid, dp);
            dp[row][col] = dp[row - 1][col];
            dp[row][col] %= mod;
        } else {
            solve(row, col - 1, grid, dp);
            solve(row - 1, col, grid, dp);
            dp[row][col] = dp[row - 1][col] + dp[row][col - 1];
            dp[row][col] %= mod;
        }
        return 0;
    }
}
