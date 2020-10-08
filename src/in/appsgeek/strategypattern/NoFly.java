package in.appsgeek.strategypattern;

public class NoFly implements IFlyBehaviour {
    @Override
    public String fly() {
        return "DO NOT FLY";
    }
}
