package algorithms.sort;

/**
 * @author zhuhe
 */
public class Shell<T extends Comparable<? super T>> extends BaseExample<T> {

    public Shell(T[] array) {
        super(array);
    }

    @Override
    public void sort() {
        int n = array.length;
        int h = 1;
        while (h < n / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < n; i++) {
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
