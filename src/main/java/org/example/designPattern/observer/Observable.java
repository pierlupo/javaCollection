package org.example.designPattern.observer;

public interface Observable {


    void addObserver(Observer observer);

    void RemoveObserver(Observer observer);

    void notifyObserver();
}
