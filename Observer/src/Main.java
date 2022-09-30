import Contracts.IObservable;

public class Main {
    public static void main(String[] args) {
        IObservable observable = new ChatServer();
        User marry = new User(observable, "Marry");
        User john = new User(observable, "John");
        marry.sendMessage("Hi! My name is marry!");
        john.sendMessage("Hi! I'm john, nice to meet you!");

        User mike = new User(observable, "Mike");
        mike.sendMessage("Hello guys! What we are going to do?");
        marry.sendMessage("Mike? Goodbye");
        marry.disconnect();
        john.sendMessage("Bruh!");
        john.disconnect();
    }
}