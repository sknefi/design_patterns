package iterator;

public interface Iterator<T> {
    T           current();
    void        gotoNext();
    void        writeCurr();
    boolean     hasNext();
}
