package SystemDesign.StrategyPattern;

public class FourWheeler implements WheelerStrategy {
  public void applyAccelerate(){
    System.out.println("car Accerate is ON");
  }
}
