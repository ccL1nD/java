public class RubberDuck extends Duck {

	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
    public void quack(){
        System.out.println("Pi-Pi-Pi");
    }
    public void display() {
        System.out.println("I Rubber Duck");
    }
    
}
