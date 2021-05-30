//katherine 3b
//from given array, have the user prompt thier choice of seats
//based on price or location
import java.util.Scanner;
public class SeatingViewer
{
   public static void main(String[] args)
   {
     Scanner input = new Scanner(System.in);
     int[][] chart =
     {
      {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
      {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
      {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
      {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
      {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
      {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
      {20, 20, 30, 30, 40, 40, 30, 30, 20, 20},
      {20, 30, 30, 40, 50, 50, 40, 30, 30, 20},
      {30, 40, 50, 50, 50, 50, 50, 50, 40, 30}
    };
    SeatingChart theater = new SeatingChart(chart);
    //ask for info from user
    System.out.println("Would you like to choose a seat or price?");
    System.out.println("'S' for specific seat, 'P' for price");
    char character  = input.next().charAt(0);
    // carry out method by seat choice
    if(character == 'S'){
      System.out.println("What row would you like: ");
      int row  = input.nextInt();
      System.out.println("What column would you like: ");
      int column  = input.nextInt();
      theater.seatpicker(row-1,column-1);
    }
    //carry out method by price
    else if (character == 'P'){
      System.out.println("Enter your desired price: ");
      int price = input.nextInt();
      theater.pricepicker(price);
    }
    else{
      System.out.println("This input is not an option");
    }
  }
}
