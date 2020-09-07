package algorithms.sort;

public class Quick3way<T extends Comparable<? super T>> extends Quick<T> {

    public Quick3way(T[] array) {
        super(array);
    }

    @Override
    protected void sort(int low, int high) {
        if (high <= low) {
            return;
        }
        int lt = low;
        int i = low + 1;
        int gt = high;
        T v = array[low];
        while (i <= gt) {
            int cmp = array[i].compareTo(v);
            if (cmp < 0) {
                exchange(lt++, i++);
            } else if (cmp > 0) {
                exchange(i, gt--);
            } else {
                i++;
            }
        }
        sort(low, lt -1);
        sort(gt + 1, high);
    }
}
