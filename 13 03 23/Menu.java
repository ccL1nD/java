public class Menu extends MenuCoponent {
    ArrayList menuCoponents = new ArrayList();
    String name;
    String description;

    public menu(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public void add (MenuCoponent menuCoponent) {
        menuComponents.add (menuCoponent);
    }
    public void remove (MenuCoponent menuCoponent) {
        menuComponents.remove (menuCoponent);
    }
    public menuComponent getChild(int i) {
        return (MenuCoponent)menuComponents.get (i);
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public void print() {
        System.out.print("\n"+ getName());
        System.out.println(", "+ getDescription());
        System.out.println("----------------------");

        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent menuComponent =
            (MenuComponent) iterator.next();
            MenuComponent.print();
        }
    }
}