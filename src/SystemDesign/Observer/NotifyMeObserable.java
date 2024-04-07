package SystemDesign.ObserverPattern;

import java.util.*;

public class NotifyMeObserable{
  private List<Observer> observers = new ArrayList<>();
  private Integer quantity=0;

  public void addObserver(Observer o){
    observers.add(o);
  }
  public void removeObserver(Observer o){
    observers.remove(o);
  }
  public void notifyObservers(){
    for(Observer o : observers){
      o.update();
    }
  }
  public void updateNotifyMe(int quantity){
    if(this.quantity==0){
      notifyObservers();
    }
    this.quantity=quantity;
  }
  public int getStatus(){
    return quantity;
  }
}

