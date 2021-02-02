import java.io.BufferedInputStream;
import java.util.Scanner;

public class Joker {
    public static void main(String[] args) {
        Scanner input = new Scanner(new BufferedInputStream(System.in));
        int n = input.nextInt();
        int[][] seats = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                seats[i][j] = 3 * i + j + 1;
            }
        }
        int count = 0;
        while (count < n * n) {
            count++;
            int move = input.nextInt();

        }
