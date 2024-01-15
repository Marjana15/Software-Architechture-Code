import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String weatherData);
}

interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

class CurrentWeatherDisplay implements Observer {
    @Override
    public void update(String weatherData) {
        System.out.println("Current Weather Display updated with data: " + weatherData);
    }
}

class ForecastDisplay implements Observer {
    @Override
    public void update(String weatherData) {
        System.out.println("Forecast Display updated with data: " + weatherData);
    }
}

class WeatherData implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String currentWeatherData;

    public void setWeatherData(String weatherData) {
        this.currentWeatherData = weatherData;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(currentWeatherData);
        }
    }
}

class FourTest
{
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentWeatherDisplay currentWeatherDisplay = new CurrentWeatherDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();

        weatherData.registerObserver(currentWeatherDisplay);
        weatherData.registerObserver(forecastDisplay);

        // Simulate a weather data update
        weatherData.setWeatherData("Temperature: 75°F, Humidity: 50%");

        // Simulate another weather data update
        weatherData.setWeatherData("Temperature: 80°F, Humidity: 45%");
    }
}