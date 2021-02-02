import java.io.*;
import java.util.Scanner;

public class CowGymnastics {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(new BufferedInputStream(System.in));
        int k = input.nextInt();
        int n = input.nextInt();
        int[][] comps = new int[n][n];
        int ans = 0;
        for (int i = 0; i < k; i++) {
            int[] row = new int[n];
            for (int ii = 0; ii < n; ii++) row[ii] = input.nextInt();
            for (int ii = 0; ii < n; ii++) {
                for (int j = ii + 1; j < n; j++) {
                    comps[row[ii] - 1][row[j] - 1]++;
                }
            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (comps[i][j] == k) ans++;
            }
        }

        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("gymnastics.out")));
        pw.println(ans);
        pw.close();
    }
}
