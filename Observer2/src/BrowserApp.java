public class BrowserApp implements IObserver {
    private StockServer stockServer;

    public BrowserApp(StockServer stockServer)
    {
        stockServer.add(this);
    }

    @Override
    public void update(StockChange stockChange) {
        System.out.println(this.hashCode() + " saw " + String.format("%d", stockChange.change) + " through browser");
    }

    @Override
    public void disconnect() {
        stockServer.delete(this);
    }
}
