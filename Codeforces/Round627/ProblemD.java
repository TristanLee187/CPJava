import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class ProblemD {
    public static int search(int[] a, int key) {
        int low = 0;
        int ans = -1;
        int high = a.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] > key) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;

    }

    public static void solve() {
        Scanner input = new Scanner(new BufferedInputStream(System.in));
        int n = input.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) a[i] = input.nextInt();
        for (int i = 0; i < n; i++) b[i] = input.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = a[i] - b[i];
        }
        Arrays.sort(c);
        long ans = 0;
        for (int i = 0; i < n; i++) {
            if (c[i] > 0) {
                int thing = Arrays.binarySearch(c, -c[i] + 1);
                if (thing < 0) thing = -thing - 1;
                ans += i - thing;
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        //solve();
        int[] l = {-6, -6, 3, 4, 6, 7};
        System.out.println(Arrays.binarySearch(l, -5));
    }
}
