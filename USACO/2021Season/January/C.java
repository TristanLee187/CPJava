import java.io.*;
import java.util.*;

public class C {
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
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            grid[i] = input.rlint(n);
        }
        long hans = 0;
        for (int i = 0; i < n; i++) {
            long a = 0;
            long b = 0;
            for (int j = 0; j < n; j++) {
                if (j % 2 == 0) a += grid[i][j];
                else b += grid[i][j];
            }
            hans += Math.max(a, b);
        }
        long vans = 0;
        for (int i = 0; i < n; i++) {
            long a = 0;
            long b = 0;
            for (int j = 0; j < n; j++) {
                if (j % 2 == 0) a += grid[j][i];
                else b += grid[j][i];
            }
            vans += Math.max(a, b);
        }
        System.out.println((int) Math.max(hans, vans));
    }
}
