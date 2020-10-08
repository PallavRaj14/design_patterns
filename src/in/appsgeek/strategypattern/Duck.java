package in.appsgeek.strategypattern;

public class Duck {

    IFlyBehaviour flyBehaviour;
    IQuachBehaviour quachBehaviour;

    public Duck(IFlyBehaviour flyBehaviour, IQuachBehaviour quachBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quachBehaviour = quachBehaviour;
    }

    public void doFly(){
        System.out.println(flyBehaviour.fly());
    }

    public void doQuach(){
        System.out.println(quachBehaviour.quach());
    }

    public void doNotFly(){
        System.out.println(flyBehaviour.fly());
    }

    public void doNotQuach(){
        System.out.println(quachBehaviour.quach());
    }
}
