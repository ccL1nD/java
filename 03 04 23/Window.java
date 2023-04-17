class Window
{
    public String name;
    String material;

    public Window(String material17)
    {
        this.name = "Window made out of"+ material;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String ToString()
    {
        return this.name;
    }
}