import java.io.*;
import java.util.*;

public class B {
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
        int n = input.nextInt();
        int q = input.nextInt();
        String s = input.next();
        int[] pre = eval(s);
        StringBuilder rs = new StringBuilder(s);
        rs.reverse();
        int[] suff = eval(rs.toString());
        for (int i = 0; i < q; i++) {
            int l = input.nextInt();
            int r = input.nextInt();
            System.out.println(pre[l - 1] + suff[n - r]);
        }
    }

    public static int[] eval(String s) {
        int[] ans = new int[s.length() + 1];
        HashMap<Character, Character> l = new HashMap<Character, Character>();
        HashSet<Character> stack = new HashSet<Character>();
        for (int j = 1; j < s.length() + 1; j++) {
            int i = j - 1;
            if (!l.containsKey(s.charAt(i))) {
                l.put(s.charAt(i), s.charAt(i));
                ans[j] = ans[j - 1] + 1;
                for (char ch : stack) {
                    if (l.get(ch) > s.charAt(i)) l.put(ch, s.charAt(i));
                }
                stack.add(s.charAt(i));
            } else {
                if (l.get(s.charAt(i)) < s.charAt(i)) {
                    ans[j] = ans[j - 1] + 1;
                    l.put(s.charAt(i), s.charAt(i));
                } else {
                    ans[j] = ans[j - 1];
                    l.put(s.charAt(i), s.charAt(i));
                }
                for (char ch : stack) {
                    if (l.get(ch) > s.charAt(i)) l.put(ch, s.charAt(i));
                }
            }
        }
        return ans;
    }
}
