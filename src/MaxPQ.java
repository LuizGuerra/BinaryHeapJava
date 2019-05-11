public class MaxPQ < Key extends Comparable<Key> > {

    private Key [] pq;
    private int size;

    // constructor
    public MaxPQ (int capacity) {
        pq = (Key[]) new Comparable [capacity + 1];
        size = 0;
    }

    // PQ ops
    public Boolean isEmpty () {
        return size == 0;
    }

    public void insert (Key key) {

    }

    public Key delMax() {
        return null;
    }

    // heap helper funcions
    private void swim (Integer k) {

    }

    private void sink (Integer k) {

    }

    // array helper functions
    private boolean less (Integer i, Integer j) {
        return false;
    }

    private void exchange (Integer i, Integer k) {

    }



}
