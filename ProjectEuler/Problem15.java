public class Problem15 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(recursiveCall(n, 0, 0, new long[n][n]));
    }

    public static long recursiveCall(int n, int row, int col, long[][] dp) {
        if (row == n - 1 && col == n - 1) return 1;
        if (dp[row][col] == 0) {
            if (row == n - 1) dp[row][col] = recursiveCall(n, row, col + 1, dp);
            else if (col == n - 1) dp[row][col] = recursiveCall(n, row + 1, col, dp);
            else dp[row][col] = recursiveCall(n, row + 1, col, dp) + recursiveCall(n, row, col + 1, dp);
        }
        return dp[row][col];
    }
}
