import java.io.BufferedInputStream;
import java.util.Scanner;


public class Track {
    public static void main(String[] args) {
        Scanner input = new Scanner(new BufferedInputStream(System.in));
        int t = input.nextInt();
        int count = 0;
        while (count < t) {
            count++;
            String dirs = input.next();
            int startud = 0;
            int startlr = 0;
            int minlr = 0;
            int minud = 0;
            int maxlr = 0;
            int maxud = 0;
            for (int i = 0; i < dirs.length(); i++) {
                String comp = dirs.substring(i, i + 1);
                if (comp.equals("N")) startud++;
                else if (comp.equals("S")) startud--;
                else if (comp.equals("E")) startlr++;
                else startlr--;
                if (startlr < minlr) minlr--;
                else if (startlr > maxlr) maxlr++;
                else if (startud < minud) minud--;
                else if (startud > maxud) maxud++;
            }

            int[][] track = new int[maxud - minud + 1][maxlr - minlr + 1];
            startud = -minud;
            startlr = -minlr;
            int time = 0;
            for (int i = 0; i < dirs.length(); i++) {
                track[startud][startlr] = 1;
                String comp = dirs.substring(i, i + 1);
                if (comp.equals("N")) startud++;
                else if (comp.equals("S")) startud--;
                else if (comp.equals("E")) startlr++;
                else startlr--;
                if (track[startud][startlr] == 1) time += 1;
                else time += 5;
            }
            System.out.println(time);
        }
    }
}
