package iterator;

public class Collection<T> {
    private T[]     items;

    @SafeVarargs
    public      Collection(T... items)
    {
        this.items = items;
    }

    public CollectionIterator iterator()
    {
        return (new CollectionIterator());
    }

    private class CollectionIterator implements Iterator<T>
    {
        private int     i = 0;

        public T        current()
        {
            return (items[i]);
        }

        public void     gotoNext()
        {
            i++;
        }

        public boolean  hasNext()
        {
            return (i < items.length);
        }

        public void     writeCurr()
        {
            System.out.println(items[i]);
        }
    }
}
