package SystemDesign.ObserverPattern;
  
public interface Obserable{
  public abstract void addObserver(Observer observer);
  public abstract void removeObserver(Observer observer);
  public abstract void notifyObservers();
  public abstract void updateNotifyMe(int quantity);
}
