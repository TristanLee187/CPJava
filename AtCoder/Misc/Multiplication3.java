import java.io.BufferedInputStream;
import java.util.Scanner;

public class Multiplication3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(new BufferedInputStream(System.in));
        long t = input.nextLong();
        double b = input.nextDouble();
        System.out.println((long) (t * b));
    }
}
