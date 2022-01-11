import java.io.*;
import java.util.*;

public class Methods {
  public static void main(String[]args){
    int num1 = 0;
    int num2 = 4;
    int num3 = 7;
//Is Divisible exercise 2 call
    if (isDivisible(num1,num2))
      System.out.println("Yes");
      else
      System.out.println("No");
 //Is Triangle exercise 3 call   
    if (isTriangle(num1,num2,num3))
      System.out.println("Yes");
      else
      System.out.println("No");
 //Ackermann function exercise 8 call   
    System.out.println(ack(num1,num2));
  }
  /**
  * Tests whether 2 numbers are divisible by
  * each other regardless of the order 
  * entered.
  * @param m and n are the two integers to test
  * @return true if divisible by each other in any order. False if otherwise or if one of the digits is 0.
  *
  */
  public static boolean isDivisible(int m, int n){
    if (m == 0 || n == 0 ){
      System.err.println("You can't divide by 0");
      return false;
    }
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
  /**
  * The Ackermann Function
  * Takes two integers and recursively 
  * solves the function.
  * WARNING: ANY INTEGER IS > 0 THE MAX
  * SIZE OF THE SECOND INTEGER MUST BE 
  * LESS THAN THREE OR A STACK OVERFLOW
  * ERROR WILL OCCUR!
  * @param int m and n are the two parameters of the function.
  * @return n + 1 if m == 0, if n == 0 returns ack(m-1, n=1), otherwise returns the result of the Ackermann function ack(m, n-1) as the second argument with first argument m, as a recursive function as the second argument in the recusive call of Ackermann with m-1 as the first argument.
  */ 
  public static int ack(int m, int n){
    int result;

    if (m == 0) 
      result = n+1;
    else if (n == 0) 
      result = ack(m-1,1);
    else 
      result = ack(m-1, ack(m,n-1));

    return result;
  }
}