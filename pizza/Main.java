public class Main {

    public static void main(String[] argv) {

        PizzaStore nyStore =  new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Arthas ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("NIx ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("veggie");
		System.out.println("Stray ordered a " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza("veggie");
		System.out.println("Golovach ordered a " + pizza.getName() + "\n");
    }
}