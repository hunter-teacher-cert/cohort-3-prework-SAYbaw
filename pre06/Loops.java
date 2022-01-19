public class Loops{
  public static void main(String[] args){
    System.out.println(squareRoot(8.0));

  }
  public static double squareRoot(double n){
    final double DIFF = .0001;
    double guess = n/2;
    double testDiff = 1;
    double oldGuess = 0.0;

    do {
      oldGuess = guess;
      guess = (guess + n/guess) / 2; 
      testDiff = Math.abs(guess - oldGuess);
    }while (testDiff > DIFF);
    
    return guess;
  

  }
}