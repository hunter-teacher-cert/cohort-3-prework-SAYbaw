import java.io.*;
import java.util.*;

public class Methods {
  public static void main(String[]args){
    int num1 = 7;
    int num2 = 7;
    int num3 = 7;

    if (isDivisible(num1,num2))
      System.out.println("Yes");
      else
      System.out.println("No");
    
    if (isTriangle(num1,num2,num3))
      System.out.println("Yes");
      else
      System.out.println("No");
  }
  /**
  * Tests whether 2 numbers are divisible by
  * each other regardless of the order 
  * entered.
  * @param m and n are the two integers to test
  * @return true if divisible by each other in any order. False if otherwise.
  *
  */
  public static boolean isDivisible(int m, int n){
    if (m % n == 0 || n % m == 0)
      return true;
      else
      return false;
  }
  /**
  * Tests whether 3 lengths can form a 
  * triangle
  * @param m, n and o are the three integers to test
  * @return false if any one length is greater than the sum of the other two. True if otherwise.
  *
  */
  public static boolean isTriangle(int m, int n, int o){
    if (o > (m + n) || m > (n + o) || n > (o + m))
      return false;
      else
      return true;
  }
}