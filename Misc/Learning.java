import java.io.*;
import java.util.*;

public class Learning {
    public static void main(String[] args) {
        FastScanner input = new FastScanner();
        int[][] grid = new int[2][5];
        for (int i = 0; i < 2; i++) {
            grid[i] = input.readList(5);
        }
        for (int i = 0; i < 2; i++) {
            plint(grid[i]);
        }
    }

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

        int[] readList(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }
    }

    public static void plint(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
