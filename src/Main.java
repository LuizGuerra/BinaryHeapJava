public class Main {

    public static void main(String[] args) {

        // this is an example to how to use the class
        MaxPQ<Integer> maxPQ = new MaxPQ<>(10);
        for (int i = 0; i <  10; i ++) {
            maxPQ.insert(i+1);
        }

        // I've maded an toString mathod, so you can check how is the things inside. :D
        // Don't forget that the position zero in the array is null! (at least that's how my teacher teached me)
        System.out.println(maxPQ.toString());
    }

}
