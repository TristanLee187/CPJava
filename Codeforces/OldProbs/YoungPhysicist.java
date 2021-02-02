import java.io.BufferedInputStream;
import java.util.Scanner;

public class YoungPhysicist {
    public static void main(String[] args) {
        Scanner input = new Scanner(new BufferedInputStream(System.in));
        int sumx = 0;
        int sumy = 0;
        int sumz = 0;
        int trash = input.nextInt();
        for (int i = 0; i < trash * 3; i++) {
            if (i % 3 == 0) sumx += input.nextInt();
            else if (i % 3 == 1) sumy += input.nextInt();
            else sumz += input.nextInt();
        }
        if (sumx == 0 && sumy == 0 && sumz == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}
