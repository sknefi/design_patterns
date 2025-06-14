package iterator;

// Iterating through the array (collection) of strings, I used data type T, so the collection
// doesnt have to be only String collection, in iterator is implemented hasNext() which is checking
// if we are in the range of array <0, n), if yes then it writes current element - writeCurr(), and
// then it moves to the other one gotoNext() 
public class TestIterator {
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
