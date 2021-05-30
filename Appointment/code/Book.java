import java.util.ArrayList;
public class Book{
  ArrayList<Appointment> appointments;
  public Book(){
    appointments = new ArrayList<Appointment>();
  }
  public void add(Appointment app){
    appointments.add(app);
  }
  public void getApps(int day, int month, int year){
    for (Appointment app: appointments){
      if(app.occursOn(day,month,day)){
        System.out.println(app.toString());
      }
    }
  }
}
