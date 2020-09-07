package algorithms.sort;

import java.util.ArrayList;
import java.util.List;

public class MergeBU<T extends Comparable<? super T>> extends Example<T> {

    protected List<T> aux;

    public MergeBU(T[] array) {
        super(array);
        aux = new ArrayList<>(List.of(array));
    }

    @Override
    protected void sort() {
        int N = array.length;
        for (int sz = 1; sz < N; sz = sz + sz) {
            for (int low = 0; low < N - sz; low += sz + sz) {
                merge(low, low + sz - 1, Math.min(low + sz + sz -1, N -1));
            }
        }
    }

    protected void merge(int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        for (int k = low; k <= high; k++) {
            aux.set(k, array[k]);
        }
        for (int k = low; k <= high; k++) {
            if (i > mid) {
                array[k] = aux.get(j++);
            } else if (j > high) {
                array[k] = aux.get(i++);
            } else if (less(aux.get(j), aux.get(i))) {
                array[k] = aux.get(j++);
            } else {
                array[k] = aux.get(i++);
            }
        }
    }
}
