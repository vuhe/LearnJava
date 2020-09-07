package algorithms.sort;

import edu.princeton.cs.algs4.StdRandom;

public class Quick<T extends Comparable<? super T>> extends Example<T> {

    public Quick(T[] array) {
        super(array);
    }

    @Override
    public void sort() {
        StdRandom.shuffle(array);
        sort(0, array.length - 1);
    }

    protected void sort(int low, int high) {
        if (high <= low) {
            return;
        }
        int j = partition(low, high);
        sort(low, j - 1);
        sort(j + 1, high);
    }

    private int partition(int low, int high) {
        int i = low;
        int j = high + 1;
        T v = array[low];
        while (true) {
            while (less(array[++i], v)) {
                if (i == high) {
                    break;
                }
            }
            while (less(v, array[--j])) {
                if (j == low) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            exchange(i, j);
        }
        exchange(low, j);
        return j;
    }

}
