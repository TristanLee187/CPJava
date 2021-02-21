import java.io.*;
import java.util.*;

public class SumOfTwo {
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
        int x = input.nextInt();
        int[] a = input.rlint(n);
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            h.put(a[i], i+1);
        }
        Arrays.sort(a);

        boolean ans = false;
        int[] nums = new int[2];
        int i = 0;
        int j = n - 1;
        while (i < j) {
            int test = a[i] + a[j];
            if (test == x) {
                ans = true;
                nums[0] = a[i];
                nums[1] = a[j];
                break;
            } else if (test < x) i++;
            else j--;
        }
        if (ans) {
            String pans = "";
            pans += h.get(nums[0]) + " ";
            pans += h.get(nums[1]);
            System.out.println(pans);
        } else System.out.println("IMPOSSIBLE");
    }
}