import java.io.BufferedInputStream;
import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(new BufferedInputStream(System.in));
        String string = input.nextLine();
        String ans = "";
        for (int i = 0; i < string.length(); i++) {
            if (!("aeiouy".contains(string.substring(i, i + 1).toLowerCase()))) {
                ans += "." + string.substring(i, i + 1).toLowerCase();
            }
        }
        System.out.println(ans);

    }
}
