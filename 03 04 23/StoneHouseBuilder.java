class StoneHouseBuilder extends HouseBuilder
{
    int numWalls = 5;
    int numWindows = 20;
    String windowMaterial = "Antique glass";
    String WallMaterial = "Stone 2 feet thick";
    String interiorWallMaterial = "Stone, 1 foot thick";
    String roofMaterial = "Tile";

    public StoneHouseBuilder()
    {
        this.builderName = "Stone House Builder";
        setHouseType(HouseType.STONE);

    }

    public HouseBuilder addWalls()
    {
        for (int i = 0; i<numWalls - 1; i++)
        {
            house.addWall(new Wall(interiorWallMaterial));
        }
        house.addWall(new InteriorWall(WallMaterial));
        return this;
    }

    public HouseBuilder addWindows()
    {
        for (int i = 0; i<numWindows; i++)
        {
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
        System.out.println("Stick everything together with mortar");
        return house;
    }
}