//Sam Kriegsman

/*
The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?

Python Solution: https://stackoverflow.com/questions/14138053/project-euler-3-with-python-most-efficient-method
n = 600851475143
i = 2
while i * i < n:
    while n % i == 0:
        n = n / i
    i = i + 1
print n
*/

public class LrgPrimeFactor2 {
  public static void main(String[] args) {
    long num = 600851475143L;
    int i = 2;

    while(i * i < num) { //Only check up to the numbers square root
      while(num % i == 0) { //divide out i until you cant. For example it will divide out as many 2's as it can, then it will divide out all the 3's and 4's
        num /= i;
      }
      i++;
    }

    System.out.println(num); //The final number will be the largest prime because you already divided out the smaller primes
  }
}

//Answer: 6857
