import Contracts.IWeatherReceiver;
import Services.AccuWeatherReceiver;
import Services.AppleWeatherReceiver;

import java.util.Random;
import java.util.Scanner;

public class App {
    public IWeatherReceiver weatherReceiver;

    public App(IWeatherReceiver defaultWeatherReceiver)
    {
        weatherReceiver = defaultWeatherReceiver;
    }

    private void changeReceiver(char c) {
        if (c == 'a')
            weatherReceiver = new AppleWeatherReceiver();
        else
            weatherReceiver = new AccuWeatherReceiver();
    }

    public void start() {
        var random = new Random();
        var scanner = new Scanner(System.in);
        while (true)
        {
            try {
                Thread.sleep(1000);
                weatherReceiver.checkConnection();
                int success = random.nextInt(0, 2);

                if (success == 0)
                {
                    System.out.println("Connection failed");
                    System.out.println("Press 'c' to change receiver and continue\n");
                    scanner.next();
                    // for education purpose only
                    // awful logic
                    changeReceiver(weatherReceiver instanceof AppleWeatherReceiver ? 'c' : 'a');
                    continue;
                }
                System.out.println(weatherReceiver.getWeather());
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
