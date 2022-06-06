import java.util.*;

public class Seive {

	public static void main(String[] args) {
		display();
	}
	public static boolean [] seive(int n) {
		boolean[] primeTests = new boolean[n];
	     
	      for (int i = 0; i< primeTests.length; i++) {
	         primeTests[i] = true;
	      }
	    
	      for (int i = 2; i < Math.sqrt(n); i++) {
	         if(primeTests[i] == true) {
	            for(int j = (i * i); j < n; j = j + i) {
	               primeTests[j] = false;
	            }
	         }
	      }
	      return primeTests;
	}
	public static int randomInt(int hiRand) {
	    Random random = new Random();
	    int randInt = random.nextInt(hiRand);
	    
	    return randInt;
	}
  public static void display() {
		int randCeilingExcl = 10000;
		int randTestN = randomInt(randCeilingExcl);
		boolean [] primesTests = seive(randTestN);
		
		System.out.println("+---List of Prime Numbers from 0 to n - 1:---+");
		System.out.printf("|n= %-41d|\n", randTestN);
		
		for (int i = 2;i < primesTests.length;i++) {
			if (primesTests[i] == true) {
				System.out.printf("|%24d%21s\n", i, "|");
			}
		}
		System.out.println("+--------------------------------------------+");
	}
}
