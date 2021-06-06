import java.util.Iterator;

public class Randoms implements Iterable<Integer> {

    int min;
    int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getNumber() {
        int difference = this.max - this.min;
        return (int) (Math.random() * ++difference) + this.min;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomsIterator(this);
    }
}
