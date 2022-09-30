package Contracts;

public interface IObservable {
    void add(IObserver observer);
    void delete(IObserver observer);
    void update(String message);
}
