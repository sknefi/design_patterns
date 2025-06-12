package iterator;

public class TestCollection {
    public static void  test()
    {
        String[]            text = {"Apple", "Banana", "Melon"};
        Collection<String>  c = new Collection<>(text);
        Iterator<String>    itr = c.iterator();

        while (itr.hasNext()) {
            itr.writeCurr();
            itr.gotoNext();
        }
    }
}
