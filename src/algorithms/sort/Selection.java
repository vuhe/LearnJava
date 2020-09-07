package algorithms.sort;

public class Selection<T extends Comparable<? super T>> extends Example<T> {

    public Selection(T[] array) {
        super(array);
    }

    @Override
    public void sort() {
        int N = array.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (less(array[j], array[min])) {
                    min = j;
                }
            }
            exchange(i, min);
        }
    }
}
