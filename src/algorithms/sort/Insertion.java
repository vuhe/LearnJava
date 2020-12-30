package algorithms.sort;

/**
 * @author zhuhe
 */
public class Insertion<T extends Comparable<? super T>> extends BaseExample<T> {

    public Insertion(T[] array) {
        super(array);
    }

    @Override
    public void sort() {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            T t = array[i];
            int j = i - 1;
            for (; j >= 0 && less(t, array[j]); j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = t;
        }
    }
}
