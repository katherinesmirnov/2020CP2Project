import java.util.ArrayList;
public class Onetime extends Appointment
{
  // public ArrayList<Integer>onetime;
  public Onetime(int day, int month, int year, String des){
    // onetime = new ArrayList<Integer>();
    super(day, month, year, des);
  }
  public String toString(){
    return "[OneTime]" + super.toString();
  }
  // public void occursOn(int day, int month, int year){
  //   this.day = day;
  //   this.month= month;
  //   this.year = year;
  // }
  // public void description(){
  //   System.out.println();
  // }
  // public boolean occursOn(int day, int month, int year){
  //   if((this.day == day) && (this.month == month) &&(this.year == year)){
  //     return true;
  //   }
  //   else{
  //     return false;
  //   }
  // }
}
