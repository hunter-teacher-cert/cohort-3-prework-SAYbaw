import java.io.*;
import java.util.*;

public class Methods {
//global variable used for tracing
  //public static int methodCt = 0;
  
  public static void main(String[]args){
    int num1 = 3;
    int num2 = 5;
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
  * WARNING: IF ANY INTEGER IS > 0 THE MAX
  * SIZE OF THE FIRST INTEGER MUST BE 
  * LESS THAN FOUR OR A STACK OVERFLOW
  * ERROR WILL OCCUR!
  * @param int m and n are the two parameters of the method.
  * @return n + 1 if m == 0, if n == 0 returns ack(m-1, n=1), otherwise returns the result of the Ackermann method 
  ack(m, n-1) as the second argument with first argument m, as a recursive method as 
  the second argument in the recusive call of Ackermann with m-1 as the first argument.
  */ 
  public static int ack(int m, int n){
    //used for tracing/debugging
    //System.out.println(methodCt);
    //methodCt++;
    int ackermann;

    if (m == 0) 
      ackermann = n+1;
    else if (n == 0) 
      ackermann = ack(m-1,1);
    else 
      ackermann = ack(m-1, ack(m,n-1));

    return ackermann;
  }
}