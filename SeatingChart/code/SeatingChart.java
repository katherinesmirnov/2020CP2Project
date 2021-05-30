
import java.util.ArrayList;
import java.util.Random;
public class SeatingChart {
  //constructor
  int[][] chart;
  Random random = new Random();
  public SeatingChart(int[][]data ){
    chart = data;
  }
  //select based on given seat
  public void seatpicker(int row, int column){
    int spot = chart[row][column];
    if (spot!=0){
      System.out.println("This seat is available for you. Your confirmed seat is: "+ row +","+ column);
      chart[row][column]=0;
    }
    else {
      System.out.println("Sorry this seat isn't available");
    }
  }
  //select based on price
  public void pricepicker(int price){
    for (int row=0; row<chart.length; row++)
    {
      for (int col=0; col<chart[row].length; col++)
      {
        int len =0;
        if (chart[row][col]==price&&chart[row][col]!=0){
          //add all the seats that match the critera to array
          ArrayList<String> right = new ArrayList<String>();
          String newrow = Integer.toString(row-1);
          String newcol = Integer.toString(col-1);
          String seat = newrow + "." + newcol;
          right.add(seat);
          len+=1;
          while (len<2){
            int spot = random.nextInt(right.size());
            System.out.println("Here's your confirmed seat: "+right.get(spot));
            chart[row][col] = 0;
            break;
          }
        }
      }
    }
  }
}
