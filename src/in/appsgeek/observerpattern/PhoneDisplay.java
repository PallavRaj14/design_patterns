package in.appsgeek.observerpattern;

public class PhoneDisplay implements IObserver {

    WeatherStation weatherStation;

    public PhoneDisplay(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }

    public void registerObserver(){
        weatherStation.register(new PhoneDisplay(weatherStation));
    }

    @Override
    public void update() {
        System.out.println(this.weatherStation.getTemprature());
    }
}
