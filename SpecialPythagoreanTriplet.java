//Sam Kriegsman

/*
There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
*/

public class SpecialPythagoreanTriplet {
  public static void main(String[] args) {
    for (int a = 1; a <= 500; a++) {
      for (int b = a + 1; b <= (1000 - a) / 2; b++) {
          int c = 1000 - a - b;
          if(a < c && b < c && a*a + b*b == c*c) {
            System.out.println(a * b * c);
          }
      }
    }
  }
}

//Answer: 31875000
