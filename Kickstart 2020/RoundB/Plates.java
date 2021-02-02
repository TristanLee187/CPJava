import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(new BufferedInputSystem(System.in));
        int T = input.nextInt();
        for (int i = 0; i < T; i++) {
            int N = input.nextInt();
            int K = input.nextInt();
            int P = input.nextInt();
            int sum = 0;
            int[][] stacks = new int[N][K];
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < K; k++) {
                    stacks[j][k] = input.nextInt();
                }
            }
            
        }
    }
}
