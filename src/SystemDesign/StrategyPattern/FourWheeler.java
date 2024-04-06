package SystemDesign.StrategyPattern;

public class FourWheeler implements WheelerStrategy {
  public void applyAccerate(){
    System.out.println("car Accerate is ON");
  }
}
