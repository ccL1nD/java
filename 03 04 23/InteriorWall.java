class InteriorWall extends Wall
{
    public InteriorWall(String material)  
    {
        super(material);
        this.name = "Interior wall made out of" + material;
    }
}