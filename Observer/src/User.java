import Contracts.IObservable;
import Contracts.IObserver;

public class User implements IObserver {
    private IObservable observable;
    private String name;

    public User(IObservable observable, String name)
    {
        this.observable = observable;
        this.name = name;
        observable.add(this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.getObjectName() + " received message: \"" + message + "\"");
    }

    @Override
    public String getObjectName() {
        return name;
    }

    public void disconnect() {
        observable.delete(this);
    }

    public void sendMessage(String message)
    {
        System.out.println(this.getObjectName() + " sended message");
        observable.update(message);
    }
}
