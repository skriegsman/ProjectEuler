//Sam Kriegsman

/*
The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.
*/

public class LngCollatzSeq {
  public static void main(String[] args) {
    double longest = 0;
    int chainLength = 0;
    for(double i = 13; i < 1000000; i++) {
      int count = 1;
      double temp = i;
      while(temp != 1) {
        temp = evaluate(temp);
        count++;
      }
      if(count > chainLength) {
        longest = i;
        chainLength = count;
        System.out.println(longest+" had a chain length of "+chainLength);
      }
    }
    System.out.println("FINAL: "+longest+" had a chain length of "+chainLength);
  }

  public static double evaluate(double num) {
    if(num % 2 == 0) {
      return num/2;
    }
    return (3*num) + 1;
  }
}

/*
OUTPUT:
13.0 had a chain length of 10
14.0 had a chain length of 18
18.0 had a chain length of 21
25.0 had a chain length of 24
27.0 had a chain length of 112
54.0 had a chain length of 113
73.0 had a chain length of 116
97.0 had a chain length of 119
129.0 had a chain length of 122
171.0 had a chain length of 125
231.0 had a chain length of 128
313.0 had a chain length of 131
327.0 had a chain length of 144
649.0 had a chain length of 145
703.0 had a chain length of 171
871.0 had a chain length of 179
1161.0 had a chain length of 182
2223.0 had a chain length of 183
2463.0 had a chain length of 209
2919.0 had a chain length of 217
3711.0 had a chain length of 238
6171.0 had a chain length of 262
10971.0 had a chain length of 268
13255.0 had a chain length of 276
17647.0 had a chain length of 279
23529.0 had a chain length of 282
26623.0 had a chain length of 308
34239.0 had a chain length of 311
35655.0 had a chain length of 324
52527.0 had a chain length of 340
77031.0 had a chain length of 351
106239.0 had a chain length of 354
142587.0 had a chain length of 375
156159.0 had a chain length of 383
216367.0 had a chain length of 386
230631.0 had a chain length of 443
410011.0 had a chain length of 449
511935.0 had a chain length of 470
626331.0 had a chain length of 509
837799.0 had a chain length of 525
FINAL: 837799.0 had a chain length of 525
*/
