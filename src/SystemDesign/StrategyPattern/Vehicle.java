package SystemDesign.StrategyPattern;

public class Vehicle{
  public WheelerStrategy wheelerStrategy ;

  public Vehicle(WheelerStrategy wheelerStrategy){
      this.wheelerStrategy = wheelerStrategy;
  }

  
  public void applyHorn(){
    System.out.println("Horn is Applied");
  }

  public void applyAccerate(){
    wheelerStrategy.applyAccelerate();
  }
}
