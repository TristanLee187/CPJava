import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class ProblemC2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(new BufferedInputStream(System.in));
        int t = input.nextInt();
        for (int z = 0; z < t; z++) {
            int n = input.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = input.nextInt();
                b[i] = a[i];
            }
            Arrays.sort(b);
            int ans = 0;
            int i = 0;
            int j = n - 1;
            for (int e : b) {
                if (e != -1) {
                    if (e == a[i]) {
                        i++;
                    } else {
                        if (e == a[j]) {
                            j--;
                        } else {
                            while (a[i] != e) {
                                b[Arrays.binarySearch(b, a[i])] = -1;
                                i++;
                                ans = i;
                            }
                            i++;
                        }
                    }
                }
            }
            System.out.print(ans);
        }
    }
}




