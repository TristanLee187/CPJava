import java.io.*;
import java.util.*;

public class RestaurantCustomers {
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
        int[] p = new int[2*n];
        HashSet<Integer> start = new HashSet<Integer>();
        HashSet<Integer> end = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            int a= input.nextInt();
            int b=input.nextInt();
            p[i]=a;
            p[n+i]=b;
            start.add(a);
            end.add(b);
        }
        Arrays.sort(p);
        int ans=0;
        int sum=0;
        for (int i = 0; i < 2*n; i++) {
            if (start.contains(p[i])) sum+=1;
            else sum-=1;
            ans = Math.max(ans, sum);
        }
        System.out.println((int)ans);
    }
}
