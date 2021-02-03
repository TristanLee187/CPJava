import java.io.BufferedInputStream;
import java.util.Scanner;

public class Workout {
    public static int maxindex(int[] a) {
        int index = 0;
        for (int j = 0; j < a.length; j++) {
            if (a[j] > a[index]) index = j;
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(new BufferedInputStream(System.in));
        int T = input.nextInt();
        for (int i = 0; i < T; i++) {
            int N = input.nextInt();
            int K = input.nextInt();
            int[] set = new int[N];
            for (int j = 0; j < N; j++) set[j] = input.nextInt();

            int[] dif = new int[N - 1 + K];
            for (int j = 0; j < N - 1; j++) {
                dif[j] = set[j + 1] - set[j];
            }
            while (K > 0) {
                int index = maxindex(dif);
                int temp = dif[index];
                dif[index] /= 2;
                dif[N - 2 + K] = temp - dif[index];
                K--;
            }
            System.out.println("Case #" + (i + 1) + ": " + dif[maxindex(dif)]);
        }
    }
}
