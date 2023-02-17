public class Main {
    
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.swim();
        mallard.performFly();
        System.out.println("----------------------------");

        Duck redhead = new RedheadDuck();
        redhead.display();
        redhead.performQuack();
        redhead.swim();
        redhead.performFly();
        System.out.println("----------------------------");

        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.performQuack();
        rubber.swim();
        rubber.performFly();
        System.out.println("----------------------------");

        Duck decoy = new DecoyDuck();
        decoy.display();
        decoy.performQuack();
        decoy.swim();
        decoy.performFly();
        System.out.println("----------------------------");

        Duck model = new ModelDuck();
        model.display();
        model.performQuack();
        model.swim();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        System.out.println("----------------------------");
    }
}
