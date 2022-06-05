import java.io.*;
import java.util.*;
import java.time.*;

public class Date {

  public static void main (String [] args){

    LocalDateTime date = LocalDateTime.now();
    DayOfWeek day = date.getDayOfWeek();
    Month month = date.getMonth();
    int dayOfMonth = date.getDayOfMonth();
    int year = date.getYear();
 
    System.out.println("American Format:\n" 
    + day + ", " + month + " " + dayOfMonth + ", " + year);

    System.out.println("European Format:\n" 
    + day + " " + dayOfMonth + " " + month + " " + year);


  }
}