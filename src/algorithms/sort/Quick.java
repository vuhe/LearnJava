package algorithms.sort;

import java.util.Random;

public class Quick<T extends Comparable<? super T>> extends Example<T> {
    private static final long seed = System.currentTimeMillis();
    private static final Random random = new Random(seed);

    public Quick(T[] array) {
        super(array);
    }

    @Override
    public void sort() {
        shuffle(array);
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

    private void shuffle(Object[] a) {
        if (a == null) {
            throw new IllegalArgumentException("argument is null");
        }
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int r = i + random.nextInt(n - i);     // between i and n-1
            Object temp = a[i];
            a[i] = a[r];
            a[r] = temp;
        }
    }

}
