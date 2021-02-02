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
            int[][] board = new int[x2 - x1][y2 - y1];
            int start1 = x1 * (x1 + 1) / 2;
            start1 += x1 * (y1 - 1) + (y1 - 2) * (y1 - 1) / 2;
            int add = start1;

            for (int i = 0; i < x2 - x1; i++) {
                for (int j = 0; j < y2 - y1; j++) {
                    board[i][j] = add;
                    add += x1 + y1 + j - 1;
                }
                start1 += x1 + 1;
                add = start1;
            }
            System.out.println(recursiveCall(x2 - x1, y2 - y1, 0, 0, new int[x2 - x1][y2 - y1], board));

        }
    }

    public static int recursiveCall(int end1, int end2, int x, int y, int[][] dp, int[][] board) {
        if (x == end1 && y == end2) return 1;
        else

    }
}
