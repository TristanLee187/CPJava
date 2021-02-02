import java.io.BufferedInputStream;
import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(new BufferedInputStream(System.in));
        String string1 = input.nextLine().toLowerCase();
        String string2 = input.nextLine().toLowerCase();
        if (string1.compareTo(string2) < 0) System.out.println(-1);
        else if (string1.compareTo(string2) > 0) System.out.println(1);
        else System.out.println(0);
    }
}
