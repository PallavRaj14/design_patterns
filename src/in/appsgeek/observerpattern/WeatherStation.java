package in.appsgeek.observerpattern;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class WeatherStation implements IObservable {
    private List<IObserver> observersList = new CopyOnWriteArrayList<>();
    private int temprature;

    public void register(IObserver observer) {
        observersList.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        observersList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (IObserver observer: observersList) {
            observer.update();
            remove(observer);
        }
    }

    public void setState(int temprature){
        this.temprature=temprature;
        notifyObserver();
    }

    public String getTemprature(){
        return "40 degree C";
    }
}
