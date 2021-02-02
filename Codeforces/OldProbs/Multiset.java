import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.Scanner;


public class Multiset {
    public static void main(String[] args) {
        Scanner input = new Scanner(new BufferedInputStream(System.in));
        ArrayList nums = new ArrayList<Integer>();
        int n = input.nextInt();
        int qs = input.nextInt();
        for (int i = 0; i < n; i++) {
            nums.add(input.nextInt());
        }
        int count = 0;
        while (count < qs) {
            count++;
            int next = input.nextInt();
            if (next < 0)
                nums.remove(Math.abs(next) - 1);
            else
                nums.add(next);
        }
        if (nums.size() != 0) System.out.println(nums.get(0));
        else System.out.println(0);
    }
}
