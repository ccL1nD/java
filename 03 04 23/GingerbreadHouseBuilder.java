class GingerbreadHouseBuilder extends HouseBuilder
{
    int numWalls = 4;
    int numWindows = 4;
    String windowMaterial = "Sugar";
    String WallMaterial = "Gingerbread and icing";
    String roofMaterial = "Twizzlers";

    public GingerbreadHouseBuilder()
    {
        this.builderName = "Gingerbread House Builder";
        setHouseType(HouseType.GINGERBREAD);

    }

    public HouseBuilder addWalls()
    {
        for (int i = 0; i< numWalls; i++)
        {
           System.out.println("Adding wall made out of"+WallMaterial);
            house.addWall(new Wall(WallMaterial));
        }
        return this;
    }

    public HouseBuilder addWindows()
    {
        for (int i = 0; i<numWindows; i++)
        {
            System.out.println("Adding Window made out of"+ windowMaterial);
            house.addWindow(new Window(windowMaterial));
        }
        return this;
    }

    public HouseBuilder addRoof()
    {
        house.addRoof(new Roof(roofMaterial));
        return this;
    }

    public House build()
    {
        System.out.println("Nail everything together");
        return house;
    }
}