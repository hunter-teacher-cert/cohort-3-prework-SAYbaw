import java.io.*;
import java.util.*;

public class Methods {
  public static void main(String[]args){
    int num1 = 7;
    int num2 = 3;

    if (isDivisible(num1,num2))
      System.out.println("Yes");
      else
      System.out.println("No");
  }
  public static boolean isDivisible(int m, int n){
    if (m % n == 0 || n % m == 0)
      return true;
      else
      return false;
  }
}