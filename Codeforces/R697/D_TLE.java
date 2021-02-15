import java.io.*;
import java.util.*;

public class D {
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
        int n= input.nextInt();
        int m = input.nextInt();
        int[] a = input.rlint(n);
        int[] b = input.rlint(n);
        int[] dp = new int[2*(n+1)];
        for (int i = 0; i < n; i++) {
            for (int j = dp.length-1; j >-1 ; j--) {
                if (j+b[i]<dp.length){
                    dp[j+b[i]]=(int) Math.max(dp[j+b[i]],dp[j]+a[i]);
                }
            }
        }
        int ans=-1;
        for (int i = 0; i < dp.length; i++) {
            if (dp[i]>=m){
                ans=i;
                break;
            }
        }
        System.out.println(ans);
        System.out.println(Arrays.toString(dp));

    }
}
