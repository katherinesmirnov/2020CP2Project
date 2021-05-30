// P9.5
//Katherine Smirnov 3B
// design an appointment tracker application
// Occurson() method checks if appointment occurs on a date
// fill an array Appointment with appintments
//user enters date and returns the appointments on that date
// user can add an appointment (must specify type, description and date)

import java.util.ArrayList;
public class Appointment {
  public int day, month,year;
  public String des;
  //methods to return the day, month, year

  public Appointment(int month, int day, int year, String des){
    des = "";
  }
  // methods to return day
  public int getDay(){
    return day;
  }
  public int getMonth(){
    return month;
  }
  public int getYear(){
    return year;
  }
  // methods to set it (so we can add on)
  public void setDay(int day){
    this.day = day;
  }
  public void setMonth(int month){
    this.month = month;
  }
  public void setYear(int year){
    this.year = year;
  }
  public void setdecr(String des){
    this.des = des;
  }
  public boolean occursOn(int day, int month, int year){
    if((this.day == day) && (this.month == month) &&(this.year == year)){
      return true;
    }
    else{
      return false;
    }
  }
}
