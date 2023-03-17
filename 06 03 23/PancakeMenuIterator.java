import java.util.ArrayList;

public class PancakeMenuIterator implements Iterator {
    ArrayList items;
    int position = 0;

    public PancakeMenuIterator(ArrrayList items)
    {
        this.items = item;
    }

    public boolean hasNext()
    {
        if (position >= items.size())
        {
            return false;
        }
        return true;
    }

    public Object next()
    {
        MenuItem menuItem = (MenuItem)items.get(position);
        position++;
        return menuItem;
    }
}