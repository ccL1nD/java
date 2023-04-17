import java.util.ArrayList;

public class PancakeMenuIterator implements Iterator
{
    ArrayList Items;
    int position = 0;

    public PancakeMenuIterator (ArrayList Items)
    {
        this.Items = Items;
    }

    public Object next()
    {
        MenuItem menuItem = (MenuItem) Items.get(position);
        position = position +1;
        return menuItem;
    }

    public boolean hasNext()
    {
        if (position >= Items.size() || Items.get(position) == null)
        {
            return false;
        }
        else{
            return true;
        }
    }
}