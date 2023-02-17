public class StarbuzzCoffee {
    
    public static void main(String[] args) {

        Beverage coffee1 = new HouseBend();
        System.out.println(coffee1.getDescription() + " " + coffee1.cost() + "руб.");
        System.out.println("-----------------------------------\n");

        Beverage coffee2 = new Decaf();
        coffee2 = new Mocha(coffee2);
        coffee2 = new Mocha(coffee2);
        coffee2 = new Milk(coffee2);
        coffee2 = new Soy(coffee2);
        coffee2 = new Whip(coffee2);
        System.out.println(coffee2.getDescription() + " " + coffee2.cost() + "руб.");
        System.out.println("-----------------------------------\n");

        Beverage coffee3 = new DarkRoast();
        System.out.println(coffee3.getDescription() + " " + coffee3.cost() + "руб.");
        System.out.println("-----------------------------------\n");

        Beverage coffee4 = new Espresso();
        coffee4 = new Mocha(coffee4);
        coffee4 = new Mocha(coffee4);
        coffee4 = new Milk(coffee4);
        coffee4 = new Soy(coffee4);
        coffee4 = new Whip(coffee4);
        System.out.println(coffee4.getDescription() + " " + coffee4.cost() + "руб.");
        System.out.println("-----------------------------------\n");
    }
}