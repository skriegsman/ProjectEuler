//Sam Kriegsman

/*
Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down,
there are exactly 6 routes to the bottom right corner.

How many such routes are there through a 20×20 grid?
*/

/*
NOTE: At the start, there are only two possible paths for every node up until you reach the
border of the grid, then you have to start making your way back to the bottom corner.

NOTE: No matter what path you choose, there must always be 20 moves down and 20 moves right in that path.
*/
import java.math.BigInteger;

public class LatticePaths {
  public static void main(String[] args) {
    int gridSize = 20;
    System.out.println(combinations(gridSize*2, gridSize).toString());
  }
  public static BigInteger combinations(int n, int r) {
    return factorial(n).divide(factorial(n-r).multiply(factorial(r)));
  }

  public static BigInteger factorial(int n) {
    BigInteger one = BigInteger.ONE;
    BigInteger val = BigInteger.valueOf(n);
    if(n == 1)
      return one;
    else
      return val.multiply(factorial(n-1));
  }
}

//Answer: 137846528820
