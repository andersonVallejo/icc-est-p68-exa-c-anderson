package test;

import java.util.Arrays;

public class Tournament {
  private String name;
  private Club[] clubs;
  public Tournament() {
  }
public   void (Tournament[] clubs2){
  for(int i=0; i<clubs2.length -1; i++){
    
      for (int j=0; j<clubs2.length -1; j++){
        if (clubs[j]>clubs[j-1].getAthletes()<){
          aux=clubs[j];
          clubs[j] = clubs[j+1];
          clubs[j+1] = aux;

        }

      }
  }
  
}

 
  public Tournament(String name, Club[] clubs) {
    this.name = name;
    this.clubs = clubs;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Club[] getClubs() {
    return clubs;
  }
  public void setClubs(Club[] clubs) {
    this.clubs = clubs;
  }
  @Override
  public String toString() {
    return "Tournament [name=" + name + ", clubs=" + Arrays.toString(clubs) + "]";
  }
  
  public int getTotalStarterPoints(Athlete[] atlete){
    int total = 0;
    for(int i = 0; i<clubs.length;i++){
      Athlete clubs = Club[i];

      for (int j=0; j<clubs.getAthletes().length; j++){
        Club clubs =Club.getAthletes()[j];

        if (clubs.Athletes()){
        total +=clubs.getAthletes()
        }
      }
    }
      

   }

}
