public class MaxPQ < Key extends Comparable<Key> > {

    private Key [] pq;
    private Integer n;
    private Integer maxSize;

    // constructor
    public MaxPQ (int capacity) {
        this.pq = (Key[]) new Comparable [capacity + 1];
        this.n = 0;
    }

    // PQ ops
    public Boolean isEmpty () {
        return this.n == 0;
    }

    public void insert (Key key) {
        this.pq[++n] = key;
        swim(n);
    }

    public Key delMax() {
        Key max = this.pq[1];
        exchange(1, n--);
        this.pq[n] = null;
        sink(1);
        return max;
    }

    // heap helper functions
    private void swim (Integer k) {
        while (k > 1 && less(k/2, k)) {
            exchange(k, k/2);
            k = k/2;
        }
    }

    private void sink (Integer k) {
        while (k*2 <= n) {
            int j = 2*k;
            if ( j < n && less(j, j+1)) { j++; }
            if ( !less(k, j) ) { break; }
            exchange(k, j);
            k = j;
        }
    }

    // array helper functions
    private boolean less (Integer i, Integer j) {
        return this.pq[i].compareTo(this.pq[j]) < 0;
    }

    private void exchange (Integer i, Integer j) {
        Key key = this.pq[i];
        this.pq[i] = this.pq[j];
        this.pq[j] = key;
    }

    @Override
    public String toString () {
        String toString = "";
        for (int i = 0; i <= this.n; i++) {
            toString += "Position " + i + ": " + this.pq[i];
            if (i != this.n ) { toString += "\n"; }
        }
        return toString;
    }

}
