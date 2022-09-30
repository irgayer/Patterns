import java.util.ArrayList;
import java.util.Random;

public class StockServer {
    private ArrayList<IObserver> observers = new ArrayList<>();

    public void start() throws InterruptedException {
        var random = new Random();
        while(true)
        {
            Thread.sleep(1000);
            var change = random.nextInt(-100, 100);

            for (var observer : observers)
            {
                observer.update(new StockChange(change));
            }
            System.out.println("---------------");
        }
    }

    public void add(IObserver observer)
    {
        observers.add(observer);
    }

    public void delete(IObserver observer)
    {
        observers.remove(observer);
    }

}
