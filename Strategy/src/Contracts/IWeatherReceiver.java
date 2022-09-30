package Contracts;

public interface IWeatherReceiver {
    boolean checkConnection();
    String getWeather();
}
