package Utils;

/**
 * Created by Cody on 2016-07-17.
 */
public class Counter {
    private int counter;

    public Counter() {
        this.counter = 0;
    }

    public Counter increment() {
        this.counter++;
        return this;
    }

    public int getCount() {
        return this.counter;
    }
}
