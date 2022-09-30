import Services.AppleWeatherReceiver;

public class Main {
    public static void main(String[] args) {
        var app = new App(new AppleWeatherReceiver());
        app.start();
    }
}