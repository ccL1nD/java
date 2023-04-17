class Main
{
    public static void main(String[] args)
    {
        HouseBuilder  woodHouseBuilder = new WoodHouseBuilder();
        House woodHouse = woodHouseBuilder.addWalls().addWindows().addRoof().build();
        System.out.println(woodHouse);
        System.out.println("-----------------------------\n");
		
		HouseBuilder  stoneHouseBuilder = new StoneHouseBuilder();
        House clayHouse = stoneHouseBuilder.addWalls().addWindows().addRoof().build();
        System.out.println(clayHouse);
        System.out.println("-----------------------------\n");

        HouseBuilder  gingerbreadHouseBuilder = new GingerbreadHouseBuilder();
        House gingerbreadHouse = gingerbreadHouseBuilder.addWalls().addWindows().addRoof().build();
        System.out.println(gingerbreadHouse);
    }
}