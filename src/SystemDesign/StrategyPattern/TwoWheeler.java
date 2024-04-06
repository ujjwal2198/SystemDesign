package SystemDesign.StrategyPattern;

public class TwoWheeler implements WheelerStrategy{
  public void applyAccelerate(){
    System.out.println("Apply Accelerateon Bike");
  }
}
