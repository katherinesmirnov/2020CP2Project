import java.util.ArrayList;
public class Monthly extends Appointment
{
  public Monthly(int day, int month, int year, String des){
    // onetime = new ArrayList<Integer>();
    super(day, month, year, des);
  }
  public String toString(){
    return "[OneTime]" + super.toString();
  }
  // ArrayList<Integer> monthly = new ArrayList<Integer>();
  // public ArrayList<Integer>monthly;
  // public Monthly(int day, int month, int year, String decr){
  //   monthly = new ArrayList<Integer>();
  // }
  // public void occursOn(int day, int month){
  //   this.day = day;
  //   this.month= month;
  // }
  // public void description(){
  //   System.out.println();
  // }
  // public ArrayList<Integer> OccursOn(int day, int month){
  //   if((this.day == day) && (this.month == month)){
  //     return true;
  //   }
  //   else{
  //     return false;
  //   }
  // }

}
