//Katherine Smirnov 3B
// P11.2
//sorts through babyname files to find the names that are in commmon
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
// import java.util*;
import java.util.ArrayList;

public class BabyNameSorter{
  public static void main(String[] args) throws IOException{
    // declare variables
    int size= 500;
    String[] girls = new String[size];
    String[] boys = new String[size];
    Boolean[] same = new Boolean[size];
    String rank= "";

    // setup inputs and output txt files
    File input = new File("babynames.txt");
    Scanner in = new Scanner(input);
    FileWriter out = new FileWriter("genderNeutralNames.txt");
    //scan through lines
    int count=-1;
    while(in.hasNextLine()){
      count++;
      String line = in.nextLine();
      Scanner lineScanner = new Scanner(line);
      while(lineScanner.hasNext()){
        String next = lineScanner.next();
        rank = rank + " " + next;
        String second = lineScanner.next();
        boys[count]= second;
        String third = lineScanner.next();
        girls[count] =third;

      }
    }
    //check if they are the same
    if (!in.hasNextLine()){
      for(int j=0; j<size; j++){
         for(int k=0; k<size; k++){
           String boy = boys[j];
           String girl = girls[k];
           if((boy).equals(girl)){
              same[j] = true;
           }
         }
       }
    }in.close();

    //if lines are the same, they will print
    for(int i=0; i<size; i++){
      if(same[i]==null){
        same[i]=false;
      }
      if(same[i]==true){
        out.write(boys[i]+"\n");
      }
    }

    out.close();
  }
}
