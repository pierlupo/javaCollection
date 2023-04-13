package org.example.designPattern.observer;

public class CurrentWeatherConditionDisplay implements Observer{



    private float temperature;

    private float pression;

    private float humidite;




    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }



    public void setPression(float pression) {
        this.pression = pression;
    }



    public void setHumidite(float humidite) {
        this.humidite = humidite;
    }

    @Override
    public void update(float temperature, float pression, float humidite) {
        this.temperature = temperature;
        this.pression = pression;
        this.humidite = humidite;
        display();
    }

    public void display(){
        System.out.println("CurrentTemp "+ temperature + " F degrées et " + humidite + " % humidité" );
    }
}
