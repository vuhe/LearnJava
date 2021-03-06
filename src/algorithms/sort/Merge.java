package algorithms.sort;

/**
 * @author zhuhe
 */
public class Merge<T extends Comparable<? super T>> extends MergeBu<T> {

    public Merge(T[] array) {
        super(array);
    }

    @Override
    public void sort() {
        sort(0, array.length - 1);
    }

    private void sort(int low, int high) {
        if (high <= low) {
            return;
        }
        int mid = low + (high - low) / 2;
        sort(low, mid);
        sort(mid + 1, high);
        merge(low, mid, high);
    }
}
