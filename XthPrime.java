//Sam Kriegsman

/*
What is the 10001st prime number?
*/

public class XthPrime {
  public static void main(String[] args) {
    int count = 0;
    int i = 0;
    while(count <= 10001) {
      i++;
      if(isPrime(i)) {count++;}
    }
    System.out.println(i);
  }

  public static boolean isPrime(int num) {
    if(num > 2 && num%2 == 0 )//Skips over all even numbers (except 2)
      return false;
    int top = (int)Math.sqrt(num) + 1; //you only need to check up to the numbers sqrt
    for(int i = 3; i < top; i+=2){
        if(num % i == 0)
            return false;
    }
    return true;
  }
}

//Answer: 104743
