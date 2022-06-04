import java.util.Random;
import java.io.*;

public class ArrayHistogram {

	public static void main(String[] args) {
		
		int scoreAmt = 100;
		int ctrAmt = 100;
		int[] randScores = randomArray(scoreAmt);
		int tableStartVal = 0;
		int[] counters = histogram(randScores, ctrAmt);
		
		for (int counter:counters) {
			System.out.printf("%2d - %d\n",tableStartVal++, counter);
		}
	}
	public static int[] randomArray(int size) {
	    Random random = new Random();
	    int[] a = new int[size];
	    for (int i = 0; i < a.length; i++) {
	        a[i] = random.nextInt(size);
	    }
	    return a;
	}
	public static int[] histogram(int[] scores, int counters) {

		int[] counts = new int[counters];
		for (int i = 0; i < scores.length; i++) {
		    int idx = scores[i];
		    counts[idx]++;
		}	
		return counts;
	}
}
