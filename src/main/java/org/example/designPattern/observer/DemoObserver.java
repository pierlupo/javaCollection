package org.example.designPattern.observer;

public class DemoObserver {

    public static void main() {

        WeatherData weatherData = new WeatherData();

        CurrentWeatherConditionDisplay currentWeatherConditionDisplay = new CurrentWeatherConditionDisplay();
        CurrentWeatherConditionDisplay currentWeatherConditionDisplay2 = new CurrentWeatherConditionDisplay();
        CurrentWeatherConditionDisplay currentWeatherConditionDisplay3 = new CurrentWeatherConditionDisplay();
        weatherData.addObserver(currentWeatherConditionDisplay);
        weatherData.addObserver(currentWeatherConditionDisplay2);
        currentWeatherConditionDisplay3.setTemperature(25);
        currentWeatherConditionDisplay3.setHumidite(800);
        currentWeatherConditionDisplay3.setPression(200);
        weatherData.setMesure( 700, 2.5f, 5.4f);
        currentWeatherConditionDisplay3.display();


    }
}
