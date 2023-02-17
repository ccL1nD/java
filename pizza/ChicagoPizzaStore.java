public class ChicagoPizzaStore extends PizzaStore {
    
    protected Pizza creatPizza(String type) {
        if (type.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        }
        else if (type.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        }
        else {
            return null;
        }
    }
}