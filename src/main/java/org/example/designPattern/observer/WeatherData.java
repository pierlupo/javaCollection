package org.example.designPattern.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Observable{


    private float temperature;

    private float pression;

    private float humidite;

    private List<Observer> observerList;

    public WeatherData() {
        this.observerList = new ArrayList<>();
    }


    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void RemoveObserver(Observer observer) {
        int index = observerList.indexOf(observer);
        observerList.remove(index);
    }

    @Override
    public void notifyObserver() {

        for (Observer o: observerList) {
            o.update(temperature,pression,humidite);
        }

    }


    public void mesureChanged(){
        notifyObserver();
    }

    public void setMesure(float temp, float pression, float humidite){
        this.humidite = humidite;
        this.pression = pression;
        this.temperature = temp;
        mesureChanged();
    }

}
