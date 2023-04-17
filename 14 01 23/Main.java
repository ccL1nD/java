public class Main {

    public static Duck void main(String[] argv) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.quack();
        mallard.swim();
        mallard.fly();
        System.out.println("--------------------");

        Duck readhead = new ReadheadDuck();
        readhead.display();
        readhead.quack();
        readhead.swim();
        readhead.fly();
        System.out.println("--------------------");

        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.quack();
        rubber.swim();
        rubber.fly();
        System.out.println("--------------------");

        Duck wooden = new WoodenDuck();
        wooden.display();
        wooden.quack();
        wooden.swim();
        wooden.fly();
        System.out.println("--------------------");
    }
}