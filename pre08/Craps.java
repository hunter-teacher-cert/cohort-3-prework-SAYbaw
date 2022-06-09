import java.util.*;

public class Craps {

	public static void main(String[] args) {
		dispGreeting();
		dispGoodbye();		
	}
	public static int roll(int n) {
		Random random = new Random();
	  	int dieRoll = random.nextInt(n) + 1;
		return dieRoll;
	}
	public static int shoot(int dice, int sides) {
		int result = 0;
		
		for (int i = 0;i < dice;i++) {
			int intmResult = roll(sides);
			result += intmResult;
			
			if (sides == 6) {
				drawDie(intmResult);
			}
		}
		return result;
	}
	public static String [] round() {
		int roundCt = getUserInput();
		int dieSides = 6;
		int dieAmt = 2;
		int pointRoll;
		String roundScores[] = new String [roundCt];
		
		for(int i = 0;i < roundCt;i++) {
			dispRoundHeader(i);
			int point = shoot(dieAmt, dieSides);
			System.out.printf("Rolled %s %-2d      \n", 
					(point == 8 || point == 11) ? "an" : "a", point);
			
			if (point == 7 || point == 11) {
				roundScores[i] = "Winna!";
				dispNatWin();	
			}
			else if (point == 2 || point == 3 || point == 12) {
				roundScores[i] = "Looza!";
				dispCrapsLoss();
			}
			else {
				dispPoint(point);
				do {
					pointRoll = shoot(dieAmt, dieSides);
					System.out.printf("Rolled %s %-2d      \n", 
							(pointRoll == 8 || pointRoll == 11) ? "an" : "a", pointRoll);
				 
					if (pointRoll == point) {
						roundScores[i] = "Winna!";
						dispPointWin();
						break;
					}
				} while (pointRoll != 7);
						
				if (pointRoll == 7) {
					roundScores[i] = "Looza!";
					dispCrapOutLoss();		
				}
			}
			dispRoundFooter(i);
			scoreBoard(roundCt, roundScores);
		}
		return roundScores;	
	}
	public static int getUserInput(){
		Scanner numGrabber = new Scanner(System.in);
		int roundAmt = 0;
		try {
			do {
				System.out.print("How many rounds do you want to play?: ");
				roundAmt = numGrabber.nextInt();
			} while(roundAmt <= 0);
		} catch (Exception e) {
			System.out.println("YOU MUST ENTER AN INTEGER 1 OR ABOVE! PLEASE RESTART CRAPS GAME.");
      			System.exit(0);
		}
		System.out.println();
		return roundAmt;
	}
	public static void scoreBoard(int roundNum, String [] results) {
		System.out.println("+----Craps+Scores---+");
		System.out.println("|  Round  |  Result |");
		System.out.println("+---------+---------+");
		
		for (int i = 0;i < roundNum;i++) {
			
			if(results[i] != null) {
				System.out.printf("|%6d   |  %6s |\n", i + 1, results[i]);
			}
		}
		System.out.println("+---------+---------+");
	}
	public static void drawDie(int n) {
		
		if (n == 1) {
			System.out.println("+-------+");
			System.out.println("|       |");
			System.out.println("|   o   |");
			System.out.println("|       |");
			System.out.println("+-------+");
		}
		else if (n == 2) {
			System.out.println("+-------+");
			System.out.println("|     o |");
			System.out.println("|       |");
			System.out.println("| o     |");
			System.out.println("+-------+");
		}
		else if (n == 3) {
			System.out.println("+-------+");
			System.out.println("|     o |");
			System.out.println("|   o   |");
			System.out.println("| o     |");
			System.out.println("+-------+");
		}
		else if (n == 4) {
			System.out.println("+-------+");
			System.out.println("| o   o |");
			System.out.println("|       |");
			System.out.println("| o   o |");
			System.out.println("+-------+");
		}
		else if (n == 5) {
			System.out.println("+-------+");
			System.out.println("| o   o |");
			System.out.println("|   o   |");
			System.out.println("| o   o |");
			System.out.println("+-------+");
		}
		else if (n == 6) {
			System.out.println("+-------+");
			System.out.println("| o   o |");
			System.out.println("| o   o |");
			System.out.println("| o   o |");
			System.out.println("+-------+");
		}
		else {
			System.out.println(n + " in not a valid die.");
		}
	}
	public static void dispRoundHeader(int round) {
		System.out.println("*********************");
		System.out.printf("*      Round %-3d    *\n", round +1);
		System.out.println("*********************");
	}
	public static void dispRoundFooter(int round) {
		System.out.println("*********************");
		System.out.printf("*   End of Round %-3d*\n", round +1);
		System.out.println("*********************");
	}
	public static void dispPoint(int point) {
		System.out.println("+-------------------+");
		System.out.printf("|Point is %-2d        |\n", point);
		System.out.println("+-------------------+");
	}
	public static void dispCrapsLoss() {
		System.out.println("+-------------------+");
		System.out.println("|        CRAPS!     |");
		System.out.println("|      YOUZ LOOZ    |");
		System.out.println("|     MONEY  BAGS   |");
		System.out.println("+-------------------+");
	}
	public static void dispNatWin() {
		System.out.println("+-------------------+");
		System.out.println("|      NATURAL!     |");
		System.out.println("|    YOU WON BUT    |");
		System.out.println("|THERE ARE THOSE WHO|");
		System.out.println("|  FIND YOUR TASTES |");
		System.out.println("|  SOMEWHAT LACKING |");
		System.out.println("+-------------------+");
	}
	public static void dispPointWin() {
		System.out.println("+-------------------+");
		System.out.println("|     A WINNA!      |");
		System.out.println("|  YOU MADE POINT   |");
		System.out.println("|    LUCKY JOYK     |");
		System.out.println("+-------------------+");
	}
	public static void dispCrapOutLoss() {
		System.out.println("+-------------------+");
		System.out.println("|    CRAPPED OUT!   |");
		System.out.println("|      A LOOZA!     |");
		System.out.println("|    BETTA LUCK     |");
		System.out.println("|   NEXT TIME PAL   |");
		System.out.println("+-------------------+");
	}
	public static void dispGoodbye() {
		String [] records = round();
		int winCt = 0;
		float winPct = 0;
		
		for (int i=0;i < records.length;i++) {
			if(records[i].equals("Winna!")) {
				winCt++;
			}
		}
		winPct = (float)winCt / records.length ;
		System.out.printf("|Wins:%-3d |WP:%-5.1f%s|\n", winCt, winPct * 100, "%");
		System.out.println("+---------+---------+");
		
		if (winPct == 0.5) {
			System.out.println("Weez bote broke even. It was a pleasure doin' bi'nissess wit youz.");
		}
		else if (winPct > 0.5) {
			System.out.println("Youz must be fixing the dice or youz is just too darn lucky.\n"
					+ "Come back and let me take... I mean win back the money yooz stole... \n"
					+ "I mean fairly won.");
		}
		else {
			System.out.println("Your luck will turn around pal. Come back any time,\n"
					+ "It was a pleasure doin' bi'nissess wit youz.");
		}
	}
	public static void dispGreeting() {
		System.out.println("Welcome To Good Ol' Reliable Stephen's...Stephen Detroit's...");
		System.out.println("For the OLDEST, ESTABLISHED, PERMANENT, FLOATING, CRAPS GAME...");
		System.out.println("IN NEW YORK...(Now powered by Java TM)");
		drawDie(3);
    		drawDie(4);
	}
}
