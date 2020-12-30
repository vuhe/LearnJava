package algorithms.sort;

/**
 * @author zhuhe
 */
public class Selection<T extends Comparable<? super T>> extends BaseExample<T> {

    public Selection(T[] array) {
        super(array);
    }

    @Override
    public void sort() {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (less(array[j], array[min])) {
                    min = j;
                }
            }
            exchange(i, min);
        }
    }
}
