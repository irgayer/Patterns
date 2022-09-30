public class Main {
    public static void main(String[] args) {
        var server = new StockServer();

        var user1 = new BrowserApp(server);
        var user2 = new PhoneApp(server);
        var user3 = new BrowserApp(server);
        var user4 = new BrowserApp(server);
        try {
            server.start();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}