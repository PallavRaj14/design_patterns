package in.appsgeek.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable {
    List<IObserver> observersList = new ArrayList<>();

    public void register(IObserver observer) {
        observersList.add(observer);
    }

    /*
    * No added functionality yet
    * */
    @Override
    public void remove(IObserver observer) {
        observersList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (IObserver observer: observersList) {
            observer.update();
        }
    }

    public String getTemprature(){
        return "40 degree C";
    }
}
