import java.io.*;
import java.util.*;

public class NoMoreInversions {
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
    public static void main(String[] args) {
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {
            testCase();
        }
    }

    public static void testCase() {
        int n = input.nextInt();
        int k = input.nextInt();
        int[] ans = new int[k];
        int i = 1;
        for (int j = 0; j < 2 * k - n - 1; j++) {
            ans[j] = i;
            i++;
        }
        for (int j = k - 1; j >= 2 * k - n - 1; j--) {
            ans[j] = i;
            i++;
        }
        plint(ans);
    }
}
