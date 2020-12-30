package algorithms.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhuhe
 */
public class MergeBu<T extends Comparable<? super T>> extends BaseExample<T> {

    protected List<T> aux;

    public MergeBu(T[] array) {
        super(array);
        aux = new ArrayList<>(List.of(array));
    }

    @Override
    public void sort() {
        int n = array.length;
        for (int sz = 1; sz < n; sz = sz + sz) {
            for (int low = 0; low < n - sz; low += sz + sz) {
                merge(low, low + sz - 1, Math.min(low + sz + sz -1, n -1));
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
