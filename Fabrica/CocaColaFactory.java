class CocaColaFactory extends AbstractFactory {
    public AbstractWater CreateWater() {
        return new CocaColaWater();
    }

    public AbstractBottle CreateBottle() {
        return new CocaColaBottle();
    }

    public AbstractCover CreateCover() {
        return new CocaColaCover();
    }
}