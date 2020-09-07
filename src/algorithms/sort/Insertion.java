package algorithms.sort;

public class Insertion<T extends Comparable<? super T>> extends Example<T> {

    public Insertion(T[] array) {
        super(array);
    }

    @Override
    public void sort() {
        int N = array.length;
        for (int i = 1; i < N; i++) {
            T t = array[i];
            int j = i - 1;
            for (; j >= 0 && less(t, array[j]); j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = t;
        }
    }
}
