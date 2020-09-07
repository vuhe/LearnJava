package algorithms.sort;

public class Shell<T extends Comparable<? super T>> extends Example<T> {

    public Shell(T[] array) {
        super(array);
    }

    @Override
    protected void sort() {
        int N = array.length;
        int h = 1;
        while (h < N / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                T t = array[i];
                int j = i - h;
                for (; j >= 0 && less(t, array[j]); j -= h) {
                    array[j + h] = array[j];
                }
                array[j + h] = t;
            }
            h /= 3;
        }
    }
}
