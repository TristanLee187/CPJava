import java.io.BufferedInputStream;
import java.util.Scanner;


public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(new BufferedInputStream(System.in));
        int t = input.nextInt();
        int count = 0;
        while (count < t) {
            count++;
            int ans = 0;
            int c = input.nextInt();
            int d = input.nextInt();
            int[] vals = new int[c + 1];
            vals[0] = 0;
            for (int i = 1; i <= c; i++) {
                vals[i] = input.nextInt();
            }
            for (int i = 0; i < d; i++) {
                String move = input.next();
                int first = input.nextInt();
                int second = input.nextInt();
                if (move.equals("U")) {
                    vals[first] = second;
                } else {
                    int co = 1;
                    for (int j = first; j <= second; j++) {
                        ans += vals[j] * co;
                        if (co > 0) co = -(co + 1);
                        else co = -(co - 1);
                    }
                }
            }


            System.out.println("Case #" + (count) + ": " + ans);
        }
    }
}
