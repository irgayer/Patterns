package Services;

import Contracts.IWeatherReceiver;

public class AppleWeatherReceiver implements IWeatherReceiver {
    @Override
    public boolean checkConnection() {
        System.out.println("Checking connection to AppleWeather");

        return true;
    }

    @Override
    public String getWeather() {
        return "Weather from AppleWeather";
    }
}
