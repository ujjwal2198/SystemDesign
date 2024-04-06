package SystemDesign.Singleton;

public class Singleton {
  private static Singleton singleton;
  private static Integer i;

  private Singleton(){
  }

  public static Singleton getSingletonInstance(){
      if(singleton == null){
        singleton= new Singleton();
      }
      return singleton;
  }

  public void changeIValue(int i){
    this.i=i*100;
  }

  public void printIValue(){
    System.out.println("Updated Value of I "+i);
  }

}
