import java.util.ArrayList;
import java.util.Scanner;
public class AppointmentView {
  //constructor
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    //make the appointments
    Book book = new Book();
    book.add(new Onetime(1,2,2021, "Get an MRI scan"));
    book.add(new Monthly(1,3,2021, "Go to the dentist"));
    book.add(new Daily(1,3,2021, "Go to the dentist"));
    // Daily daily = new Daily();
    // Onetime onetime = new Onetime(1,2,2021, "Get an MRI scan");
    // Monthly monthly = new Monthly(1,3,2021, "Go to the dentist");
    // Appointment app =  new Appointment();
    // appointments[0] = new Daily(1,1,2021,"Go to the physical therapist");
    // appointments[1] = new Onetime(1,2,2021, "Get an MRI scan");
    // appointments[2] = new Monthly(1,3,2021, "Go to the dentist");
    // app.add(1,1,2021,"Go to the physical therapist");

    // ArrayList<Integer> dailybook = new ArrayList<Integer>();
    // ArrayList<Integer> monthlybook = new ArrayList<Integer>();
    // ArrayList<Integer> onebook = new ArrayList<Integer>();

    //ask the user for input
    System.out.println("Would you like to check or add appointmets?");
    System.out.print("Enter 'c' to check or 'a' to add: ");
    char option = input.next().charAt(0);
    // short through type
    if (option == 'c'){
      System.out.println("Is the appointment monthly, daily or onetime?");
      System.out.print("Enter 'm' for monthly, 'd' for daily, or 'o' for onetime: ");
      char type = input.next().charAt(0);
      if (type == 'm'){
        System.out.println("Enter the month: ");
        int monthin = input.nextInt();
        System.out.println("Enter the day: ");
        int dayin = input.nextInt();
        System.out.println("Enter the year: ");
        int yearin= input.nextInt();
      }
      if(type == 'd'){
        System.out.println("Enter the month: ");
        int monthin = input.nextInt();
        System.out.println("Enter the day: ");
        int dayin = input.nextInt();
        System.out.println("Enter the year: ");
        int yearin= input.nextInt();
      }
      if(type =='o'){
        System.out.println("Enter the month: ");
        int monthin = input.nextInt();
        System.out.println("Enter the day: ");
        int dayin = input.nextInt();
        System.out.println("Enter the year: ");
        int yearin= input.nextInt();
      }
    }
    if (option == 'a'){
      System.out.println("Is the appointment monthly, daily or onetime?");
      System.out.print("Enter 'm' for monthly, 'd' for daily, or 'o' for onetime: ");
      char type = input.next().charAt(0);
      if (type == 'm'){
        System.out.println("Enter the month: ");
        int monthin = input.nextInt();
        System.out.println("Enter the day: ");
        int dayin = input.nextInt();
        System.out.println("Enter the year: ");
        int yearin= input.nextInt();
        System.out.println("Enter the description: ");
        String descr = input.next();
        book.add(new Monthly(dayin,monthin,yearin, descr));
      }
      if(type == 'd'){
        System.out.println("Enter the month: ");
        int monthin = input.nextInt();
        System.out.println("Enter the day: ");
        int dayin = input.nextInt();
        System.out.println("Enter the year: ");
        int yearin= input.nextInt();
        System.out.println("Enter the description: ");
        String descr = input.next();
        book.add(new Monthly(dayin,monthin,yearin, descr));
      }
      if(type =='o'){
        System.out.println("Enter the month: ");
        int monthin = input.nextInt();
        System.out.println("Enter the day: ");
        int dayin = input.nextInt();
        System.out.println("Enter the year: ");
        int yearin= input.nextInt();
        System.out.println("Enter the description: ");
        String descr = input.next();
        book.add(new Monthly(dayin,monthin,yearin, descr));
      }

      // app.add(monthin, dayin, yearin, descin);
    }
    else{
      System.out.println("You entered an invalid response");
    }
  }
}
