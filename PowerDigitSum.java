//Sam Kriegsman

/*
2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
What is the sum of the digits of the number 2^1000?
*/
import java.lang.Math;
import java.math.BigInteger;

public class PowerDigitSum {
  public static void main(String[] args) {
    BigInteger num = new BigInteger("2");
    String n = num.pow(1000).toString();
    int count = 0;
    for(int i = 0; i < n.length(); i++) {
      count += Character.getNumericValue(n.charAt(i));
    }
    System.out.println(count);
  }
}

//Answer: 1366
