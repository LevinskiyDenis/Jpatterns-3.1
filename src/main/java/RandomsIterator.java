import java.util.Iterator;
import java.util.function.Consumer;

public class RandomsIterator implements Iterator<Integer> {

    Randoms randoms;

    public RandomsIterator(Randoms randoms) {
        this.randoms = randoms;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        return randoms.getNumber();
    }

}
