import java.util.Random;

public class Max {

	public static void main(String[] args) {
		display();
	
	}
	public static int[] randomArray(int size, int hiRand) {
	    Random random = new Random();
	    int[] randArr = new int[size];
	    for (int i = 0; i < randArr.length; i++) {
	        randArr[i] = random.nextInt(hiRand);
	    }
		
	    return randArr;
	}
	public static int indexOfMax(int []arr) {
		int max = 0;
		int maxIdx = 0;
		
		for(int i = 0;i < arr.length;i++) {
			if (arr[i] > max) {
				max = arr[i];
				maxIdx = i;
			}
		}
		return maxIdx;
	}
	public static void display() {
		
		int randCeilingExcl = 100;
		int arraySize = 10;
		int [] randArray = randomArray(arraySize,randCeilingExcl);
		
		
		System.out.println("+----List of Random Integers----+");
		
		for (int eachInt:randArray) {
			System.out.printf("|%17d%15s\n", eachInt, "|");
		}
		System.out.println("+-------------------------------+");
		System.out.printf("|%15s%2d%15s\n", "Max Value: ",
                      randArray[indexOfMax(randArray)], "|");
		System.out.printf("|%15s%2d%15s\n", "Array Index: ",
                      indexOfMax(randArray), "|");
		System.out.println("+-------------------------------+");
	}

}