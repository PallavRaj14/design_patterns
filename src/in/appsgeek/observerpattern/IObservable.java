package in.appsgeek.observerpattern;

public interface IObservable {
    void register(IObserver observer);
    void remove(IObserver observer);
    void notifyObserver();
}
