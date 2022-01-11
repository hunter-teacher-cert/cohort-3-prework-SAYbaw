import java.io.*;
import java.util.*;

public class Beer {
  public static void   main(String[]args){
    int verseNumber = 99;
    displayVerse(verseNumber);

  }
  public static void displayVerse(int n){
    String beers = " bottles of beer";
    String beer = " bottle of beer";
    String wall = " on the wall";
    String no = "no";
    
    if (n == 0) {
	      displayLastVerse(beers, wall);
	    } else {
        System.out.print(n);
        System.out.print((n  >  1) ? beers : beer);
        System.out.println(wall + ",");
        System.out.print(n);
        System.out.print((n  >  1) ? beers : beer);
        System.out.println(",");
        System.out.println("ya’ take one down, ya’ pass it around,");
        System.out.print((n == 1) ? no : n - 1);
        System.out.print((n == 2) ? beer : beers);  
        System.out.println(wall + ".");
        System.out.println();
	    	
        displayVerse(n - 1);
      }
  }
  public static void displayLastVerse(String sB, String sW){ 
    System.out.printf("No%s%s,\nno%s,\n ya’ can't take one down, ya’ can't pass it around,\n’cause there are no more%s%s.\n", sB, sW, sB, sB, sW);
  }

  
  
}