//Sam Kriegsman

/*
By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
*/

public class EvenFibNum {
  public static void main(String[] args) {
    int num1 = 1;
    int num2 = 1;
    int sum = 0;

    while(num2 <= 4000000) {
      int nextnum = num1 + num2;
      
      if(nextnum % 2 == 0){
        sum += nextnum;
      }

      num1 = num2;
      num2 = nextnum;
    }

    System.out.println(sum);
  }
}

//Answer: 4613732
