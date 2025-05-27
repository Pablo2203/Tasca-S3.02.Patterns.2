package level2.subject;

import level2.observer.Observer;

public interface Subject {
     void registerObserver(Observer observer);
     void removeObserver(Observer observer);
     void notifyObservers();
}
