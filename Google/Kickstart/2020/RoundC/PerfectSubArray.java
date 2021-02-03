import java.io.BufferedInputStream;
import java.util.Scanner;


public class PerfectSubArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(new BufferedInputStream(System.in));
        int t = input.nextInt();
        int count = 0;
        while (count < t) {
            count++;
            int N = input.nextInt();
            int[] l = new int[N];
            for (int i = 0; i < N; i++) {
                l[i] = input.nextInt();
            }
            int point1 = 0;
            int point2 = 0;
            int ans = 0;
            while (point1 < N && point2 < N) {
                int maybe = 0;
                while (point2 < N) {
                    maybe += l[point2];
                    point2++;
                    if (maybe >= 0 && (Math.sqrt(maybe) % 1 == 0)) {
                        ans++;
                    }
                }
                point1++;
                point2 = point1;
            }
            System.out.println("Case #" + (count) + ": " + ans);
        }
    }
}



