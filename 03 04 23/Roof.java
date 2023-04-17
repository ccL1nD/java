class Roof
{
    public String name;
    String material;

    public Roof(String material17)
    {
        this.name = "Roof made out of"+ material;
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