public interface IObserver {
    void update(StockChange stockChange);
    void disconnect();
}
