package Grupparbete;

import java.util.ArrayList;
import java.util.List;

public class MyArray<T>
{
    private List<T> elements = new ArrayList<>();

    public void add(T element)
    {
        elements.add(element);
    }

    public T remove(int index)
    {
        return elements.remove(index);
    }

    public T get(int index)
    {
        return elements.get(index);
    }

    public void clear()
    {
        elements.clear();
    }
}