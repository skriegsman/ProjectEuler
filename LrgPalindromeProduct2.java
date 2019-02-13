//Sam Kriegsman

/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.
*/

public class LrgPalindromeProduct2 {
  public static void main(String[] args) {
    int biggest = 0;
    for(int i = 100; i <= 999; i++) {
      for(int j = 100; j <= 999; j++) {
        if(isPalindrome(i*j) && i*j > biggest){
          biggest = i*j;
        }
      }
    }
    System.out.println(biggest);
  }

  public static boolean isPalindrome(int num) {
    String forward = Integer.toString(num);
    String reverse = "";
    for(int i = forward.length() - 1; i >= 0; i--) {
      reverse += forward.charAt(i);
    }
    if(forward.equals(reverse)) {
      return true;
    }

    return false;
  }
}

//Answer: 906609
