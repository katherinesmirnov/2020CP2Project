import java.util.Scanner;
public class VotingViewer{
  public static void main(String[] args){
    // user input
    String vote;
    Scanner run = new Scanner(System.in);
    VotingMachine tally = new VotingMachine();
    System.out.println("Who are you voting for (Republican(R)/Democrat(D)/Other(O)): ");
    vote = run.nextLine();
    char voter = vote.charAt(0);
    //test the result
    if (voter=='R'){
      tally.repub();
    }
    if ( voter=='D'){
      tally.demo();
    }
    if ( voter=='O'){
      tally.other();
    }
    System.out.println("Total Republican votes: " + tally.getrvotes());
    System.out.println("Total Democrat votes: " + tally.getdvotes());
    System.out.println("Total Other votes: " + tally.getovotes());
    tally.clear();
    System.out.println("*clear out votes*");
    System.out.println("Total Republican votes: " + tally.getrvotes());
    System.out.println("Total Democrat votes: " + tally.getdvotes());
    System.out.println("Total Other votes: " + tally.getovotes());
  }
}
