import java.io.*;
import java.util.*;

public class Celsius {

  public static void main ( String[]args){

    Scanner in = new Scanner(System.in);
    int cTemp = 0;
    double fTemp = 0.0;

    System.out.print("Enter a temperature in Celsius: ");
    cTemp = in.nextInt();
    fTemp = convToF(cTemp);

    System.out.printf("%d degrees Celsius is %.1f degrees Fahrenheit\n", cTemp, fTemp);





  }

  public static double convToF (int cel){

      double fahr = 0.0;

      fahr = ((double) cel * 9.0 )/ 5.0 + 32;

      return fahr;
  }
}