import java.math.BigInteger;

public class Problem16 {
    public static void main(String[] args) {
        BigInteger wtf = new BigInteger("1");
        for (int i = 0; i < 1000; i++) {
            wtf = wtf.multiply(new BigInteger("2"));
        }

        BigInteger ans = new BigInteger("0");
        while (wtf.compareTo(new BigInteger("0")) > 0) {
            ans = ans.add(wtf.mod(new BigInteger("10")));
            wtf = wtf.divide(new BigInteger("10"));
        }
        System.out.println(ans);
    }
}
