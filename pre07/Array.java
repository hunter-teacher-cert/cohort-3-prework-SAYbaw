import java.io.*;
import java.util.*;

public class Array{
  public static void main(String[] args){
    double nums1[] = new double [10];
    for(int i = 0; i < nums1.length;i++){
      nums1[i] = i + 1;
    }
    for(double num : nums1)
      System.out.println(num);

    double nums2[] = new double [10];
    for(int i = 0; i < nums2.length;i++){
      nums2[i] = i + 2;
    }
    for(double num : nums2)
      System.out.println(num);

    double squares[] = powArray(nums1);
    for(int i = 0;i < squares.length;i++)
      System.out.println(squares[i]);
    
    double powers[] = powArray(nums2,3);
    for(int i = 0; i < powers.length;i++)
      System.out.println(powers[i]);
  }
  public static double[] powArray(double a[]){
    double squares[] = new double [a.length];
    for(int i = 0;i < a.length;i++){
      squares[i] = a[i] * a[i];
    }
    return squares;
  }
  public static double[] powArray(double a[], int b){
    double powers[] = new double [a.length];
    for(int i = 0;i < powers.length;i++){
      powers[i] = 1;
    }
    int i;
    int j;
    for(i = 0;i < a.length;i++){
      for(j = 0;j < b;j++){
        powers[i] *= a[i];
      }
    }
    return powers;
  }
}