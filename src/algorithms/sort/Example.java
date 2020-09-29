package algorithms.sort;

import java.util.Arrays;

public abstract class Example<T extends Comparable<? super T>> {

    protected T[] array;

    protected Example(T[] array) {
        this.array = Arrays.copyOf(array, array.length);
    }

    public abstract void sort();

    protected boolean less(T v, T w) {
        return v.compareTo(w) < 0;
    }

    protected void exchange(int i, int j) {
        T t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    protected void show() {
        System.out.println(Arrays.deepToString(array));
    }

    protected boolean isSorted() {
        if (array.length <= 1) {
            return true;
        }
        for (int i = 1; i < array.length; i++) {
            if (less(array[i], array[i - 1])) {
                return false;
            }
        }
        return true;
    }

    public void test() {
        sort();
        assert isSorted();
        show();
    }

    public T[] getArray() {
        return array;
    }
}
