package in.appsgeek.strategypattern;

public class StrategyMain {

    public static void main(String[] args){
        IFlyBehaviour doFlyBehaviour = new DoFly();
        IQuachBehaviour doQuachBehaviour = new DoQuach();

        IFlyBehaviour doNotFlyBehaviour = new NoFly();
        IQuachBehaviour doNotQuachBehaviour = new NoQuach();

        Duck doDuck= new Duck(doFlyBehaviour, doQuachBehaviour);
        doDuck.doFly();
        doDuck.doQuach();

        Duck noDuck= new Duck(doNotFlyBehaviour,doNotQuachBehaviour);
        noDuck.doNotFly();
        noDuck.doNotQuach();

    }
}
