//Sam Kriegsman

/*
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
Find the sum of all the primes below two million.
*/

public class SummationOfPrimes {
  public static void main(String[] args) {
    Long sum = 0L;
    for(int i = 2; i <= 2000000; i++){
      if(isPrime(i))
        sum += i;
        System.out.println("NewestPrime: " + i + "   CurrentSum: " + sum);
    }
    System.out.println("FinalSum: " + sum);
  }

  public static boolean isPrime(int num) {
    if ( num > 2 && num%2 == 0 )//Skips over all even numbers (except 2)
      return false;
    int top = (int)Math.sqrt(num) + 1; //you only need to check up to the numbers sqrt
    for(int i = 3; i < top; i+=2){
        if(num % i == 0)
            return false;
    }
    return true;
  }
}

//Answer: 142913828922
