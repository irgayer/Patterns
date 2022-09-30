import Contracts.IObservable;
import Contracts.IObserver;

import java.util.ArrayList;
import java.util.List;

public class ChatServer implements IObservable {
    private List<IObserver> observers = new ArrayList<>();

    @Override
    public void add(IObserver observer) {
        System.out.println(observer.getObjectName() + " joined to chat");
        observers.add(observer);
    }

    @Override
    public void delete(IObserver observer) {
        System.out.println(observer.getObjectName() + " has left chat");
        observers.remove(observer);
    }

    @Override
    public void update(String message) {
        for (var observer : observers)
        {
            observer.getMessage(message);
        }
        System.out.println();
    }
}
