//P.12
// make a voting machine and collect the data
//Katherine Smirnov 3B
public class VotingMachine{
  // constructor
  int dvotes,rvotes,ovotes;
  public VotingMachine(){
    dvotes = 0;
    rvotes = 0;
    ovotes = 0;
  }
  //member methods
  public void demo(){
    dvotes+=1;
  }
  public void repub(){
    rvotes+=1;
  }
  public void other(){
    ovotes+=1;
  }
  public int getdvotes(){
    return dvotes;
  }
  public int getrvotes(){
    return rvotes;
  }
  public int getovotes(){
    return ovotes;
  }
  public void clear(){
    dvotes = 0;
    rvotes = 0;
    ovotes = 0;
  }
}
