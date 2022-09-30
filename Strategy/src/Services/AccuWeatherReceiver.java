package Services;

import Contracts.IWeatherReceiver;

public class AccuWeatherReceiver implements IWeatherReceiver {
    @Override
    public boolean checkConnection() {
        System.out.println("Checking connection to AccuWeather");

        return true;
    }

    @Override
    public String getWeather() {
        return "Weather from AccuWeather";
    }
}
