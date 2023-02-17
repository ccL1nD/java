class CocaColaBottle extends AbstractBottle {
    public  void Interact(AbstractWater water) {
        System.out.println(this + " interacts with " + water);
    }

    public  void Interact(AbstractCover cover) {
        System.out.println(this + " interacts with " + cover);
    }
}