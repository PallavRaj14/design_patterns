package in.appsgeek.observerpattern;

public class Display {
    public static void main(String[] args){
        WeatherStation station = new WeatherStation();
        PhoneDisplay observer= new PhoneDisplay(station);
        observer.registerObserver();
        station.notifyObserver();
    }
}
