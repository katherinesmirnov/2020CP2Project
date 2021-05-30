import java.util.ArrayList;
public class Daily extends Appointment{
  public Daily(int day, int month, int year, String des){
    // onetime = new ArrayList<Integer>();
    super(day, month, year, des);
  }
  public String toString(){
    return "[OneTime]" + super.toString();
  }
  // public ArrayList<String>daily;
  // public Daily(char day, char month, char year, String decr){
  //   daily = new ArrayList<String>();
  // }
  // // public boolean occursOn(int day){
  // //   if (this.day == day){
  // //     return true;
  // //   }else {
  // //     return false;
  // //   }
  // // }
  // public void add(char day, int month, int year, String decr){
  //   daily.add(day, month, year, decr);
  // }
  // public void occursOn(int day){
  //   this.day = day;
  // }
  // public void description(){
  //   System.out.println();
  // }
}
