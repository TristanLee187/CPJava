import java.io.BufferedInputStream;
import java.util.Scanner;

public class ProblemC {
    public static void main(String[] args) {
        Scanner input = new Scanner(new BufferedInputStream(System.in));
        int t = input.nextInt();
        int count = 0;
        while (count < t) {
            count++;
            int n = input.nextInt();
            int m = input.nextInt()
            int[][] grid = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    grid[i][j] = input.nextInt();
                }
            }

        }
