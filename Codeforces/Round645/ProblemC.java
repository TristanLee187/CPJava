import java.io.BufferedInputStream;
import java.util.Scanner;

public class ProblemC {
    public static void main(String[] args) {
        Scanner input = new Scanner(new BufferedInputStream(System.in));
        int t = input.nextInt();
        int count = 0;
        while (count < t) {
            count++;
            int x1 = input.nextInt();
            int y1 = input.nextInt();
            int x2 = input.nextInt();
            int y2 = input.nextInt();
            System.out.println(recursiveCall(x2 - 1, y2 - 1, x1 - 1, y1 - 1, new long[x2 - x1][y2 - y1]));

        }
    }


    public static long recursiveCall(int end1, int end2, int row, int col, long[][] dp) {
        if (row == end1 - 1 && col == end2 - 1) return 1;
        if (dp[row][col] == 0) {
            if (row == end1 - 1) dp[row][col] = recursiveCall(end1, end2, row, col + 1, dp);
            else if (col == end2 - 1) dp[row][col] = recursiveCall(end1, end2, row + 1, col, dp);
            else
                dp[row][col] = recursiveCall(end1, end2, row + 1, col, dp) + recursiveCall(end1, end2, row, col + 1, dp);
        }
        return dp[row][col];
    }
}
