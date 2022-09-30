public class PhoneApp implements IObserver {
    private StockServer stockServer;

    public PhoneApp(StockServer stockServer)
    {
        stockServer.add(this);
    }

    @Override
    public void update(StockChange stockChange) {
        System.out.println(this.hashCode() +  " saw " + String.format("%d", stockChange.change) + " through phone app");
    }

    @Override
    public void disconnect() {
        stockServer.delete(this);
    }
}
