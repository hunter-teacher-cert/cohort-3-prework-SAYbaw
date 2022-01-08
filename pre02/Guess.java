import java.io.*;
import java.util.*;

public class Guess {

  public static void main ( String[]args){

    Scanner in = new Scanner(System.in);
    Random random = new Random();
    int number = random.nextInt(100) + 1;
    int guess = 0;
    int error = 0;
    

    System.out.print("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?\nType a Number: ");
    guess = in.nextInt();
    error = Math.abs(number - guess);

    System.out.printf("Your guess is: %d\nThe number I was thinking of is: %d\nYou were off by: %d\n", guess, number, error);





  }
}