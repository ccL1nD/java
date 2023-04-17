class Wall
{
    public String name;
    String material;

    public Wall(String material17)
    {
        this.name = "Wall made out of"+ material;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public  String ToString()
    {
        return this.name;
    }
}