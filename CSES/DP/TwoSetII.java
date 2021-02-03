import java.io.*;
import java.util.*;
import java.math.*;

public class TwoSetII {
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
    static int mod = (int) Math.pow(10,9)+7;
    public static void main(String[] args) {
        int n = input.nextInt();
        int sum = n*(n+1)/2;
        if (sum%2==1) System.out.println(0);
        else {
            sum /= 2;
            long[][] dp = new long[n+1][sum+1];
            dp[0][0]=1;
            for (int i = 1; i < n+1; i++) {
                for (int j = 0; j < sum+1; j++) {
                    dp[i][j]=dp[i-1][j];
                    if (j-i>=0){
                        dp[i][j]+=dp[i-1][j-i];
                        if (dp[i][j]>=mod) dp[i][j]-=mod;
                    }
                }
            }
            BigInteger d = new BigInteger("2");
            long a = d.modInverse(new BigInteger(mod+"")).longValue();
            long ans = a*dp[n][sum] % mod;
            System.out.println(ans);

        }

    }
}