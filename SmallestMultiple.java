//Sam Kriegsman

/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

public class SmallestMultiple {
  public static void main(String[] args) {
    for(int i = 20; i > 1; i += 20) {
      if((i%11) + (i%12) + (i%13) + (i%14) + (i%15) + (i%16) + (i%17) + (i%18) + (i%19) == 0) {
        System.out.println(i);
        break;
      }
    }
  }
}

//Answer: 232792560
