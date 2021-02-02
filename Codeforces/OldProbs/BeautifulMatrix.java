import java.io.BufferedInputStream;
import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(new BufferedInputStream(System.in));
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (input.nextInt() == 1) {
                    System.out.println((Math.abs(2 - i) + Math.abs(2 - j)));
                }
            }
        }
    }
}
